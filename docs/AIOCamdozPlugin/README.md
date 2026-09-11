# AIO Camdozaal Plugin

The **AIO Camdozaal Plugin** is an automation tool for Old School RuneScape, designed to efficiently train skills and perform activities within the Camdozaal area (Giants' Foundry). Built for the Microbot RuneLite client, this plugin streamlines various Camdozaal minigame tasks, including smithing, resource management, and activity loops, allowing for hands-free and optimized experience gains.

---

## Features

- **Automated Camdozaal Activities:**  
  Handles the full process of smithing and minigame tasks in the Camdozaal (Giants' Foundry) area, including interacting with anvils, forges, and other objects.

- **Resource and Inventory Management:**  
  Withdraws required ores, bars, or items from the bank, manages inventory space, and deposits finished products as needed.

- **Overlay Display:**  
  Real-time overlay shows current status, actions performed, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can select activity preferences, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of resources, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select your desired Camdozaal activity and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required materials in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the selected Camdozaal activity, manages inventory, and handles banking as needed.

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Smithing", "Banking")
    - Experience gained
    - Number of items processed
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`AIOCamdozConfig`) where you can:

- Select the Camdozaal activity to automate
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient skill levels for the selected activities
- Required materials (ores, bars, etc.) in the bank/inventory
- Access to the Camdozaal (Giants' Foundry) area

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the AIO Camdozaal Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired activity and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated Camdozaal activities.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports activities defined in the script logic.
- Requires the player to have the necessary materials and skill levels.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `AIOCamdozPlugin.java` – Main plugin class, manages lifecycle and integration.
- `AIOCamdozScript.java` – Core automation logic for Camdozaal activities.
- `AIOCamdozConfig.java` – User configuration options.
- `AIOCamdozOverlay.java` – In-game overlay display.

---

**Automate your Camdozaal minigame and maximize your experience gains with the AIO Camdozaal Plugin!**