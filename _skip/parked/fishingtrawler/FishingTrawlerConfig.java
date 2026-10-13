package net.runelite.client.plugins.microbot.fishingtrawler;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("FishingTrawler")
@ConfigInformation("Chops Tentacles in fishing trawler minigame.< /br>>" +
        " start the script either on the dock outside the minigame or on the upstairs ship level where the tentacles spawn. <br />" +
        " make sure you have an axe on you")
public interface FishingTrawlerConfig extends Config {
    @ConfigItem(
            keyName = "stopat50",
            name = "pause at 50 contribution",
            description = "Pauses the script once you hit 50 contribution (minimum contribution to get chance at outfit). Otherwise, continues to chop the kraken for additional contribution",
            position = 1
    )
    default boolean stopat50() {
        return false;
    }
}
