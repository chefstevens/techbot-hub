# Barbarian Fishing Plugin

The **Barbarian Fishing Plugin** is an automation tool for Old School RuneScape, designed to efficiently train Fishing (and optionally Strength and Agility) by automating the barbarian fishing activity at the Barbarian Outpost. Built for the Microbot RuneLite client, this plugin streamlines the process of catching fish, dropping or banking them, and managing inventory, allowing for hands-free and optimized experience gains.

---

## Features

- **Automated Barbarian Fishing:**  
  Automatically fishes at the Barbarian Outpost, catching leaping fish for fast Fishing, Strength, and Agility XP.

- **Inventory Management:**  
  Drops fish when inventory is full (powerfishing) or banks them if configured, ensuring continuous fishing.

- **Overlay Display:**  
  Real-time overlay shows current status, fish caught, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as overlay preferences and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of bait, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Adjust settings in the plugin panel to match your preferences (e.g., dropping vs. banking fish).

2. **Startup:**  
   The plugin checks for required items (fishing rod, bait) and inventory space.

3. **Automation Loop:**  
   The script performs the following:
    - Fishes at the correct spots using barbarian fishing methods
    - Drops or banks fish as needed
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Fishing", "Dropping Fish", "Banking")
    - Fish caught
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`BarbarianFishingConfig`) where you can:

- Enable or disable the overlay
- Choose between dropping or banking fish
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Fishing level for barbarian fishing
- Required items (barbarian rod, bait) in the bank/inventory
- Access to the Barbarian Outpost fishing area

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Barbarian Fishing Plugin, and enable it.

2. **Configure Settings:**  
   Adjust your preferences in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated barbarian fishing.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports barbarian fishing as defined in the script logic.
- Requires the player to have the necessary items and skill levels.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `BarbarianFishingPlugin.java` – Main plugin class, manages lifecycle and integration.
- `BarbarianFishingScript.java` – Core automation logic for barbarian fishing.
- `BarbarianFishingConfig.java` – User configuration options.
- `BarbarianFishingOverlay.java` – In-game overlay display.

---

**Automate your Fishing, Strength, and Agility training and maximize your experience gains with the Barbarian Fishing Plugin!**