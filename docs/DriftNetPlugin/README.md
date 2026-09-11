# Drift Net Plugin

The **Drift Net Plugin** is an automation tool for Old School RuneScape, designed to efficiently train Hunter and Fishing by automating the drift net fishing minigame at Fossil Island. Built for the Microbot RuneLite client, this plugin streamlines the process of setting up drift nets, herding fish, collecting rewards, and managing inventory, allowing for hands-free and optimized experience gains.

---

## Features

- **Automated Drift Net Fishing:**  
  Automatically sets up drift nets, herds fish into the nets, collects filled nets, and resets them for continuous training.

- **Inventory and Banking Management:**  
  Manages your inventory by depositing fish and collecting new nets as needed, ensuring you always have the required supplies.

- **Overlay Display:**  
  Real-time overlay shows current status, nets filled, fish caught, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as overlay preferences and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of nets, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Adjust settings in the plugin panel to match your preferences.

2. **Startup:**  
   The plugin checks for required drift nets and inventory space. If needed, it will bank for supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Sets up drift nets at the correct locations
    - Herds fish into the nets for maximum efficiency
    - Collects filled nets and resets them
    - Banks or drops fish as needed
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Setting Nets", "Herding Fish", "Collecting Nets", "Banking")
    - Nets filled
    - Fish caught
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`DriftNetConfig`) where you can:

- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Hunter and Fishing levels for drift net fishing
- Required drift nets in the bank/inventory
- Access to Fossil Island underwater area

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Drift Net Plugin, and enable it.

2. **Configure Settings:**  
   Adjust your preferences in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated drift net fishing.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports drift net fishing as defined in the script logic.
- Requires the player to have the necessary supplies and skill levels.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `DriftNetPlugin.java` – Main plugin class, manages lifecycle and integration.
- `DriftNetScript.java` – Core automation logic for drift net fishing.
- `DriftNetConfig.java` – User configuration options.
- `DriftNetOverlay.java` – In-game overlay display.
- `DriftNetStatus.java` – Status tracking and state management.
- `DriftNet.java` – Supporting logic and data structures.

---

**Automate your Hunter and Fishing training and maximize your experience gains with the Drift Net Plugin!**