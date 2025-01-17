package onestrategy;

public class PaymentByPaypal implements PaymentMethod {
    private String email;

    public PaymentByPaypal(String email) {
        if (!isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address format.");
        }
        this.email = email;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal. Email: " + email);
        return true;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}
