package net.runelite.client.plugins.microbot.sailing.features.trials.debug;

import com.google.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Perspective;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.microbot.sailing.features.trials.overlay.WorldPerspective;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import java.awt.*;
import java.util.Set;

public class BoatPathOverlay extends Overlay {
    private Client client;

    @Inject
    public BoatPathOverlay(Client client) {
        super();
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_WIDGETS);
        this.client = client;
    }

    private static final Set<Color> TickColors = Set.of(
            Color.RED,
            Color.GREEN,
            Color.BLUE,
            Color.YELLOW,
            Color.ORANGE,
            Color.CYAN);

    public BoatPathOverlay() {
        super();
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (client == null || graphics == null) {
            return null;
        }

        if (client.getGameState() != GameState.LOGGED_IN || client.getTickCount() <= 0 || TickColors.isEmpty()) {
            return null;
        }

        var tickColorOrder = TickColors.toArray(new Color[0]);

        var currentTick = client.getTickCount();
        var ticksToRender = 6;

        for (var offset = 0; offset < ticksToRender; offset++) {
            var targetTick = currentTick - offset;
            if (targetTick < 0) {
                continue;
            }

            var tickData = BoatPathHelper.GetTickData(targetTick);
            if (tickData == null || tickData.PointsVisited == null || tickData.PointsVisited.isEmpty()) {
                continue;
            }

            var outlineColor = tickColorOrder[offset % tickColorOrder.length];
            var insetEvenTicks = (tickData.Tick % 2) == 0;
            drawVisitedTileOutlines(graphics, tickData, outlineColor, insetEvenTicks);
        }

        return null;
    }

    private void drawVisitedTileOutlines(Graphics2D graphics, TickMovementData tickData, Color outlineColor, boolean insetOutline) {
        if (tickData == null || tickData.PointsVisited == null || tickData.PointsVisited.isEmpty()) {
            return;
        }

        var previousStroke = graphics.getStroke();
        graphics.setStroke(new BasicStroke(2f));
        graphics.setColor(outlineColor);

        for (var visitedPoint : tickData.PointsVisited) {
            if (visitedPoint == null) {
                continue;
            }

            var tilePolygon = getCanvasPolygonForWorldPoint(visitedPoint);
            if (tilePolygon != null) {
                if (insetOutline) {
                    var insetPolygon = insetPolygon(tilePolygon);
                    if (insetPolygon != null) {
                        tilePolygon = insetPolygon;
                    }
                }
                graphics.draw(tilePolygon);
            }
        }

        graphics.setStroke(previousStroke);
    }

    private Polygon getCanvasPolygonForWorldPoint(WorldPoint worldPoint) {
        if (worldPoint == null) {
            return null;
        }

        var localPoints = WorldPerspective.getInstanceLocalPointFromReal(client, worldPoint);
        if (localPoints.isEmpty()) {
            return null;
        }

        for (var localPoint : localPoints) {
            if (localPoint == null) {
                continue;
            }
            var polygon = Perspective.getCanvasTilePoly(client, localPoint);
            if (polygon != null) {
                return polygon;
            }
        }

        return null;
    }

    private Polygon insetPolygon(Polygon polygon) {
        if (polygon == null) {
            return polygon;
        }

        var centerX = 0;
        var centerY = 0;
        var nPoints = polygon.npoints;
        if (nPoints == 0) {
            return polygon;
        }

        for (var i = 0; i < nPoints; i++) {
            centerX += polygon.xpoints[i];
            centerY += polygon.ypoints[i];
        }
        centerX /= nPoints;
        centerY /= nPoints;

        var insetPoly = new Polygon();
        for (var i = 0; i < nPoints; i++) {
            var dx = polygon.xpoints[i] - centerX;
            var dy = polygon.ypoints[i] - centerY;
            var distance = Math.hypot(dx, dy);
            if (distance == 0) {
                continue;
            }
            var scale = Math.max((distance - 3) / distance, 0);
            var newX = (int) Math.round(centerX + dx * scale);
            var newY = (int) Math.round(centerY + dy * scale);
            insetPoly.addPoint(newX, newY);
        }

        return insetPoly.npoints > 0 ? insetPoly : polygon;
    }
}
