package strategy;

public class User {
    private String firstName;
    private String lastName;
    private String email;       // Optional
    private String cardNumber;  // Optional

    // Constructor for users with both email and card number
    public User(String firstName, String lastName, String email, String cardNumber) {
        if (email != null && !isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email address format.");
        }
        if (cardNumber != null && (!cardNumber.matches("\\d{16}"))) {
            throw new IllegalArgumentException("Credit card number must be exactly 16 digits.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.cardNumber = cardNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }
}
