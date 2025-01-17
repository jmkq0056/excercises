package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

public class NotificationService {
    private final Map<Event, List<EventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        // Initialize the 'customers' map by associating each Event (enum value)
        // with an empty ArrayList.
        Arrays.stream(Event.values()).forEach(event -> customers.put(event, new ArrayList<>()));
    }

    public void subscribe(Event eventType, EventListener listener) {
        customers.get(eventType).add(listener);
    }

    public void unsubscribe(Event eventType, EventListener listener) {
        customers.get(eventType).remove(listener);
    }

    public void notifyListeners(Event eventType) {
        customers.get(eventType).forEach(listener -> listener.update());
    }

    // New method to print the contents of the map
    public void printMap() {
        System.out.println("NotificationService Map Contents:");
        customers.forEach((event, listeners) -> {
            System.out.print(event + ": ");
            if (listeners.isEmpty()) {
                System.out.println("No listeners subscribed.");
            } else {
                listeners.forEach(listener -> System.out.print(listener.getClass().getSimpleName() + " "));
                System.out.println();
            }
        });
    }
}
