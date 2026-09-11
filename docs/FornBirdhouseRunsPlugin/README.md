# Birdhouse Runs Plugin

The **Birdhouse Runs Plugin** is an automation tool for Old School RuneScape, designed to efficiently manage and automate birdhouse runs on Fossil Island. Built for the Microbot RuneLite client, this plugin streamlines the process of collecting and setting up birdhouses, making Hunter training and passive profit easier and more efficient.

---

## Features

- **Automated Birdhouse Runs:**  
  Automatically travels to Fossil Island, collects finished birdhouses, and sets up new ones at all birdhouse locations.

- **Inventory and Banking Management:**  
  Withdraws required logs, clockworks, and seeds from the bank, manages inventory space, and ensures you have all necessary items for a complete run.

- **Overlay Display:**  
  Real-time overlay shows current status, number of birdhouses collected/set, run progress, runtime, and other useful stats.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as log type, overlay preferences, and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of materials, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the type of log to use for birdhouses and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required logs, clockworks, and seeds in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to Fossil Island (if not already there)
    - Collects finished birdhouses at all locations
    - Sets up new birdhouses using the selected log type
    - Banks for more supplies if inventory is empty
    - Repeats the process for continuous birdhouse runs

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Collecting", "Setting Up", "Banking")
    - Number of birdhouses collected/set
    - Run progress
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`FornBirdhouseRunsConfig`) where you can:

- Select the log type for birdhouses (see `enums/Log.java` for supported logs)
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Hunter level for the selected birdhouse/log type
- Required logs, clockworks, and seeds in the bank/inventory
- Access to Fossil Island

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Birdhouse Runs Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired log type and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated birdhouse runs.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports birdhouse runs as defined in the script logic.
- Requires the player to have the necessary materials and Hunter level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `FornBirdhouseRunsPlugin.java` – Main plugin class, manages lifecycle and integration.
- `FornBirdhouseRunsScript.java` – Core automation logic for birdhouse runs.
- `FornBirdhouseRunsConfig.java` – User configuration options.
- `FornBirdhouseRunsOverlay.java` – In-game overlay display.
- `FornBirdhouseRunsInfo.java` – Additional info and helper functions.
- `enums/Log.java` – Supported log types for birdhouses.

---

**Automate your birdhouse runs and maximize your Hunter gains and passive profit with the Birdhouse Runs Plugin!**