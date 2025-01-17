package twoobserver;

public class EmailSubscriber implements Subscriber {
    private final String emailAddress;

    public EmailSubscriber(String emailAddress) {
        if (!isValidEmail(emailAddress)) {
            throw new IllegalArgumentException("Invalid email address: " + emailAddress);
        }
        this.emailAddress = emailAddress;
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    @Override
    public void update(String news) {
        System.out.println("Email sent to " + emailAddress + ": " + news);
    }
}
