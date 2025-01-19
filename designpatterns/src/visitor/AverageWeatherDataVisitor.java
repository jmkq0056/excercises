package visitor;

/**
 * Concrete visitor for calculating average temperature and humidity.
 */
public class AverageWeatherDataVisitor implements WeatherDataVisitor {
    private double totalTemperature = 0; // Sum of temperatures
    private double totalHumidity = 0; // Sum of humidity values
    private int count = 0; // Number of data points

    @Override
    public void visit(WeatherData data) {
        totalTemperature += data.getTemperature();
        totalHumidity += data.getHumidity();
        count++;
    }

    /**
     * Prints the calculated averages.
     */
    public void printAverages() {
        System.out.println("Average Temperature: " + (totalTemperature / count));
        System.out.println("Average Humidity: " + (totalHumidity / count));
    }
}
