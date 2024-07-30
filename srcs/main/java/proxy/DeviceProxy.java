package proxy;

import devices.Device;

public class DeviceProxy extends Device {
    private Device device;

    public DeviceProxy(Device device) {
        super(device.id, device.type);
        this.device = device;
    }

    @Override
    public void turnOn() {
        // Access control logic
        device.turnOn();
    }

    @Override
    public void turnOff() {
        // Access control logic
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}
