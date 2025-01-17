package twoobserver;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private final List<Subscriber> subscribers;

    public NewsFeed() {
        this.subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        if (subscriber == null) {
            throw new IllegalArgumentException("Subscriber cannot be null.");
        }
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
