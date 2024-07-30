package trigger;

import devices.Device;

public class Trigger {
    private String condition;
    private String action;

    public Trigger(String condition, String action) {
        this.condition = condition;
        this.action = action;
    }

    public boolean evaluate(Device device) {
        // Implement condition evaluation logic
        return false;
    }

    public String getAction() {
        return action;
    }
}
