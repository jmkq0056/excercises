package observer;

/**
 * Observer interface for receiving updates from the WeatherStation (subject).
 * Each observer represents a display device or any entity that reacts to weather changes.
 */
public interface Observer {
    void update(String weatherData);
}
