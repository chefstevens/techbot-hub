package net.runelite.client.plugins.microbot.woodcutting.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.Skill;
import net.runelite.api.ItemID;
import net.runelite.client.plugins.microbot.util.player.Rs2Player;


@Getter
@RequiredArgsConstructor
public enum WoodcuttingTree {
    TREE("tree" , "Logs", ItemID.LOGS, 1, "Chop down"),
    TIRANNWN_TREE("tree", "Logs", ItemID.LOGS, 1, "Chop down"),
    DYING_TREE("dying tree", "Logs", ItemID.LOGS, 1, "Chop down"),
    BURNT_TREE("burnt tree", "Charcoal", ItemID.CHARCOAL, 1, "Chop down"),
    JUNGLE_TREE("jungle tree", "Logs", ItemID.LOGS, 1, "Chop down"),
    ACHEY_TREE("achey tree", "Achey tree logs", ItemID.ACHEY_TREE_LOGS, 1, "Chop down"),
    LIGHT_JUNGLE("light jungle", "Thatch spar light", ItemID.THATCH_SPAR_LIGHT, 10, "Chop down"),
    OAK("oak tree", "Oak logs", ItemID.OAK_LOGS,15, "Chop down"),
    MEDIUM_JUNGLE("medium jungle", "Thatch spar med", ItemID.THATCH_SPAR_MED, 20, "Chop down"),
    WILLOW("willow tree", "Willow logs", ItemID.WILLOW_LOGS, 30, "Chop down"),
    TEAK_TREE("teak tree", "Teak logs", ItemID.TEAK_LOGS, 35, "Chop down"),
    DENSE_JUNGLE("dense jungle", "Thatch spar dense", ItemID.THATCH_SPAR_DENSE, 35, "Chop down"),
    JATOBA_TREE("jatoba tree", "Jatoba logs", ItemID.JATOBA_LOGS, 40, "Chop down"),
    MATURE_JUNIPER("mature juniper tree", "Juniper logs", ItemID.JUNIPER_LOGS, 42, "Chop down"),
    MAPLE("maple tree", "Maple logs", ItemID.MAPLE_LOGS, 45, "Chop down"),
    HOLLOW_TREE("hollow tree", "Bark", ItemID.BARK, 45, "Chop down"),
    MAHOGANY("mahogany tree", "Mahogany logs", ItemID.MAHOGANY_LOGS, 50, "Chop down"),
    ARCTIC_PINE("arctic pine", "Arctic pine logs", ItemID.ARCTIC_PINE_LOGS, 54, "Chop down"),
    YEW("yew tree", "Yew logs", ItemID.YEW_LOGS, 60, "Chop down"),
    BLISTERWOOD("blisterwood tree", "Blisterwood logs", ItemID.BLISTERWOOD_LOGS, 62, "Chop"),
    SULLIUSCEP("sulliuscep", "Sulliuscep cap", ItemID.SULLIUSCEP_CAP, 65, "Chop down"),
    CAMPHOR_TREE("camphor tree", "Camphor logs", ItemID.CAMPHOR_LOGS, 66, "Chop down"),
    MAGIC("magic tree", "Magic logs", ItemID.MAGIC_LOGS, 75, "Chop down"),
    IRONWOOD_TREE("ironwood tree", "Ironwood logs", ItemID.IRONWOOD_LOGS, 80, "Chop down"),
    REDWOOD("redwood tree", "Redwood logs", ItemID.REDWOOD_LOGS, 90, "Cut"),
    ROSEWOOD_TREE("rosewood tree", "Rosewood logs", ItemID.ROSEWOOD_LOGS, 92, "Chop down"),
    EVERGREEN_TREE("evergreen tree" , "Logs", ItemID.LOGS, 1, "Chop down"),
    DEAD_TREE("dead tree" , "Logs", ItemID.LOGS, 1, "Chop down"),
    INFECTED_ROOT("infected root", "Logs", ItemID.LOGS, 80, "Chop");

    private final String name;
    private final String log;
    private final int logID;
    private final int woodcuttingLevel;
    private final String action;

    @Override
    public String toString() {
        if (this == TIRANNWN_TREE) {
            return "tree (tirannwn)";
        }
        return name;
    }

    public boolean hasRequiredLevel() {
        return Rs2Player.getSkillRequirement(Skill.WOODCUTTING, this.woodcuttingLevel);
    }
}
