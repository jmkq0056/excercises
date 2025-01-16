package two;
import java.util.Arrays;
public class DigitalDisplay {
    private int[] digits;

    public DigitalDisplay() {
        digits = new int[4]; // Initialize all digits to 0
    }

    public int getDigit(int i) {
        if (i < 0 || i >= 4) {
            throw new NoSuchDigitException("No such digit: " + i + ". Valid indices are 0 to 3.");
        }
        return digits[i];
    }

    public void setDigit(int i, int v) {
        if (i < 0 || i >= 4) {
            throw new NoSuchDigitException("No such digit: " + i + ". Valid indices are 0 to 3.");
        }
        if (v < 0 || v > 9) {
            throw new IllegalDigitException("Illegal digit value: " + v + ". Valid values are 0 to 9.");
        }
        digits[i] = v;
        System.out.println("Digit at position " + i + " set to: " + v);


    }

    // Print the display in clock-like format
    public void printClock() {
        System.out.printf("%d%d:%d%d%n", digits[0], digits[1], digits[2], digits[3]);
    }
}
