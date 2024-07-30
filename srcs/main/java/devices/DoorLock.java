package devices;

public class DoorLock extends Device {
    private boolean isLocked;

    public DoorLock(int id) {
        super(id, "door lock");
        this.isLocked = true;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock() {
        isLocked = false;
    }

    @Override
    public void turnOn() {
        unlock();
    }

    @Override
    public void turnOff() {
        lock();
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }
}
