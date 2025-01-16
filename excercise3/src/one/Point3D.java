package one;
public class Point3D extends Point2D {
    protected int z;

    public Point3D(int x, int y, int z) {
        super(x,y);
        this.z = z;
    }

    @Override
    public void display() {
        System.out.println("Point3D: (" + x + ", " + y + ", " + z + ")");
    }
}
