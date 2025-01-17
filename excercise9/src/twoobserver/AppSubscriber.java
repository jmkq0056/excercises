package twoobserver;

public class AppSubscriber implements Subscriber {
    private final int phoneId;

    public AppSubscriber(int phoneId) {
        if (phoneId <= 0) {
            throw new IllegalArgumentException("Invalid phone ID: " + phoneId);
        }
        this.phoneId = phoneId;
    }

    @Override
    public void update(String news) {
        System.out.println("Push notification sent to phone ID " + phoneId + ": " + news);
    }
}
