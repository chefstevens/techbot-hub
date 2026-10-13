package net.runelite.client.plugins.microbot.minnowsfishing;

import net.runelite.client.config.*;

@ConfigGroup(MinnowsConfig.GROUP)
@ConfigInformation("This plugin allows for fully automated minnow fishing at the fishing guild. <br />" +
        "To use this plugin, simply start the script at the minnows fishing platform with a small fishing net in your inventory.")
public interface MinnowsConfig extends Config {
    String GROUP = "Minnows";

    @ConfigSection(
            name = "General",
            description = "General",
            position = 0,
            closedByDefault = false
    )
    String generalSection = "general";
}
