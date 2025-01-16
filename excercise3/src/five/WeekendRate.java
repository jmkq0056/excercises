package five;
// WeekendRate Class
public class WeekendRate implements ParkingRate {
    private final double ratePerMinute = 0.5; // 5 cents per minute on weekends

    @Override
    public double computeRate(int minutes) {
        return minutes * ratePerMinute;
    }
}