# Farm Tree Run Plugin

The **Farm Tree Run Plugin** is an automation tool for Old School RuneScape, designed to efficiently manage and complete tree and fruit tree farming runs. Built for the Microbot RuneLite client, this plugin streamlines the process of planting, checking, and harvesting trees across all major farming patches, allowing for hands-free and optimized Farming experience gains.

---

## Features

- **Automated Tree and Fruit Tree Runs:**  
  Automatically travels to all supported tree and fruit tree patches, plants new saplings, checks tree health, and harvests fully grown trees for maximum Farming XP.

- **Patch and Inventory Management:**  
  Withdraws required saplings, tools, and payment items from the bank, manages inventory space, and ensures you have all necessary supplies for a complete run.

- **Overlay Display:**  
  Real-time overlay shows current status, patches completed, trees planted/checked, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can select which tree types and patches to include in their run, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of saplings or payment items, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the types of trees and fruit trees to plant, and which patches to include in your run via the plugin panel.

2. **Startup:**  
   The plugin checks for required saplings, tools, and payment items in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to each selected patch
    - Checks tree health and harvests grown trees
    - Plants new saplings and pays farmers if needed
    - Banks for more supplies when inventory is empty
    - Repeats the process for all selected patches

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Planting", "Checking Health", "Banking")
    - Patches completed
    - Trees planted/checked
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`FarmTreeRunConfig`) where you can:

- Select tree and fruit tree types (see `FarmingItem.java`)
- Choose which patches to include (see `enums/TreeEnums.java`, `FruitTreeEnum.java`, `HardTreeEnums.java`)
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Farming level for the selected trees
- Required saplings, tools, and payment items in the bank/inventory
- Access to all selected farming patches

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Farm Tree Run Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired tree types and patches, and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated tree and fruit tree runs.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports trees, patches, and activities defined in the script logic.
- Requires the player to have the necessary saplings, tools, and Farming level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `FarmTreeRunPlugin.java` – Main plugin class, manages lifecycle and integration.
- `FarmTreeRunScript.java` – Core automation logic for tree runs.
- `FarmTreeRunConfig.java` – User configuration options.
- `FarmTreeRunOverlay.java` – In-game overlay display.
- `FarmingItem.java` – Supported saplings and items.

### Enums (`enums/`)
- `FarmTreeRunState.java` – Script state management.
- `TreeEnums.java` – Supported tree patches.
- `FruitTreeEnum.java` – Supported fruit tree patches.
- `HardTreeEnums.java` – Additional tree patch definitions.

---

**Automate your tree and fruit tree runs and maximize your Farming experience with the Farm Tree Run Plugin!**