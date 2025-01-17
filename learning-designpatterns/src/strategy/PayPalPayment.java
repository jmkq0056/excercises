package strategy;

public class PayPalPayment implements PaymentStrategy {
    private User user;

    public PayPalPayment(User user) {
        if (user.getEmail() == null) {
            throw new IllegalArgumentException("User must have a valid email for PayPal payment.");
        }
        this.user = user;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal. Name: " + user.getFullName() + ", Email: " + user.getEmail());
    }
}
