package net.runelite.client.plugins.microbot.sailing.features.trials.debug;

import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.microbot.sailing.features.trials.data.Directions;

import java.util.Set;

public class TickMovementData {
    public int Tick;
    public WorldPoint StartPosition;
    public Directions StartHeading;
    public Set<WorldPoint> PointsVisited;

    public TickMovementData(int tick, WorldPoint startPosition, Directions startHeading, Set<WorldPoint> pointsVisited) {
        Tick = tick;
        StartPosition = startPosition;
        StartHeading = startHeading;
        PointsVisited = pointsVisited;
    }
}
