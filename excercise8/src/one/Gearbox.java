package one;

public class Gearbox {

    private int currentGear;

    public Gearbox() {
        this.currentGear = 0; // Neutral gear
    }

    public void changeGear(int gear) {
        if (gear != -1 && gear != 1 && gear != 2 && gear != 3 && gear != 4 && gear != 5) {
            throw new IllegalArgumentException("Invalid gear: " + gear + ". Allowed gears are -1, 1, 2, 3, 4, and 5.");
        }

        if (gear == -1 && currentGear != 0 && currentGear != 1) {
            throw new IllegalGearChangeException("Cannot switch to reverse (-1) unless in neutral or first gear.");
        }

        if (Math.abs(gear - currentGear) > 1 && currentGear != 0) {
            throw new IllegalGearChangeException("Cannot skip gears. Current gear: " + currentGear + ", attempted gear: " + gear);
        }

        this.currentGear = gear;
        System.out.println("Gear changed to: " + gear);
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
