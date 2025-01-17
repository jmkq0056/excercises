package strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment strategy cannot be null.");
        }
        this.paymentStrategy = paymentStrategy;
    }

    // Execute payment
    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy is not set. Please set a strategy before paying.");
        }
        paymentStrategy.pay(amount);
    }
}
