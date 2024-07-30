package scheduler;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<Schedule> schedules = new ArrayList<>();

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void checkSchedules() {
        LocalTime now = LocalTime.now();
        for (Schedule schedule : schedules) {
            if (schedule.getTime().equals(now)) {
                executeCommand(schedule);
            }
        }
    }

    private void executeCommand(Schedule schedule) {
        String command = schedule.getCommand();
        Device device = schedule.getDevice();

        switch (command.toLowerCase()) {
            case "turn on":
                device.turnOn();
                break;
            case "turn off":
                device.turnOff();
                break;
            default:
                throw new IllegalArgumentException("Unknown command");
        }
    }
}
