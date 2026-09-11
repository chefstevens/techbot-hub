# Eel Fishing Plugin

The **Eel Fishing Plugin** is an automation tool for Old School RuneScape, designed to efficiently train Fishing by automating the process of catching various types of eels (such as sacred, lava, or slimy eels) at supported fishing spots. Built for the Microbot RuneLite client, this plugin streamlines fishing, inventory management, and banking, allowing for hands-free and optimized Fishing experience gains.

---

## Features

- **Automated Eel Fishing:**  
  Automatically fishes at supported eel fishing spots, catching the selected type of eel for fast and efficient Fishing XP.

- **Inventory Management:**  
  Drops or banks eels as needed, ensuring continuous fishing without interruptions.

- **Overlay Display:**  
  Real-time overlay shows current status, eels caught, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can select which eel to fish, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of bait, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the type of eel to fish and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required items (fishing rod, bait) and inventory space.

3. **Automation Loop:**  
   The script performs the following:
    - Fishes at the correct spot for the selected eel type
    - Drops or banks eels as needed
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Fishing", "Dropping Eels", "Banking")
    - Eels caught
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`EelFishingConfig`) where you can:

- Select the eel type to fish (see `enums/EelFishingSpot.java` for supported spots)
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Fishing level for the selected eel type
- Required items (fishing rod, bait) in the bank/inventory
- Access to the appropriate eel fishing spot

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Eel Fishing Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired eel type and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated eel fishing.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports eel fishing as defined in the script logic.
- Requires the player to have the necessary items and skill levels.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `EelFishingPlugin.java` – Main plugin class, manages lifecycle and integration.
- `EelFishingScript.java` – Core automation logic for eel fishing.
- `EelFishingConfig.java` – User configuration options.
- `EelFishingOverlay.java` – In-game overlay display.

### Enums (`enums/`)
- `EelFishingSpot.java` – Supported eel fishing spots.

---

**Automate your Fishing training and maximize your experience gains with the Eel Fishing Plugin!**