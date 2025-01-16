package nails.fingernail;

public class Nail {
    double width;
    double length;
    String color;

    public Nail (double width, double length){
        this.width = width;
        this.length = length;
    }

    public Nail (double width, double length, String color){
        this(width, length);
        this.color = color;
    }
}
