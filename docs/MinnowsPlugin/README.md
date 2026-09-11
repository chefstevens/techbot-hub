# Minnows Fishing Plugin

The **Minnows Fishing Plugin** is an automation tool for Old School RuneScape, designed to efficiently catch minnows at the Fishing Guild. Built for the Microbot RuneLite client, this plugin streamlines the process of fishing for minnows, managing inventory, and handling moving fishing spots, allowing for hands-free and optimized Fishing experience and profit.

---

## Features

- **Automated Minnow Fishing:**  
  Automatically fishes for minnows at the Fishing Guild, tracking and moving to active minnow spots as they change.

- **Spot Detection and Movement:**  
  Detects when the minnow fishing spot moves and quickly relocates your character to the new spot for continuous fishing.

- **Inventory Management:**  
  Drops or banks fish as needed, ensuring uninterrupted fishing and maximizing inventory efficiency.

- **Overlay Display:**  
  Real-time overlay shows current status, minnows caught, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can enable/disable the overlay and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of bait, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Adjust settings in the plugin panel to match your preferences.

2. **Startup:**  
   The plugin checks for required items (fishing rod, bait) and inventory space.

3. **Automation Loop:**  
   The script performs the following:
    - Fishes at the current minnow spot
    - Detects when the spot moves and follows it
    - Drops or banks fish as needed
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Fishing", "Moving to Spot", "Banking")
    - Minnows caught
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`MinnowsConfig`) where you can:

- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Fishing level (82+) to fish for minnows
- Required items (angler's outfit, fishing rod, bait) in the bank/inventory
- Access to the Fishing Guild and the minnow platform

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Minnows Fishing Plugin, and enable it.

2. **Configure Settings:**  
   Adjust your preferences in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated minnow fishing.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports minnow fishing as defined in the script logic.
- Requires the player to have the necessary items and skill levels.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `MinnowsPlugin.java` – Main plugin class, manages lifecycle and integration.
- `MinnowsScript.java` – Core automation logic for minnow fishing.
- `MinnowsConfig.java` – User configuration options.
- `MinnowsOverlay.java` – In-game overlay display.

---

**Automate your Fishing training and maximize your experience and profit with the Minnows Fishing Plugin!**