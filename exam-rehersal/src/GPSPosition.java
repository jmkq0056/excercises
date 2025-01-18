import java.util.Objects;

public class GPSPosition {
    private final double x;
    private final double y;


    public GPSPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals (Object o){
        if (this == o) return true;

        if(o == null || getClass() != getClass()) return false;

        GPSPosition that = (GPSPosition) o;
        return x == that.x && y ==that.y;
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(x,y);
    }

    @Override
    public String toString(){
        return "GPSPosition{" +"x=" + x + ", " + "y=" +y + "}";
    }
}
