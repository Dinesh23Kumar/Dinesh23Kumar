package devices;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id) {
        super(id, "thermostat");
        this.temperature = 70;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        // Implement as needed
    }

    @Override
    public void turnOff() {
        // Implement as needed
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }
}
