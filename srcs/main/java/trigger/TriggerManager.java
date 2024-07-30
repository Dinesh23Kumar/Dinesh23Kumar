package trigger;

import devices.Device;

import java.util.ArrayList;
import java.util.List;

public class TriggerManager {
    private List<Trigger> triggers = new ArrayList<>();

    public void addTrigger(Trigger trigger) {
        triggers.add(trigger);
    }

    public void checkTriggers(Device device) {
        for (Trigger trigger : triggers) {
            if (trigger.evaluate(device)) {
                executeAction(trigger.getAction(), device);
            }
        }
    }

    private void executeAction(String action, Device device) {
        switch (action.toLowerCase()) {
            case "turn on":
                device.turnOn();
                break;
            case "turn off":
                device.turnOff();
                break;
            default:
                throw new IllegalArgumentException("Unknown action");
        }
    }
}
