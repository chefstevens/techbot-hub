package net.runelite.client.plugins.microbot.thieving.npc;

import net.runelite.api.events.ChatMessage;
import net.runelite.client.plugins.microbot.thieving.State;
import net.runelite.client.plugins.microbot.Microbot;
import net.runelite.client.plugins.microbot.thieving.ThievingScript;
import net.runelite.client.plugins.microbot.thieving.enums.ThievingNpc;
import net.runelite.client.plugins.microbot.api.npc.models.Rs2NpcModel;
import net.runelite.client.util.Text;
import net.runelite.client.ui.overlay.components.LineComponent;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.Predicate;
import java.util.List;

/**
 * Wealthy citizen specific behaviour:
 * - Track urchin distraction windows (auto-pickpocket, 100% success)
 * - Handle the post-world-hop sweaty period where no loot is received
 * - Provide a dedicated NPC filter so the main script stays clean
 */
public class WealthyCitizenStrategy implements ThievingNpcStrategy {
    private static final long DISTRACTION_DURATION_MS = 20_000L;
    private static final long SWEATY_DURATION_MS = 15_000L;
    private static final Set<String> URCHINS = Set.of("leo", "julia", "aurelia", "street urchin");

    private volatile long distractionUntil = 0;
    private volatile boolean clickedThisDistraction = false;
    private volatile long sweatyUntil = 0;

    @Override
    public ThievingNpc getNpc() {
        return ThievingNpc.WEALTHY_CITIZEN;
    }

    private String npcName(Rs2NpcModel npc) {
        if (npc == null) return null;
        return Microbot.getClientThread().runOnClientThreadOptional(npc::getName).orElse(null);
    }

    private String interactingName(Rs2NpcModel npc) {
        if (npc == null) return null;
        return Microbot.getClientThread().runOnClientThreadOptional(() -> {
            if (!npc.isInteracting() || npc.getInteracting() == null) return null;
            return npc.getInteracting().getName();
        }).orElse(null);
    }

    @Override
    public Predicate<Rs2NpcModel> npcFilter(ThievingScript script) {
        return npc -> {
            if (npc == null) return false;
            final String name = npcName(npc);
            final String interactor = interactingName(npc);
            if (name == null || interactor == null) return false;
            return "wealthy citizen".equalsIgnoreCase(name) && URCHINS.contains(interactor.toLowerCase());
        };
    }

    @Override
    public State overrideState(ThievingScript script, State currentState) {
        // During distraction we prefer to stay near the current NPC instead of wandering off.
        if (isDistracted() && currentState == State.WALK_TO_START && script.getThievingNpc() != null) {
            return State.PICKPOCKET;
        }
        // If hop would have been selected, just wait near start.
        if (currentState == State.HOP) {
            return State.WALK_TO_START;
        }
        if (!isDistracted() && (currentState == State.PICKPOCKET || currentState == State.WALK_TO_START)) {
            return script.getThievingNpc() == null ? State.WALK_TO_START : State.IDLE;
        }
        return currentState;
    }

    @Override
    public boolean handlePickpocket(ThievingScript script) {
        final long now = System.currentTimeMillis();

        if (now < sweatyUntil) {
            // Interaction is slowed and yields no loot right after hopping; wait it out briefly.
            script.markActionNow();
            script.sleepBriefly(400, 650);
            return true;
        }

        final Rs2NpcModel distractedTarget = getDistractedTarget(script);
        if (distractedTarget != null) {
            // Single click per distraction window; auto-pickpocket handles the rest.
            if (!clickedThisDistraction) {
                distractedTarget.click("Pickpocket");
                clickedThisDistraction = true;
            }
            script.markActionNow();
            // Sleep lightly once; subsequent ticks will just idle while distraction lasts.
            script.sleepBriefly(300, 500);
            return true;
        }

        // Not distracted: skip the default pickpocket call this tick, just wait.
        script.markActionNow();
        script.sleepBriefly(500, 900);
        return true;
    }

    @Override
    public void onChatMessage(ChatMessage event) {
        final String message = Text.removeTags(event.getMessage()).toLowerCase();
        if (message.contains("urchin distract a wealthy citizen")) {
            distractionUntil = System.currentTimeMillis() + DISTRACTION_DURATION_MS;
            clickedThisDistraction = false;
        } else if (message.contains("hands are sweaty and keep dropping the items")) {
            sweatyUntil = System.currentTimeMillis() + SWEATY_DURATION_MS;
        }
    }

    @Override
    public List<LineComponent> overlayLines(ThievingScript script) {
        final List<LineComponent> lines = new ArrayList<>();
        lines.add(LineComponent.builder()
                .left("Mode")
                .right("Wealthy citizen")
                .build());

        final long distractionMs = getDistractionRemainingMs();
        final long sweatyMs = getSweatyRemainingMs();

        lines.add(LineComponent.builder()
                .left("Distracted")
                .right(distractionMs > 0 ? formatSeconds(distractionMs) + " left" : "Waiting")
                .build());

        if (sweatyMs > 0) {
            lines.add(LineComponent.builder()
                    .left("Sweaty cooldown")
                    .right(formatSeconds(sweatyMs) + " left")
                    .build());
        }

        return lines;
    }

    private boolean isDistracted() {
        final boolean active = System.currentTimeMillis() < distractionUntil;
        if (!active) clickedThisDistraction = false;
        return active;
    }

    private boolean isNpcValid(Rs2NpcModel npc) {
        final String name = npcName(npc);
        return npc != null && name != null && !name.isBlank();
    }

    private boolean isDistractedNpc(Rs2NpcModel npc) {
        final String targetName = npcName(npc);
        final String interactor = interactingName(npc);
        return isNpcValid(npc)
                && interactor != null
                && "wealthy citizen".equalsIgnoreCase(targetName)
                && URCHINS.contains(interactor.toLowerCase());
    }

    private long getDistractionRemainingMs() {
        return Math.max(0, distractionUntil - System.currentTimeMillis());
    }

    private long getSweatyRemainingMs() {
        return Math.max(0, sweatyUntil - System.currentTimeMillis());
    }

    private String formatSeconds(long ms) {
        return (ms / 1000) + "s";
    }

    private Rs2NpcModel getDistractedTarget(ThievingScript script) {
        if (!isDistracted()) return null;
        Rs2NpcModel target = script.ensureThievingNpc();
        if (!isDistractedNpc(target)) {
            target = Microbot.getRs2NpcCache().query()
                    .where(npcFilter(script))
                    .nearestOnClientThread();
        }
        return isDistractedNpc(target) ? target : null;
    }
}
