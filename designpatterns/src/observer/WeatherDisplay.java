package observer;

/**
 * WeatherDisplay acts as a concrete observer in the Observer pattern.
 * It receives updates from the WeatherStation and displays the weather data.
 */
public class WeatherDisplay implements Observer {
    private final String name; // Name of the display (e.g., Display1, Display2)

    public WeatherDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(String weatherData) {
        // React to the weather update
        System.out.println(name + " received update: " + weatherData);
    }
}
