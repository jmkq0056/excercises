package strategy;

/**
 * Strategy for converting temperatures to Fahrenheit.
 */
public class FahrenheitConversion implements TemperatureConversionStrategy {
    @Override
    public double convert(double temperature) {
        return (temperature * 9 / 5) + 32; // Convert Celsius to Fahrenheit
    }
}
