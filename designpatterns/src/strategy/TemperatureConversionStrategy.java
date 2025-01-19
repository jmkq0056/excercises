package strategy;

/**
 * Strategy interface for temperature conversion.
 * Allows dynamic selection of conversion logic (e.g., Celsius, Fahrenheit).
 */
public interface TemperatureConversionStrategy {
    double convert(double temperature);
}
