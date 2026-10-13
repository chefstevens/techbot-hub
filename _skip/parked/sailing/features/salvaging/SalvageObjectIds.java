package net.runelite.client.plugins.microbot.sailing.features.salvaging;

import com.google.common.collect.ImmutableMap;
import net.runelite.api.gameval.ObjectID;

import java.util.Map;
import java.util.Set;

public class SalvageObjectIds {

    public static final Map<Integer, Integer> SALVAGE_LEVEL_REQ = ImmutableMap.<Integer, Integer>builder()
            .put(ObjectID.SAILING_SMALL_SHIPWRECK, 15)
            .put(ObjectID.SAILING_FISHERMAN_SHIPWRECK, 26)
            .put(ObjectID.SAILING_BARRACUDA_SHIPWRECK, 35)
            .put(ObjectID.SAILING_LARGE_SHIPWRECK, 53)
            .put(ObjectID.SAILING_PIRATE_SHIPWRECK, 64)
            .put(ObjectID.SAILING_MERCENARY_SHIPWRECK, 73)
            .put(ObjectID.SAILING_FREMENNIK_SHIPWRECK, 80)
            .put(ObjectID.SAILING_MERCHANT_SHIPWRECK, 87)
            .build();

    public static final Map<Integer, Integer> STUMP_LEVEL_REQ = ImmutableMap.<Integer, Integer>builder()
            .put(ObjectID.SAILING_SMALL_SHIPWRECK_STUMP, 15)
            .put(ObjectID.SAILING_FISHERMAN_SHIPWRECK_STUMP, 26)
            .put(ObjectID.SAILING_BARRACUDA_SHIPWRECK_STUMP, 35)
            .put(ObjectID.SAILING_LARGE_SHIPWRECK_STUMP, 53)
            .put(ObjectID.SAILING_PIRATE_SHIPWRECK_STUMP, 64)
            .put(ObjectID.SAILING_MERCENARY_SHIPWRECK_STUMP, 73)
            .put(ObjectID.SAILING_FREMENNIK_SHIPWRECK_STUMP, 80)
            .put(ObjectID.SAILING_MERCHANT_SHIPWRECK_STUMP, 87)
            .build();

    public static final Set<Integer> ACTIVE_SHIPWRECK_IDS = SALVAGE_LEVEL_REQ.keySet();
    public static final Set<Integer> INACTIVE_SHIPWRECK_IDS = STUMP_LEVEL_REQ.keySet();
}
