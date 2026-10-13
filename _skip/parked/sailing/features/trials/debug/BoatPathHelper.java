package net.runelite.client.plugins.microbot.sailing.features.trials.debug;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.plugins.microbot.sailing.features.trials.data.Directions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class BoatPathHelper {
    private static final Map<Integer, TickMovementData> tickDataMap = new HashMap<>();

    public static boolean HasTickData(int tick) {
        return tickDataMap.containsKey(tick);
    }

    public static void StartNewTick(int tick, WorldPoint startPosition, Directions startHeading) {
        //log.info("Starting new tick {}: position {}, heading {}", tick, startPosition, startHeading);
        tickDataMap.put(tick, new TickMovementData(tick, startPosition, startHeading, new java.util.HashSet<>(Set.of(startPosition))));
    }

    public static void AddVisitedPoint(int tick, WorldPoint point) {
        TickMovementData data = tickDataMap.get(tick);
        if (data != null) {
            data.PointsVisited.add(point);
        }
    }

    public static TickMovementData GetTickData(int tick) {
        return tickDataMap.get(tick);
    }

}
