# Flippers Chaser Plugin

The **Flippers Chaser Plugin** is an automation tool for Old School RuneScape, designed to help players efficiently obtain flippers by hunting mogres. Built for the Microbot RuneLite client, this plugin streamlines the process of locating, fighting, and looting mogres, allowing for hands-free and optimized flipper hunting.

---

## Features

- **Automated Mogre Hunting:**  
  Automatically locates and attacks mogres in their spawn areas, maximizing your chances of obtaining flippers.

- **Loot Collection:**  
  Detects and picks up flippers and other valuable drops from mogres.

- **Inventory and Resource Management:**  
  Ensures you have the required items (such as fishing explosives and food), manages inventory space, and banks or drops items as needed.

- **Overlay Display:**  
  Real-time overlay shows current status, mogres defeated, flippers obtained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as overlay preferences and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of supplies, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Adjust settings in the plugin panel to match your preferences.

2. **Startup:**  
   The plugin checks for required items (fishing explosives, food) and inventory space.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to mogre spawn locations
    - Uses fishing explosives to spawn mogres
    - Attacks and defeats mogres
    - Collects flippers and other loot
    - Banks or drops items as needed
    - Repeats the process for continuous hunting

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Hunting Mogres", "Looting", "Banking")
    - Mogres defeated
    - Flippers obtained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`FlippersChaserConfig`) where you can:

- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Required items (fishing explosives, food, etc.) in the bank/inventory
- Access to mogre hunting locations

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Flippers Chaser Plugin, and enable it.

2. **Configure Settings:**  
   Adjust your preferences in the configuration panel.

3. **Start the Plugin:**  
   Click "Start" to begin automated mogre hunting.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports mogre hunting and flipper collection as defined in the script logic.
- Requires the player to have the necessary items and access.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `FlippersChaserPlugin.java` – Main plugin class, manages lifecycle and integration.
- `FlippersChaserConfig.java` – User configuration options.
- `FlippersChaserOverlay.java` – In-game overlay display.

---

**Automate your mogre hunting and maximize your chances of obtaining flippers with the Flippers Chaser Plugin!**