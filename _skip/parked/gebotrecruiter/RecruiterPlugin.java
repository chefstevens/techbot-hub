package net.runelite.client.plugins.microbot.gebotrecruiter;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.microbot.PluginConstants;
import net.runelite.client.ui.overlay.OverlayManager;

import javax.inject.Inject;

@PluginDescriptor(
        name = PluginDescriptor.Bee + "Clan Recruiter",
        description = "Recruits people at GE to your clan",
        tags = {"recruit", "clan", "type", "keyboard", "typer","Auto-typer", "microbot"},
        authors = { "Bee" },
        version = RecruiterPlugin.version,
        minClientVersion = "2.0.7",
        cardUrl = "https://chsami.github.io/Microbot-Hub/RecruiterPlugin/assets/card.jpg",
        iconUrl = "https://chsami.github.io/Microbot-Hub/RecruiterPlugin/assets/icon.jpg",
        enabledByDefault = PluginConstants.DEFAULT_ENABLED,
        isExternal = PluginConstants.IS_EXTERNAL
)
@Slf4j
public class RecruiterPlugin extends Plugin {
    final static String version = "1.0.3";
    @Inject
    private RecruiterConfig config;

    @Inject
    private EventBus eventBus;

    @Provides
    RecruiterConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(RecruiterConfig.class);
    }

    @Inject
    private OverlayManager overlayManager;

    @Inject
    private RecruiterOverlay recruiterOverlay;

    @Inject
    private RecruiterScript recruiterScript;

    @Override
    protected void startUp() throws Exception {
        if (overlayManager != null) {
            overlayManager.add(recruiterOverlay);
        }
        recruiterScript.run(config);
        eventBus.register(this);  // Register for events
        log.info("Recruiter Plugin started!");
    }

    @Override
    protected void shutDown() {
        recruiterScript.shutdown();
        overlayManager.remove(recruiterOverlay);
        eventBus.unregister(this);  // Unregister events
        log.info("Recruiter Plugin stopped!");
    }

    /**
     * This method disables the "Walk here" option in the menu for all tiles.
     */
    @Subscribe
    public void onMenuOptionClicked(MenuOptionClicked event) {
        // Disable the "Walk here" option for all clicks
        if (event.getMenuOption().equalsIgnoreCase("Walk here")) {
            log.info("Disabling 'Walk here' option globally.");
            event.consume();  // Consume the event to prevent the player from walking
        }
    }
}