import five.*;
import six.DoorPhone;
import six.TwoAptsPerFloorDoorPhone;
import six.ThreeAptsPerFloorDoorPhone;
import six.NoSuchFloorException;
import six.NoSuchAptException;
import six.IllegalAptException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // problem 1
/*
        Gearbox gearbox = new Gearbox();

        try {
            gearbox.changeGear(1); // Valid
            gearbox.changeGear(2); // Valid
            gearbox.changeGear(-1); // Throws IllegalGearChangeException
        } catch (IllegalGearChangeException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            gearbox.changeGear(4); // Throws IllegalGearChangeException
        } catch (IllegalGearChangeException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            gearbox.changeGear(6); // Throws IllegalArgumentException
        } catch (IllegalGearChangeException | IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

*/
        // problem 2
/*
        DigitalDisplay display = new DigitalDisplay();

        try {
            // Set all four digits to form a clock-like display
            display.setDigit(0, 1);
            display.setDigit(1, 2);
            display.setDigit(2, 3);
            display.setDigit(3, 4);

            // Print the clock
            System.out.println("Current clock display:");
            display.printClock();

            // Modify and print again
            display.setDigit(2, 5);
            display.setDigit(3, 9);

            System.out.println("Updated clock display:");
            display.printClock();
        } catch (NoSuchDigitException | IllegalDigitException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
*/
        // problem 3
/*
        PrinterFromHell printer = new PrinterFromHell();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                printer.print();
                System.out.println("Print job completed successfully!");
                break; // Exit the loop if printing succeeds
            } catch (OutOfPaperException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Action required: Add paper and press Enter to continue...");
                scanner.nextLine();
            } catch (OutOfTonerException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Action required: Replace toner and press Enter to continue...");
                scanner.nextLine();
            } catch (PaperJamException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.print("Action required: Fix the paper jam and press Enter to continue...");
                scanner.nextLine();
            }
        }

*/
        // problem 4
/*
        Car car = new Car();

        try {
            System.out.println("Attempting to start the car...");
            car.pressClutch();
            car.turnOnIgnition();
            car.releaseHandbrake();
            car.releaseClutch();
        } catch (ClutchNotPressedException | IgnitionAlreadyOnException | IgnitionOffException |
                 HandbrakeEngagedException | CarAlreadyRunningException e) {
            System.out.println("Operation error: " + e.getMessage());
        }

        try {
            System.out.println("\nAttempting to turn off the car...");
            car.pullHandbrake();
            car.turnOffIgnition();
        } catch (ClutchNotPressedException | IgnitionAlreadyOnException | IgnitionOffException |
                 HandbrakeEngagedException | CarAlreadyRunningException e) {
            System.out.println("Operation error: " + e.getMessage());
        }

*/
        // problem 5
/*
        Dishwasher dishwasher = new Dishwasher();

        try {
            // Open the door and add items
            dishwasher.openDoor();
            dishwasher.addItem("Glass");
            dishwasher.addItem("Plate");
            dishwasher.closeDoor();

            // Select program and start dishwasher
            dishwasher.selectProgram("eco-friendly");
            dishwasher.turnOn();

            // Attempt to open the door while the dishwasher is on
            dishwasher.openDoor();
        } catch (DoorAlreadyOpenException | DoorLockedException |
                 NoProgramSelectedException | DishwasherNotOpenException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Turn off dishwasher and remove items
        try {
            dishwasher.turnOff();
            dishwasher.openDoor();
            dishwasher.removeItem("Glass");
            dishwasher.removeItem("Plate");
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

*/
        // problem 6
// /*
        Scanner scanner = new Scanner(System.in);

        // Choose the type of building
        System.out.print("Enter the number of floors: ");
        int numFloors = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the number of apartments per floor (2 or 3): ");
        int aptsPerFloor = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        DoorPhone doorPhone = (aptsPerFloor == 2) ?
                new TwoAptsPerFloorDoorPhone(numFloors) :
                new ThreeAptsPerFloorDoorPhone(numFloors);

        // Handle calls
        while (true) {
            System.out.print("Enter the apartment number to call (or 'exit' to quit): ");
            String apt = scanner.nextLine();

            if (apt.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                break;
            }

            try {
                doorPhone.call(apt);
            } catch (NoSuchFloorException | NoSuchAptException | IllegalAptException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
// /*

// */

    }
}
