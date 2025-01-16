package three;
// Line Class
public class Line implements Shape {
    private double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0; // Line has no area
    }

    @Override
    public double getCircumference() {
        return length; // Length is the only relevant measure
    }

    @Override
    public int getNumberOfEdges() {
        return 0; // Line has no edges
    }
}