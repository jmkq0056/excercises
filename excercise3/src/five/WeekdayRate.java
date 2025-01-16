package five;
// WeekdayRate Class
public class WeekdayRate implements ParkingRate {
    private final double ratePerMinute = 0.75; // 10 cents per minute on weekdays

    @Override
    public double computeRate(int minutes) {
        return minutes * ratePerMinute;
    }
}