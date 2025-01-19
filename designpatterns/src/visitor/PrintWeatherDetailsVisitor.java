package visitor;

/**
 * Concrete visitor for printing weather details.
 */
public class PrintWeatherDetailsVisitor implements WeatherDataVisitor {
    @Override
    public void visit(WeatherData data) {
        System.out.println("Weather Details:");
        System.out.println("Temperature: " + data.getTemperature());
        System.out.println("Humidity: " + data.getHumidity());
    }
}
