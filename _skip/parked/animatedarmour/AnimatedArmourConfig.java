package net.runelite.client.plugins.microbot.animatedarmour;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.plugins.microbot.util.misc.Rs2Food;

@ConfigGroup("animatedarmour")
@ConfigInformation("Reanimates and kills armour in warriors guild, grabs tokens.<br>" +
                "Make sure you have armour (and optionally food) in inventory.<br>" +
                "Turn on auto retaliate and ground items Runelite plugin."
)
public interface AnimatedArmourConfig extends Config {
    @ConfigItem(
            name = "Food",
            keyName = "food",
            position = 1,
            description = "Food fetch from bank"
    )
    default Rs2Food food() {
        return Rs2Food.SALMON;
    }

    @ConfigItem(
            name = "foodAmount",
            keyName = "foodAmount",
            position = 1,
            description = "Food amount to fetch from bank"
    )
    default int foodAmount() {
        return 0;
    }
}
