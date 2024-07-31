Smart Home System Simulation Overview
The Smart Home System simulation provides a virtual environment to control various smart devices like lights, thermostats, and door locks through a central hub. It enables users to manage devices, set schedules, automate tasks, and monitor device statuses efficiently.

Key Features
Device Management

Initialization: Initialize smart devices with unique IDs and types (e.g., light, thermostat, door lock).
Dynamic Management: Add or remove devices dynamically.
Device Control

Turn On/Off: Control the power state of devices via the central hub.
Status Reporting: View real-time status updates for each device.
Scheduling

Set Schedules: Schedule devices to turn on or off at specific times.
Automation

Automate Tasks: Automate tasks based on predefined triggers (e.g., turn off lights when thermostat reaches a certain temperature).
Design Patterns

Observer Pattern: Update all devices when a change occurs in the system.
Factory Method Pattern: Create instances of different smart devices.
Proxy Pattern: Control access to devices, adding a layer of control and security.
Configuration Management

Configuration File: Read settings from a config.properties file for easy configuration and initialization.

Project Structure:
src/
├── main/
│   ├── java/
│   │   ├── devices/
│   │   │   ├── Device.java
│   │   │   ├── Light.java
│   │   │   ├── Thermostat.java
│   │   │   ├── DoorLock.java
│   │   ├── factory/
│   │   │   ├── DeviceFactory.java
│   │   ├── proxy/
│   │   │   ├── DeviceProxy.java
│   │   ├── observer/
│   │   │   ├── Observable.java
│   │   │   ├── Observer.java
│   │   ├── scheduler/
│   │   │   ├── Schedule.java
│   │   │   ├── Scheduler.java
│   │   ├── trigger/
│   │   │   ├── Trigger.java
│   │   │   ├── TriggerManager.java
│   │   ├── main/
│   │   │   ├── SmartHomeSystem.java
│   └── resources/
│       ├── config.properties


Contact Email:
din456mar@gmail.com
GitHub:Dinesh23Kumar

