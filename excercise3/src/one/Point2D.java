package one;
public class Point2D {
    protected int x;
    protected int y;

    // Constructor
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;

    }


    // Method to display the point's coordinates
    public void display() {
        System.out.println("Point2D: (" + x + ", " + y + ")");
    }
}
