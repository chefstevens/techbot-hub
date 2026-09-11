# Chaos Altar Plugin

The **Chaos Altar Plugin** is an automation tool for Old School RuneScape, designed to maximize Prayer experience by automating the process of offering bones at the Chaos Altar in the Wilderness. Built for the Microbot RuneLite client, this plugin streamlines bone offering, inventory management, and banking, allowing for efficient and hands-free Prayer training.

---

## Features

- **Automated Bone Offering:**  
  Automatically offers bones at the Chaos Altar, taking advantage of the altar's high XP rates and bone-saving effect.

- **Banking and Inventory Management:**  
  Withdraws bones from the bank, manages inventory space, and ensures a continuous supply of bones for offering.

- **Overlay Display:**  
  Real-time overlay shows current status, bones offered, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Choose which bones to offer, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of bones, full inventory, and unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the type of bones to offer and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required bones in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to the Chaos Altar (if not already there)
    - Offers bones at the altar for maximum Prayer XP
    - Banks for more bones when inventory is empty
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Offering Bones", "Banking")
    - Bones offered
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`ChaosAltarConfig`) where you can:

- Select the type of bones to offer
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Prayer level for the selected bones
- Required bones in the bank/inventory
- Access to the Chaos Altar in the Wilderness

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Chaos Altar Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired bone type and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated bone offering.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports bones and activities defined in the script logic.
- Requires the player to have the necessary bones and Prayer level.
- May not handle all random events or interruptions (e.g., player death, PKers in the Wilderness).

---

## Source Files

- `ChaosAltarPlugin.java` – Main plugin class, manages lifecycle and integration.
- `ChaosAltarScript.java` – Core automation logic for bone offering.
- `ChaosAltarConfig.java` – User configuration options.
- `ChaosAltarOverlay.java` – In-game overlay display.
- `State.java` – Script state management.

---

**Automate your Prayer training and maximize your experience gains with the Chaos Altar Plugin!**