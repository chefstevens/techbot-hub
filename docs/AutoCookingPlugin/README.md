# Cooking Plugin

The **Cooking Plugin** is an automation tool for Old School RuneScape, designed to efficiently train the Cooking skill by automating the process of cooking food at various locations. Built for the Microbot RuneLite client, this plugin streamlines cooking, inventory management, and banking, allowing for hands-free and optimized Cooking experience gains.

---

## Features

- **Automated Cooking:**  
  Automatically cooks raw food items at supported ranges, fires, or other cooking locations for fast and efficient Cooking XP.

- **Supports Multiple Activities:**  
  Handles a variety of cooking activities, including standard cooking, burn reduction, and baking.

- **Banking and Inventory Management:**  
  Withdraws raw food from the bank, manages inventory space, and deposits cooked food as needed.

- **Overlay Display:**  
  Real-time overlay shows current status, food cooked, experience gained, runtime, and other useful stats.

- **Configurable Options:**  
  Users can select which food to cook, cooking location, enable/disable the overlay, and adjust advanced behaviors in the configuration panel.

- **Failsafes and Error Handling:**  
  Handles running out of food, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select the type of food to cook and the desired cooking location in the plugin panel.

2. **Startup:**  
   The plugin checks for required raw food in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the following:
    - Travels to the selected cooking location (if not already there)
    - Cooks raw food items
    - Banks for more raw food or deposits cooked food when inventory is full
    - Repeats the process for continuous training

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Cooking", "Banking")
    - Food cooked
    - Experience gained
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`AutoCookingConfig`) where you can:

- Select the food to cook (see `enums/CookingItem.java` for supported foods)
- Choose the cooking location (see `enums/CookingLocation.java`)
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Sufficient Cooking level for the selected food
- Required raw food in the bank/inventory
- Access to a supported cooking location (range, fire, etc.)

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Cooking Plugin, and enable it.

2. **Configure Settings:**  
   Select your desired food and cooking location, and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated cooking.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports foods and activities defined in the script logic.
- Requires the player to have the necessary raw food and Cooking level.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `AutoCookingPlugin.java` – Main plugin class, manages lifecycle and integration.
- `AutoCookingConfig.java` – User configuration options.
- `AutoCookingOverlay.java` – In-game overlay display.

### Enums (`enums/`)
- `CookingActivity.java` – Supported cooking activities.
- `CookingAreaType.java` – Types of cooking areas.
- `CookingItem.java` – Supported food items.
- `CookingLocation.java` – Supported cooking locations.
- `HumidifyItem.java` – Items for humidify spell support.

### Scripts (`scripts/`)
- `AutoCookingScript.java` – Core automation logic for cooking.
- `BurnBakingScript.java` – Logic for burn reduction and baking.

---

**Automate your Cooking training and maximize your experience gains with the Cooking Plugin!**