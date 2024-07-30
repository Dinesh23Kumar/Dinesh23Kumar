package scheduler;

import devices.Device;

import java.time.LocalTime;

public class Schedule {
    private Device device;
    private LocalTime time;
    private String command;

    public Schedule(Device device, LocalTime time, String command) {
        this.device = device;
        this.time = time;
        this.command = command;
    }

    public Device getDevice() {
        return device;
    }

    public LocalTime getTime() {
        return time;
    }

    public String getCommand() {
        return command;
    }
}
