package net.runelite.client.plugins.microbot.gebotrecruiter;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("recruiter")
@ConfigInformation("Be in a clan and have equipped clan vexelium. Start the Plugin in crowded area (ge 301, ge 302). " +
        "It will invite everyone systematically and send custom message (if you want). < br/ >" +
        "This plugin can also just send a custom message without clan invitation function.<br />")
public interface RecruiterConfig extends Config {
    @ConfigItem(
            keyName = "recruit",
            name = "Recruit clan",
            description = "Enable or disable for clan recruiting."
    )
    default boolean recruit() {
        return false; // Default to disabled
    }

    @ConfigItem(
            keyName = "send message",
            name = "Send message",
            description = "Enable or disable recruitment message."
    )
    default boolean sendMessage() {
        return false; // Default to disabled
    }

    @ConfigItem(
            keyName = "customMessage",
            name = "Custom Clan Invite Message",
            description = "The message to be sent when inviting players to the clan (maximum 80 characters)",
            position = 1
    )

    default String customMessage() {
        return "Hi, My Clan is recruiting! Please Accept Aid on in settings for an invite :)";
    }

}
