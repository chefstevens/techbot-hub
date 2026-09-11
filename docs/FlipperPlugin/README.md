# GE Flipper Plugin

The **GE Flipper Plugin** is an automation tool for Old School RuneScape, designed to help players efficiently flip items for profit at the Grand Exchange. Built for the Microbot RuneLite client, this plugin streamlines the process of buying and selling items, tracking margins, and managing offers, allowing for hands-free and optimized merchanting.

---

## Features

- **Automated Flipping:**  
  Automatically places buy and sell offers at the Grand Exchange based on user-defined or detected margins, maximizing profit potential.

- **Margin Checking:**  
  Checks item margins to determine the most profitable buy and sell prices.

- **Offer Management:**  
  Monitors active offers, collects completed trades, and re-lists items as needed for continuous flipping.

- **Configurable Options:**  
  Users can select which items to flip, set margin thresholds, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of coins, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the items you want to flip and set your margin preferences in the plugin panel.

2. **Startup:**  
   The plugin checks your inventory and coin pouch, preparing to place offers at the Grand Exchange.

3. **Automation Loop:**  
   The script performs the following:
    - Checks item margins (if enabled)
    - Places buy offers at the lower margin
    - Collects purchased items and places sell offers at the higher margin
    - Monitors and manages offers for continuous flipping

4. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`FlipperConfig`) where you can:

- Select items to flip
- Set margin thresholds and flipping strategies
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient coins for flipping
- Access to the Grand Exchange

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the GE Flipper Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired items and margin preferences.

3. **Start the Plugin:**  
   Click "Start" to begin automated flipping.

4. **Monitor Progress:**  
   The plugin will handle offers and profits automatically.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports flipping items and strategies defined in the script logic.
- Requires the player to have sufficient coins and access to the Grand Exchange.
- May not handle all random events or interruptions (e.g., player death, disconnections).

---

## Source Files

- `FlipperPlugin.java` – Main plugin class, manages lifecycle and integration.
- `FlipperScript.java` – Core automation logic for flipping.
- `FlipperConfig.java` – User configuration options.

---

**Automate your merchanting and maximize your profits with the GE Flipper Plugin!**