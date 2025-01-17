package session11;

import java.util.Objects;

/*
Create a Java class GPSPosition to store the coordinates x and y (represented as double numbers). Once created, the coordinates x and y cannot be modified.
Additionally:
1. Override the equals and hashCode methods such that two GPSPosition objects are considered equal if and only if their coordinates (x and y) are equal.
2. Write code for this class, including its fields, constructor, and the required methods.
 */
public class GPSPosition {
    final private double x;

    final private double y;

    public GPSPosition(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GPSPosition that = (GPSPosition) o;
        return Double.compare(x, that.x) == 0 && Double.compare(y, that.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
