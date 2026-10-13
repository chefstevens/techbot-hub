package net.runelite.client.plugins.microbot.chaosaltar;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigInformation;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("chaosaltar")
@ConfigInformation("  For best results:<br>\n" +
        "    - Activate Player Monitor in LITE_MODE<br>\n" +
        "    - Enable AutoLogin<br>\n" +
        "    - Keep Burning Amulets and dragon bones in the bank<br>\n" +
        "    - ONLY WORKS WITH Dragon Bones<br>\n" +
        "    - If you have an alt, consider teleporting to the Lava Maze spot first to distract PKers or bots who can auto-attack when you teleport<br>\n" +
        "    (Note: Microbot currently can't log out fast enough for when someone is waiting for you after teleport)\n")
public interface ChaosAltarConfig extends Config {

    @ConfigItem(
            keyName = "f2pHop",
            name = "Enable F2P Hop",
            description = "Hops to F2P worlds and runs to the altar instead of using Burning Amulet. (WIP - non-functional)"
    )
    default boolean f2pHop() {
        return false;
    }

    @ConfigItem(
            keyName = "Boneyard",
            name = "Enable Boneyard Mode",
            description = "Collects bones from boneyard and uses them on chaos altar(WIP - non-functional)"
    )
    default boolean boneYardMode() {
        return false;
    }

    @ConfigItem(
            keyName = "Fast Bones Offering",
            name = "Offer Bones Fast",
            description = "Uses the bones on the altar quickly (more apm)"
    )
    default boolean giveBonesFast() {
        return false;
    }

}
