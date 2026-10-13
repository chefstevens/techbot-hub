package net.runelite.client.plugins.microbot.thieving;

import net.runelite.client.plugins.microbot.Microbot;
import net.runelite.client.plugins.microbot.api.npc.models.Rs2NpcModel;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayUtil;

import javax.inject.Inject;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Shape;

/**
 * Draws a simple outline/label on the current thieving target NPC.
 */
public class ThievingNpcOverlay extends Overlay {
    private static final Color TARGET_COLOR = new Color(0, 200, 60, 140);

    private final ThievingPlugin plugin;

    @Inject
    ThievingNpcOverlay(ThievingPlugin plugin) {
        this.plugin = plugin;
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        setNaughty();
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        final Rs2NpcModel npc = plugin.getThievingScript().getThievingNpc();
        if (npc == null) return null;

        // Compute on client thread to avoid cross-thread actor access issues.
        final Shape hull = Microbot.getClientThread().runOnClientThreadOptional(npc::getConvexHull).orElse(null);
        if (hull == null) return null;

        OverlayUtil.renderPolygon(graphics, hull, TARGET_COLOR);

        final String label = plugin.getThievingScript().getThievingNpcName();
        Microbot.getClientThread().runOnClientThreadOptional(() -> npc.getCanvasTextLocation(graphics, label, npc.getLogicalHeight() + 40))
                .ifPresent(point -> OverlayUtil.renderTextLocation(graphics, point, label, Color.WHITE));

        return null;
    }
}
