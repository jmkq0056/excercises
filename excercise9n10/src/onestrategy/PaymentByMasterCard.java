package onestrategy;

public class PaymentByMasterCard implements PaymentMethod {
    private String cardNumber;

    public PaymentByMasterCard(String cardNumber) {
        if (cardNumber.length() != 16 || !cardNumber.matches("\\d+")) {
            throw new IllegalArgumentException("Credit card number must be 16 digits.");
        }
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using MasterCard. Card Number: " + cardNumber);
        return true;
    }
}
