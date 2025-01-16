package four;

public class Car {

    private boolean clutchPressed = false;
    private boolean ignitionOn = false;
    private boolean handbrakeEngaged = true;
    private boolean carStarted = false;

    public void pressClutch() {
        clutchPressed = true;
        System.out.println("Clutch pressed.");
    }

    public void releaseClutch() {
        if (!ignitionOn) {
            throw new IgnitionOffException("Cannot release clutch. Turn on the ignition first.");
        }
        if (handbrakeEngaged) {
            throw new HandbrakeEngagedException("Cannot release clutch while the handbrake is engaged.");
        }
        clutchPressed = false;
        carStarted = true;
        System.out.println("Clutch released. Car is now running.");
    }

    public void turnOnIgnition() {
        if (ignitionOn) {
            throw new IgnitionAlreadyOnException("Ignition is already on.");
        }
        if (!clutchPressed) {
            throw new ClutchNotPressedException("Cannot turn on ignition without pressing the clutch.");
        }
        ignitionOn = true;
        System.out.println("Ignition turned on.");
    }

    public void turnOffIgnition() {
        if (!ignitionOn) {
            throw new IgnitionOffException("Ignition is already off.");
        }
        if (carStarted) {
            throw new CarAlreadyRunningException("Cannot turn off the ignition while the car is running. Stop the car first.");
        }
        ignitionOn = false;
        System.out.println("Ignition turned off.");
    }

    public void pullHandbrake() {
        if (carStarted) {
            throw new CarAlreadyRunningException("Cannot pull the handbrake while the car is running. Stop the car first.");
        }
        handbrakeEngaged = true;
        System.out.println("Handbrake pulled.");
    }

    public void releaseHandbrake() {
        if (!ignitionOn) {
            throw new IgnitionOffException("Cannot release the handbrake. Turn on the ignition first.");
        }
        handbrakeEngaged = false;
        System.out.println("Handbrake released.");
    }
}
