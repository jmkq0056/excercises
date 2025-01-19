package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherStation acts as the subject in the Observer pattern.
 * It notifies all registered observers whenever weather data changes.
 */
public class WeatherStation {
    private final List<Observer> observers = new ArrayList<>(); // List of observers
    private String weatherData; // Current weather data

    /**
     * Adds a new observer to the list.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from the list.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Sets new weather data and notifies all observers.
     */
    public void setWeatherData(String weatherData) {
        this.weatherData = weatherData;
        notifyObservers(); // Notify all observers of the change
    }

    /**
     * Notifies all registered observers.
     */
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weatherData);
        }
    }
}
