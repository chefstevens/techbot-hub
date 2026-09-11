# Bradley Combat Plugin

The **Bradley Combat Plugin** is an advanced automation tool for Old School RuneScape, designed to handle a wide variety of combat scenarios with precision and efficiency. Built for the Microbot RuneLite client, this plugin automates combat actions, manages gear and prayers, and adapts to different combat styles, making it ideal for both AFK and high-intensity PvM or PvP situations.

---

## Features

- **Automated Combat Actions:**  
  Automatically attacks NPCs or players, switches combat styles (melee, range, mage), and uses special attacks when appropriate.

- **Prayer Management:**  
  Activates and deactivates offensive and defensive prayers based on combat situations, including rapid switching for maximum efficiency.

- **Gear and Inventory Handling:**  
  Equips the best available gear for the selected combat style and manages inventory for food, potions, and special items.

- **Special Attack Usage:**  
  Detects when special attacks are available and uses them strategically for maximum damage or utility.

- **Advanced Combat Tactics:**  
  Supports tanking, walking under targets, vengeance casting, and other advanced PvM/PvP tactics.

- **Overlay Display:**  
  Real-time overlay shows current combat status, active prayers, special attack energy, and other useful stats.

- **Configurable Options:**  
  Users can select combat styles, prayer strategies, special attack preferences, and overlay settings via the configuration panel.

- **Modular Action System:**  
  Uses a modular action and handler system, allowing for easy extension and customization of combat behaviors.

---

## How It Works

1. **Configuration:**  
   Select your preferred combat style, prayer setup, and special attack options in the plugin panel.

2. **Startup:**  
   The plugin checks your gear, inventory, and combat settings, preparing for battle.

3. **Combat Loop:**  
   The script performs the following:
    - Attacks targets using the chosen combat style
    - Switches prayers and gear as needed
    - Uses special attacks and defensive abilities
    - Handles advanced tactics like tanking, walking under, and vengeance

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Attacking", "Switching Gear", "Using Spec")
    - Active prayers and special attack status
    - Combat stats and timers

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`BradleyCombatConfig`) where you can:

- Select combat style (melee, range, mage)
- Choose prayer and special attack strategies
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Appropriate combat gear and supplies in your inventory/bank
- Sufficient stats for selected combat styles and prayers

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Bradley Combat Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired combat style and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated combat.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on combat status and actions.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports combat actions and tactics defined in the script logic.
- Requires the player to have the necessary gear, stats, and supplies.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs outside the script's logic).

---

## Source Files

- `BradleyCombatPlugin.java` – Main plugin class, manages lifecycle and integration.
- `BradleyCombatScript.java` – Core automation logic for combat.
- `BradleyCombatConfig.java` – User configuration options.
- `BradleyCombatOverlay.java` – In-game overlay display.

### Actions (`actions/`)
- Modular combat actions (Attack, Equip, Mage, Melee, Range, Spec, Tank, Vengeance, etc.)

### Handlers (`handlers/`)
- Menu, post-action, relay, and tanking logic.

### Enums (`enums/`)
- `PrayerStyle.java` – Supported prayer styles.
- `SpecType.java` – Special attack types.

### Interfaces (`interfaces/`)
- `CombatAction.java` – Action interface.
- `Relay.java` – Relay interface for event handling.

---

**Automate your combat and maximize your efficiency with the Bradley Combat Plugin!**