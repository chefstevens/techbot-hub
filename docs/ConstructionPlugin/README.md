# Construction Plugin

The **Construction Plugin** is an automation tool for Old School RuneScape, designed to efficiently train the Construction skill by automating the process of building and removing furniture in your player-owned house. Built for the Microbot RuneLite client, this plugin streamlines Construction training, allowing for hands-free and optimized experience gains.

---

## Features

- **Automated Construction Training:**  
  Automatically builds and removes furniture (such as chairs, larders, or other objects) in your house for fast Construction XP.

- **Banking and Inventory Management:**  
  Handles withdrawing required planks, nails, and other materials from the bank or butler, and manages your inventory to ensure smooth operation.

- **Overlay Display:**  
  Provides a real-time overlay showing current status, XP gained, number of builds completed, runtime, and other useful statistics.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as which furniture to build, overlay preferences, and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of materials, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the type of furniture to build and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required materials in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script enters a loop where it:
    - Builds the selected furniture at the correct hotspot
    - Removes the furniture to clear the hotspot
    - Repeats the process for continuous XP

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Building", "Removing", "Banking")
    - XP gained
    - Number of builds completed
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`ConstructionConfig`) where you can:

- Select the furniture to build
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Construction level for the selected furniture
- Required materials (planks, nails, etc.) in the bank/inventory or access to a butler
- Access to a player-owned house

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Construction Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired furniture and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated Construction training.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports furniture and activities defined in the script logic.
- Requires the player to have the necessary materials and Construction level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `ConstructionPlugin.java` – Main plugin class, manages lifecycle and integration.
- `ConstructionScript.java` – Core automation logic for Construction training.
- `ConstructionConfig.java` – User configuration options.
- `ConstructionOverlay.java` – In-game overlay display.

### Enums (`enums/`)
- `ConstructionState.java` – Script state management.

---

**Automate your Construction training and maximize your experience gains with the Construction Plugin!**