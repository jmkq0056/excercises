package three;
public class Square implements Shape {
    private double side;


    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getCircumference() {
        return 4 * side;
    }

    @Override
    public int getNumberOfEdges() {
        return 4;
    }

}
