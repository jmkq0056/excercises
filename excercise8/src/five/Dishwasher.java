package five;

import java.util.ArrayList;
import java.util.List;

public class Dishwasher {
    private boolean doorOpen = false;
    private boolean dishwasherOn = false;
    private String selectedProgram = null;
    private List<String> items = new ArrayList<>();

    // Open the dishwasher door
    public void openDoor() {
        if (dishwasherOn) {
            throw new DoorLockedException("Cannot open the door while the dishwasher is running.");
        }
        if (doorOpen) {
            throw new DoorAlreadyOpenException("The door is already open.");
        }
        doorOpen = true;
        System.out.println("Dishwasher door opened.");
    }

    // Close the dishwasher door
    public void closeDoor() {
        if (!doorOpen) {
            throw new RuntimeException("The door is already closed.");
        }
        doorOpen = false;
        System.out.println("Dishwasher door closed.");
    }

    // Turn on the dishwasher
    public void turnOn() {
        if (selectedProgram == null) {
            throw new NoProgramSelectedException("Cannot turn on the dishwasher. Please select a program first.");
        }
        if (doorOpen) {
            throw new DoorLockedException("Cannot turn on the dishwasher while the door is open.");
        }
        dishwasherOn = true;
        System.out.println("Dishwasher turned on. Program: " + selectedProgram);
    }

    // Turn off the dishwasher
    public void turnOff() {
        dishwasherOn = false;
        System.out.println("Dishwasher turned off.");
    }

    // Select a program
    public void selectProgram(String program) {
        if (!program.equalsIgnoreCase("eco-friendly") &&
                !program.equalsIgnoreCase("intense") &&
                !program.equalsIgnoreCase("standard")) {
            throw new IllegalArgumentException("Invalid program selected. Choose eco-friendly, intense, or standard.");
        }
        selectedProgram = program;
        System.out.println("Program selected: " + program);
    }

    // Add items (glasses or plates) to the dishwasher
    public void addItem(String item) {
        if (!doorOpen) {
            throw new DishwasherNotOpenException("Cannot add items. Open the dishwasher door first.");
        }
        items.add(item);
        System.out.println(item + " added to the dishwasher.");
    }

    // Remove items (glasses or plates) from the dishwasher
    public void removeItem(String item) {
        if (!doorOpen) {
            throw new DishwasherNotOpenException("Cannot remove items. Open the dishwasher door first.");
        }
        if (items.remove(item)) {
            System.out.println(item + " removed from the dishwasher.");
        } else {
            System.out.println(item + " not found in the dishwasher.");
        }
    }
}
