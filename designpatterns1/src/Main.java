import strategy.*;
public class Main {
    public static void main(String[] args) {
        // strategy pattern
// /*
        PaymentContext paymentContext = new PaymentContext();
        User paypalUser = new User("Alice", "Smith", "alice@example.com", null);
        User cardUser = new User("Bob", "Johnson", null, "1234567890123456");
        User bothUser = new User("Khan", "Khan", "Khan@example.com", "1234567890123457");
        try{
            paymentContext.setPaymentStrategy(new CreditCardPayment(cardUser));
            paymentContext.pay(150);

            paymentContext.setPaymentStrategy(new PayPalPayment(paypalUser));
            paymentContext.pay(75);

            paymentContext.setPaymentStrategy(new PayPalPayment(bothUser));
            paymentContext.pay(100);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
// */
        // Oberserver Pattern
// /*

// */
        // [optional] Decorator pattern
// /*
// */
    }
}