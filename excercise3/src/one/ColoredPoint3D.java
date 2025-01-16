package one;
public class ColoredPoint3D extends Point3D{
    private String color;

    // Constructor
    public ColoredPoint3D(int x, int y, int z, String color) {
        super(x, y, z); // Call the constructor of Point3D
        this.color = color;
    }

    // Override display method to include color
    @Override
    public void display() {
        System.out.println("ColoredPoint3D: (" + x + ", " + y + ", " + z + "), Color: " + color);
    }
}
