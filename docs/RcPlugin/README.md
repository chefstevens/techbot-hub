# Frosty RC Plugin

The **Frosty RC Plugin** is an automation tool for Old School RuneScape, designed to efficiently train the Runecrafting skill by automating the process of crafting runes at various altars. Built for the Microbot RuneLite client, this plugin streamlines the process of running to altars, crafting runes, managing inventory, and banking, allowing for hands-free and optimized Runecrafting experience gains.

---

## Features

- **Automated Rune Crafting:**  
  Automatically crafts runes at supported altars, including handling all necessary steps such as entering the altar, crafting, and returning to the bank.

- **Supports Multiple Rune Types:**  
  Users can select which rune to craft (e.g., air, mind, nature, law, etc.) via the configuration panel.

- **Teleport and Travel Management:**  
  Utilizes teleports and efficient travel methods to minimize downtime between runs.

- **Inventory and Banking Management:**  
  Withdraws required essence and items from the bank, manages inventory space, and deposits crafted runes as needed.

- **Overlay Display:**  
  Real-time overlay shows current status, runes crafted, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can select rune type, teleport method, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of essence, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the rune type and teleport method in the plugin panel.

2. **Startup:**  
   The plugin checks for required essence and items in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to the selected altar using the chosen teleport method
    - Crafts runes at the altar
    - Returns to the bank to deposit runes and withdraw more essence
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Crafting", "Banking", "Teleporting")
    - Runes crafted
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`RcConfig`) where you can:

- Select the rune type to craft (see `enums/RuneType.java`)
- Choose teleport methods (see `enums/Teleports.java`)
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Runecrafting level for the selected rune
- Required essence and items in the bank/inventory
- Access to the selected altar and teleport methods

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Frosty RC Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired rune type and teleport method, and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated rune crafting.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports rune types and activities defined in the script logic.
- Requires the player to have the necessary essence, items, and Runecrafting level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `RcPlugin.java` – Main plugin class, manages lifecycle and integration.
- `RcScript.java` – Core automation logic for rune crafting.
- `RcConfig.java` – User configuration options.
- `RcOverlay.java` – In-game overlay display.

### Enums (`enums/`)
- `RuneType.java` – Supported rune types.
- `Teleports.java` – Supported teleport methods.
- `State.java` – Script state management.

---

**Automate your Runecrafting training and maximize your experience gains with the Frosty RC Plugin!**