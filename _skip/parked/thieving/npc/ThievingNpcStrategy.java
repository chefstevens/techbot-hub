package net.runelite.client.plugins.microbot.thieving.npc;

import net.runelite.api.events.ChatMessage;
import net.runelite.client.plugins.microbot.thieving.State;
import net.runelite.client.plugins.microbot.thieving.ThievingScript;
import net.runelite.client.plugins.microbot.thieving.enums.ThievingNpc;
import net.runelite.client.plugins.microbot.api.npc.models.Rs2NpcModel;
import net.runelite.client.ui.overlay.components.LineComponent;

import java.util.function.Predicate;
import java.util.Collections;
import java.util.List;

/**
 * Encapsulates NPC-specific behaviour for the thieving script.
 * Implementations can override filtering, state selection, pickpocket handling
 * and react to chat messages without bloating the main script.
 */
public interface ThievingNpcStrategy {
    ThievingNpc getNpc();

    /**
     * Returns the filter used to pick the target NPC when highlights are not set.
     */
    Predicate<Rs2NpcModel> npcFilter(ThievingScript script);

    /**
     * Allow an NPC to adjust the state machine decision.
     */
    default State overrideState(ThievingScript script, State currentState) {
        return currentState;
    }

    /**
     * Hook executed inside the PICKPOCKET state right before the default interaction.
     * Return true to skip the default pickpocket logic for this tick.
     */
    default boolean handlePickpocket(ThievingScript script) {
        return false;
    }

    /**
     * Hook for relaying chat messages relevant to the NPC.
     */
    default void onChatMessage(ChatMessage event) {}

    /**
     * Strategy-specific overlay lines for the main thieving overlay.
     */
    default List<LineComponent> overlayLines(ThievingScript script) {
        return Collections.emptyList();
    }
}
