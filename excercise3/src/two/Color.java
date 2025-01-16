package two;
public interface Color {
    int getRed();   // Returns the intensity of the red component
    int getGreen(); // Returns the intensity of the green component
    int getBlue();  // Returns the intensity of the blue component

    // A default method to display the color values
    default void displayColor() {
        System.out.println("RGB(" + getRed() + ", " + getGreen() + ", " + getBlue() + ")");
    }
}
