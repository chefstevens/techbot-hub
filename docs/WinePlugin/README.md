# Nate Wine Maker Plugin

The **Nate Wine Maker Plugin** is an automation tool for Old School RuneScape, designed to efficiently create jugs of wine for fast Cooking experience. Built for the Microbot RuneLite client, this plugin automates the entire wine-making process, from withdrawing ingredients to banking finished wines, allowing for hands-free and optimized Cooking training.

---

## Features

- **Automated Wine Making:**  
  Automatically withdraws grapes and jugs of water from the bank, combines them to make unfermented wine, and banks the finished product.

- **Bank Interaction:**  
  Efficiently interacts with the nearest bank to manage inventory, withdraw ingredients, and deposit completed wines.

- **Overlay Display:**  
  Provides a real-time overlay showing current status, number of wines made, runtime, and other useful statistics.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as enabling/disabling the overlay and customizing behavior.

- **Failsafes and Error Handling:**  
  Handles common issues such as running out of ingredients, full inventory, or unexpected in-game events.

---

## How It Works

1. **Startup:**  
   When started, the plugin checks the player's inventory and bank for grapes and jugs of water.

2. **Banking:**  
   If ingredients are missing, the plugin will walk to the nearest bank, withdraw the necessary items, and prepare the inventory.

3. **Making Wine:**  
   The plugin combines grapes with jugs of water in the inventory to create unfermented wine.

4. **Loop:**  
   Once the inventory is full of unfermented wine or ingredients are depleted, the plugin banks the finished wines and repeats the process.

5. **Overlay:**  
   The overlay displays:
    - Current action (e.g., "Banking", "Making Wine")
    - Number of wines made
    - Runtime and efficiency stats

---

## Configuration

The plugin provides several configuration options via the `WineConfig` panel:

- **Enable Overlay:**  
  Toggle the in-game overlay on or off.

- **Custom Settings:**  
  Adjust behavior such as delays, anti-patterns, or other advanced options (if available).

---

## Requirements

- Microbot RuneLite client
- Sufficient Cooking level to make wine
- Access to a bank in-game
- Required ingredients (grapes and jugs of water) in the bank

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Nate Wine Maker Plugin, and enable it.

2. **Configure Settings:**  
   Adjust any desired settings in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated wine making.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports wine making as defined in the script logic.
- Requires the player to have the necessary ingredients in the bank.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `WinePlugin.java` – Main plugin class, manages lifecycle and integration.
- `WineScript.java` – Core automation logic for wine making.
- `WineConfig.java` – User configuration options.
- `WineOverlay.java` – In-game overlay display.

---

**Automate your wine making and maximize your Cooking efficiency with the Nate Wine Maker Plugin!**