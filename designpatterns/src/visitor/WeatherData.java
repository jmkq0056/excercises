package visitor;

/**
 * Represents weather data with temperature and humidity.
 * This acts as the element in the Visitor pattern.
 */
public class WeatherData {
    private final double temperature; // Temperature value
    private final double humidity; // Humidity value

    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    /**
     * Accepts a visitor to perform operations on the data.
     */
    public void accept(WeatherDataVisitor visitor) {
        visitor.visit(this);
    }
}
