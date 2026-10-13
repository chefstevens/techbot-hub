package net.runelite.client.plugins.microbot.sailing.features.trials.overlay;

import net.runelite.api.Client;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.microbot.sailing.SailingConfig;
import net.runelite.client.plugins.microbot.sailing.features.trials.BoatLocation;
import net.runelite.client.plugins.microbot.sailing.features.trials.TrialsScript;
import net.runelite.client.plugins.microbot.sailing.features.trials.data.PortalDirection;
import net.runelite.client.plugins.microbot.sailing.features.trials.data.TrialRoute;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayLayer;
import net.runelite.client.ui.overlay.OverlayPosition;

import javax.inject.Inject;
import java.awt.*;
import java.util.List;

public class TrialRouteOverlay extends Overlay {

    private static final int MAX_WAYPOINTS_TO_RENDER = 15;
    private static final Color LINE_COLOR = new Color(0, 255, 128, 180);
    private static final Color NEXT_WAYPOINT_COLOR = new Color(255, 255, 0, 220);
    private static final Color WAYPOINT_COLOR = new Color(0, 200, 255, 150);
    private static final Color PORTAL_COLOR = new Color(255, 100, 255, 200);

    private final Client client;
    private final SailingConfig config;
    private final TrialsScript trialsScript;

    @Inject
    public TrialRouteOverlay(Client client, SailingConfig config, TrialsScript trialsScript) {
        super();
        setPosition(OverlayPosition.DYNAMIC);
        setLayer(OverlayLayer.ABOVE_SCENE);
        this.client = client;
        this.config = config;
        this.trialsScript = trialsScript;
    }

    @Override
    public Dimension render(Graphics2D graphics) {
        if (client == null || graphics == null) {
            return null;
        }

        if (!config.showTrialRoute()) {
            return null;
        }

        var player = client.getLocalPlayer();
        if (player == null) {
            return null;
        }

        var boatLocation = BoatLocation.fromLocal(client, player.getLocalLocation());
        if (boatLocation == null) {
            return null;
        }

        var route = trialsScript.getActiveTrialRoute();
        if (route == null) {
            return null;
        }
        var routePoints = route.getInterpolatedPoints();
        if (routePoints == null || routePoints.isEmpty()) {
            return null;
        }

        var visiblePoints = trialsScript.getVisibleActiveLineForPlayer(boatLocation, MAX_WAYPOINTS_TO_RENDER);
        if (visiblePoints == null || visiblePoints.isEmpty()) {
            return null;
        }

        var visibleIndices = trialsScript.getNextUnvisitedIndicesForActiveRoute(MAX_WAYPOINTS_TO_RENDER);
        var portalDirection = trialsScript.getVisiblePortalDirection(route);

        drawRouteLine(graphics, visiblePoints);
        drawWaypoints(graphics, visiblePoints, visibleIndices, route, portalDirection);

        return null;
    }

    private void drawRouteLine(Graphics2D graphics, List<WorldPoint> points) {
        if (points.size() < 2) {
            return;
        }

        graphics.setColor(LINE_COLOR);
        graphics.setStroke(new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        Point previousScreenPoint = null;
        for (var worldPoint : points) {
            var screenPoint = worldPointToScreen(worldPoint);
            if (screenPoint == null) {
                previousScreenPoint = null;
                continue;
            }

            if (previousScreenPoint != null) {
                graphics.drawLine(
                        previousScreenPoint.getX(), previousScreenPoint.getY(),
                        screenPoint.getX(), screenPoint.getY()
                );
            }
            previousScreenPoint = screenPoint;
        }
    }

    private void drawWaypoints(Graphics2D graphics, List<WorldPoint> points, List<Integer> indices, TrialRoute route, PortalDirection portalDirection) {
        var previousStroke = graphics.getStroke();
        graphics.setStroke(new BasicStroke(2f));

        for (int i = 0; i < points.size(); i++) {
            var worldPoint = points.get(i);
            var polygon = getCanvasPolygonForWorldPoint(worldPoint);
            if (polygon == null) {
                continue;
            }

            boolean isNextWaypoint = (i == 0);
            boolean isPortalWaypoint = false;

            if (i < indices.size()) {
                int routeIndex = indices.get(i);
                isPortalWaypoint = isPortalIndex(routeIndex, route);
            }

            if (isPortalWaypoint) {
                graphics.setColor(PORTAL_COLOR);
                graphics.fill(polygon);
                graphics.setColor(Color.WHITE);
                graphics.draw(polygon);

                if (portalDirection != null) {
                    drawPortalLabel(graphics, polygon, portalDirection);
                }
            } else if (isNextWaypoint) {
                graphics.setColor(NEXT_WAYPOINT_COLOR);
                graphics.fill(polygon);
                graphics.setColor(Color.WHITE);
                graphics.draw(polygon);
            } else {
                graphics.setColor(WAYPOINT_COLOR);
                graphics.draw(polygon);
            }
        }

        graphics.setStroke(previousStroke);
    }

    private boolean isPortalIndex(int index, TrialRoute route) {
        if (route.PortalDirections == null || route.PortalDirections.isEmpty()) {
            return false;
        }
        for (var portal : route.PortalDirections) {
            if (route.getInterpolatedIndex(portal.Index) == index) {
                return true;
            }
        }
        return false;
    }

    private void drawPortalLabel(Graphics2D graphics, Polygon polygon, PortalDirection portalDirection) {
        var bounds = polygon.getBounds();
        var textX = bounds.x + bounds.width + 5;
        var textY = bounds.y + (bounds.height / 2) + 5;

        var label = portalDirection.Color.name() + " → " + portalDirection.FirstMovementDirection.name();

        graphics.setColor(Color.BLACK);
        graphics.drawString(label, textX + 1, textY + 1);
        graphics.setColor(PORTAL_COLOR);
        graphics.drawString(label, textX, textY);
    }

    private Point worldPointToScreen(WorldPoint worldPoint) {
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
            var screenPoint = Perspective.localToCanvas(client, localPoint, client.getTopLevelWorldView().getPlane());
            if (screenPoint != null) {
                return screenPoint;
            }
        }
        return null;
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
}
