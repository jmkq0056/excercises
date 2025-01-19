package threedecorator;

public class DataEncryptor {
    public static String encrypt(String data) {
        // Simulate encryption by reversing the string (for demonstration purposes)
        return new StringBuilder(data).reverse().toString();
    }
}
