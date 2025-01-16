package three;
// Triangle Class
public class Triangle implements Shape {
    private double base;
    private double height;
    private double sideA, sideB, sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getCircumference() {
        return sideA + sideB + sideC;
    }

    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}