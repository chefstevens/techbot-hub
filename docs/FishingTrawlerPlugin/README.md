# Fishing Trawler Plugin

The **Fishing Trawler Plugin** is an automation tool for Old School RuneScape, designed to efficiently complete the Fishing Trawler minigame. Built for the Microbot RuneLite client, this plugin streamlines the process of participating in the minigame, managing repairs, bailing water, and collecting rewards, allowing for hands-free and optimized Fishing experience and loot.

---

## Features

- **Automated Minigame Participation:**  
  Automatically boards the trawler, repairs leaks, bails water, and keeps the boat afloat throughout the minigame.

- **Inventory and Resource Management:**  
  Ensures you have the required items (such as swamp paste, bailing buckets, and rope), manages inventory space, and collects rewards at the end of each game.

- **Overlay Display:**  
  Real-time overlay shows current status, actions performed, minigame progress, and other useful stats.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as overlay preferences and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of supplies, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Adjust settings in the plugin panel to match your preferences.

2. **Startup:**  
   The plugin checks for required items and inventory space. If needed, it will bank for supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Boards the Fishing Trawler
    - Repairs leaks and holes in the boat
    - Bails water to prevent sinking
    - Collects rewards at the end of the minigame
    - Repeats the process for continuous games

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Repairing", "Bailing Water", "Collecting Rewards")
    - Minigame progress
    - Actions performed
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`FishingTrawlerConfig`) where you can:

- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Fishing level to participate in Fishing Trawler
- Required items (swamp paste, bailing bucket, rope) in the bank/inventory
- Access to Port Khazard

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Fishing Trawler Plugin, and enable it.

2. **Configure Settings:**  
   Adjust your preferences in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated Fishing Trawler games.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports the Fishing Trawler minigame as defined in the script logic.
- Requires the player to have the necessary items and skill levels.
- May not handle all random events or interruptions (e.g., player death, disconnections).

---

## Source Files

- `FishingTrawlerPlugin.java` – Main plugin class, manages lifecycle and integration.
- `FishingTrawlerScript.java` – Core automation logic for Fishing Trawler.
- `FishingTrawlerConfig.java` – User configuration options.
- `FishingTrawlerOverlay.java` – In-game overlay display.

---

**Automate your Fishing Trawler games and maximize your Fishing experience and rewards with the Fishing Trawler Plugin!**