public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    double circumference () {
        return (2 * width) + (2 * height);
    }
}
