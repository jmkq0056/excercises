package observer;

public class MobileAppListener implements EventListener {
    private final String username;

    public MobileAppListener(String username) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("Sent Push Notification to user: " + username);
    }
}
