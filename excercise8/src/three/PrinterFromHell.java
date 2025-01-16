package three;

import java.util.Random;

public class PrinterFromHell {

    private static final Random RANDOM = new Random();

    public void print() {
        int error = RANDOM.nextInt(3); // Randomly selects 0, 1, or 2
        switch (error) {
            case 0:
                throw new OutOfPaperException("Out of paper! Consider adding more... or don't.");
            case 1:
                throw new OutOfTonerException("Out of toner! Maybe try yelling at the printer.");
            case 2:
                throw new PaperJamException("Paper jam! Hope you like puzzles.");
            default:
                System.out.println("Printing... Done! But for how long?");
        }
    }
}
