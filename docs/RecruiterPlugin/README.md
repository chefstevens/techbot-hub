# Gebot Recruiter Plugin

The **Gebot Recruiter Plugin** is an automation tool for Old School RuneScape, designed to streamline and optimize the process of recruiting followers or managing recruitment-related activities in the game. Built for the Microbot RuneLite client, this plugin automates interactions, manages inventory, and provides real-time feedback, allowing for efficient and hands-free recruitment operations.

---

## Features

- **Automated Recruitment:**  
  Automatically interacts with NPCs or interfaces to recruit followers or complete recruitment-related tasks.

- **Inventory and Resource Management:**  
  Handles the withdrawal and use of required items or resources needed for recruitment.

- **Overlay Display:**  
  Real-time overlay shows current status, number of recruits, actions performed, runtime, and other useful statistics.

- **Configurable Options:**  
  Users can adjust plugin settings via the configuration panel, such as recruitment targets, overlay preferences, and advanced behaviors.

- **Failsafes and Error Handling:**  
  Handles running out of resources, full inventory, or unexpected in-game events.

---

## How It Works

1. **Configuration:**  
   Select recruitment targets and adjust settings in the plugin panel.

2. **Startup:**  
   The plugin checks for required items or resources in your inventory or bank. If needed, it will withdraw supplies.

3. **Automation Loop:**  
   The script performs the recruitment process, manages inventory, and handles banking as needed.

4. **Overlay:**  
   Displays real-time information such as:
    - Current action (e.g., "Recruiting", "Banking")
    - Number of recruits
    - Actions performed
    - Runtime and efficiency stats

5. **Failsafes:**  
   Pauses or stops if requirements are not met, or if unexpected events occur.

---

## Configuration

The plugin provides a configuration panel (`RecruiterConfig`) where you can:

- Select recruitment targets or methods
- Enable or disable the overlay
- Adjust advanced options (delays, anti-patterns, etc.)

---

## Requirements

- Microbot RuneLite client
- Required items or resources in the bank/inventory
- Access to recruitment locations or NPCs

---

## Usage

1. **Enable the Plugin:**  
   Open the Microbot sidebar, find the Gebot Recruiter Plugin, and enable it.

2. **Configure Settings:**  
   Select your recruitment targets and adjust settings as needed.

3. **Start the Plugin:**  
   Click "Start" to begin automated recruitment.

4. **Monitor Progress:**  
   Watch the overlay for real-time updates on progress and status.

5. **Stop at Any Time:**  
   Click "Stop" to halt the automation.

---

## Limitations

- Only supports recruitment activities defined in the script logic.
- Requires the player to have the necessary items and access.
- May not handle all random events or interruptions (e.g., player death, aggressive NPCs).

---

## Source Files

- `RecruiterPlugin.java` – Main plugin class, manages lifecycle and integration.
- `RecruiterScript.java` – Core automation logic for recruitment.
- `RecruiterConfig.java` – User configuration options.
- `RecruiterOverlay.java` – In-game overlay display.

---

**Automate your recruitment tasks and maximize your efficiency with the Gebot Recruiter Plugin!**