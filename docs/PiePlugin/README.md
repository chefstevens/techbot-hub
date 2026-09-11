# Nate Pie Shells Plugin

The **Nate Pie Shells Plugin** is an automation tool for Old School RuneScape, designed to streamline and optimize the process of making pie shells. This plugin is built for the Microbot RuneLite client and provides a hands-free, efficient way to train Cooking and prepare pie shells for further baking or trading.

---

## Features

- **Automated Pie Shell Creation:**  
  The plugin automates the entire process of making pie shells, including withdrawing ingredients, using the range, and banking finished shells.

- **Bank Interaction:**  
  Automatically interacts with the nearest bank to withdraw flour and pastry dough, deposit finished pie shells, and manage inventory.

- **Range Usage:**  
  Navigates to the nearest range, uses pastry dough on the range, and handles all in-game prompts to create pie shells.

- **Overlay Display:**  
  Provides a real-time overlay showing current status, number of pie shells made, runtime, and other useful statistics.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as enabling/disabling the overlay and customizing behavior.

- **Failsafes and Error Handling:**  
  Handles common issues such as running out of ingredients, full inventory, or unexpected in-game events.

---

## How It Works

1. **Startup:**  
   When the plugin is started, it checks the player's inventory and bank for the required ingredients (flour and pastry dough).

2. **Banking:**  
   If ingredients are missing, the plugin will automatically walk to the nearest bank, withdraw the necessary items, and prepare the inventory for pie shell making.

3. **Making Pie Shells:**  
   The plugin navigates to the nearest range, uses pastry dough on the range, and completes the in-game interface to make as many pie shells as possible.

4. **Loop:**  
   Once the inventory is full of pie shells or ingredients are depleted, the plugin banks the finished shells and repeats the process.

5. **Overlay:**  
   Throughout the process, the overlay displays:
    - Current action (e.g., "Banking", "Making Pie Shells", "Walking to Range")
    - Number of pie shells made
    - Runtime and efficiency stats

---

## Configuration

The plugin provides several configuration options via the `PieConfig` panel:

- **Enable Overlay:**  
  Toggle the in-game overlay on or off.

- **Custom Settings:**  
  Adjust behavior such as delays, anti-patterns, or other advanced options (if available).

---

## Requirements

- Microbot RuneLite client
- Sufficient Cooking level to make pie shells
- Access to a bank and a range in-game
- Required ingredients (flour and pastry dough) in the bank

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Nate Pie Shells Plugin, and enable it.

2. **Configure Settings:**  
   Adjust any desired settings in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated pie shell making.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports pie shell making as defined in the script logic.
- Requires the player to have the necessary ingredients in the bank.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `PiePlugin.java` – Main plugin class, manages lifecycle and integration.
- `PieScript.java` – Core automation logic for pie shell making.
- `PieConfig.java` – User configuration options.
- `PieOverlay.java` – In-game overlay display.
- `Info.java` – Additional information or metadata.

---

## Troubleshooting

- Ensure you have the required ingredients in your bank.
- Make sure you are near a bank and a range.
- If the overlay does not appear, check the overlay toggle in the config.
- For issues or bugs, review the logs or contact the plugin author.

---

**Automate your pie shell making and maximize your Cooking efficiency with the Nate Pie Shells Plugin!**