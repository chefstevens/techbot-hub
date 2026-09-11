# Crafting Plugin

The **Crafting Plugin** is a comprehensive automation tool for Old School RuneScape, designed to streamline and optimize Crafting training by supporting a wide variety of crafting activities. Built for the Microbot RuneLite client, this plugin automates crafting processes, inventory management, and banking, allowing for efficient and hands-free Crafting experience gains.

---

## Features

- **Supports Multiple Crafting Activities:**
    - **Spinning Flax:** Automatically spins flax into bowstrings at supported locations.
    - **Glassblowing:** Crafts various glass items from molten glass.
    - **Gem Cutting:** Cuts uncut gems into their finished forms.
    - **Bolt Tips:** Cuts gems into bolt tips for Fletching.
    - **Dragon Leather Armour:** Crafts dragonhide into various dragon leather armours.
    - **Staff Crafting:** Creates battlestaves and other staff items.
    - **Jewelry Crafting:** Fully automates the process of making and enchanting rings, necklaces, and amulets.

- **Jewelry Sub-Plugin:**  
  Includes a dedicated jewelry crafting and enchanting system with its own configuration, overlays, and support for all jewelry types and enchantment spells.

- **Automated Banking and Inventory Management:**  
  Withdraws required materials, manages inventory space, and banks finished products as needed.

- **Overlay Display:**  
  Real-time overlay shows current activity, items crafted, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Choose your crafting activity, item preferences, enable/disable overlays, and adjust advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of materials, full inventory, and unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select your desired crafting activity and item options in the plugin panel.

2. **Startup:**  
   The plugin checks for required materials and inventory space. If needed, it will bank for supplies.

3. **Automation Loop:**  
   The script performs the selected crafting activity, manages inventory, and handles banking as needed.

4. **Overlay:**  
   Displays real-time information such as:
    - Current activity and item
    - Experience gained
    - Number of items crafted
    - Runtime and efficiency stats

5. **Failsafes:**  
   Stops or pauses if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a comprehensive configuration panel (`CraftingConfig`) and, for jewelry, a dedicated `JewelryConfig` panel where you can:

- Select the crafting activity (Flax, Glass, Gems, Bolt Tips, Dragon Leather, Staffs, Jewelry, etc.)
- Choose specific items or jewelry types to craft or enchant
- Enable or disable overlays
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Crafting level for the selected activity
- Required materials (flax, glass, gems, dragon leather, staves, gold bars, gems, runes, etc.) in the bank/inventory

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Crafting Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired crafting activity and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated crafting.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports activities and items defined in the script logic.
- Requires the player to have the necessary materials and Crafting level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `CraftingPlugin.java` – Main plugin class, manages lifecycle and integration.
- `CraftingConfig.java` – User configuration options.
- `CraftingOverlay.java` – In-game overlay display.

### Enums (`enums/`)
- `Activities.java` – Supported crafting activities.
- `BoltTips.java` – Bolt tip types.
- `DragonLeatherArmour.java` – Dragon leather armour types.
- `FlaxSpinLocations.java` – Supported flax spinning locations.
- `Gems.java` – Gem types.
- `Glass.java` – Glass item types.
- `Staffs.java` – Staff types.

### Jewelry Sub-Plugin (`jewelry/`)
- `JewelryPlugin.java` – Jewelry crafting/enchanting logic.
- `JewelryConfig.java` – Jewelry-specific configuration.
- `JewelryOverlay.java` – Jewelry overlay display.
- `JewelryScript.java` – Jewelry automation script.
- `enums/` – Jewelry-specific enums (CompletionAction, CraftingLocation, EnchantSpell, Gem, Jewelry, JewelryType, Staff, State).

### Scripts (`scripts/`)
- `CraftingState.java` – Script state management.
- `DefaultScript.java` – Default crafting script.
- `DragonLeatherScript.java` – Dragon leather crafting logic.
- `FlaxSpinScript.java` – Flax spinning logic.
- `GemsScript.java` – Gem cutting logic.
- `GlassblowingScript.java` – Glassblowing logic.
- `ICraftingScript.java` – Crafting script interface.
- `StaffScript.java` – Staff crafting logic.

---

**Automate your Crafting training and maximize your experience gains with the Crafting Plugin!**