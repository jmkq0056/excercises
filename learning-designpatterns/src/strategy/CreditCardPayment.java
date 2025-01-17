package strategy;

public class CreditCardPayment implements PaymentStrategy {
    private User user;

    public CreditCardPayment(User user) {
        if (user.getCardNumber() == null) {
            throw new IllegalArgumentException("User must have a valid card number for credit card payment.");
        }
        this.user = user;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card. Name: " + user.getFullName() + ", Card Number: " + user.getCardNumber());
    }
}
