import four.Dict; // Import the Dict class
import nine.Course;
import nine.Faculty;
import nine.Student;
import seven.BidirectionalMap;
import six.Multimap;
import twoNthree.Pair; // Import the Pair class for reference
import five.Multiset;
import eight.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // problem 1
/*
        // Create a Box for a String
        Box<String> stringBox = new Box<>("Hello, Box!");
        System.out.println("String Box Content: " + stringBox.getContent());

        // Update the Box content
        stringBox.setContent("New Content");
        System.out.println("Updated String Box Content: " + stringBox.getContent());

        // Create a Box for an Integer
        Box<Integer> intBox = new Box<>(123);
        System.out.println("Integer Box Content: " + intBox.getContent());

        // Try setting null (this should throw an exception)
        try {
            stringBox.setContent(null); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Try creating a Box with null content (this should also throw an exception)
        try {
            Box<String> nullBox = new Box<>(null); // This will throw an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
       }
*/
        // problem 2
/*
        // Create a Pair of a String and an Integer
        Pair<String, Integer> nameAndAge = new Pair<>("Alice", 25);
        System.out.println("Name: " + nameAndAge.getFirst());
        System.out.println("Age: " + nameAndAge.getSecond());

        // Create a Pair of two Integers
        Pair<Integer, Integer> coordinates = new Pair<>(10, 20);
        System.out.println("X Coordinate: " + coordinates.getFirst());
        System.out.println("Y Coordinate: " + coordinates.getSecond());
*/
        // problem 3
/*
        // Create a Pair
        Pair<String, Integer> nameAndAge = new Pair<>("Alice", 25);

        // Swap the Pair
        Pair<Integer, String> swappedPair = nameAndAge.swap();

        // Display the swapped values
        System.out.println("Original Pair: (" + nameAndAge.getFirst() + ", " + nameAndAge.getSecond() + ")");
        System.out.println("Swapped Pair: (" + swappedPair.getFirst() + ", " + swappedPair.getSecond() + ")");
*/
        // problem 4
/*
        // Create a dictionary to map String keys to Integer values
        Dict<String, Integer> dict = new Dict<>();

        // Add key-value pairs to the dictionary
        dict.put("One", 1);
        dict.put("Two", 2);
        dict.put("Three", 3);

        // Retrieve values using keys
        System.out.println("Key 'One': " + dict.get("One")); // Output: Key 'One': 1
        System.out.println("Key 'Two': " + dict.get("Two")); // Output: Key 'Two': 2
        System.out.println("Key 'Four': " + dict.get("Four")); // Output: Key 'Four': null

        // Update an existing key-value pair
        dict.put("Two", 22);
        System.out.println("Updated Key 'Two': " + dict.get("Two")); // Output: Updated Key 'Two': 22

        // Add a new key-value pair
        dict.put("Four", 4);
        System.out.println("Key 'Four': " + dict.get("Four")); // Output: Key 'Four': 4
*/
        // problem 5
/*
        // Create a Multiset of Strings
        Multiset<String> multiset = new Multiset<>();

        // Add elements
        multiset.add("apple");
        multiset.add("apple");
        multiset.add("banana");

        // Check counts
        System.out.println("Count of apple: " + multiset.count("apple")); // Output: 2
        System.out.println("Count of banana: " + multiset.count("banana")); // Output: 1
        System.out.println("Count of orange: " + multiset.count("orange")); // Output: 0

        // Remove an element
        multiset.remove("apple");
        System.out.println("Count of apple after removal: " + multiset.count("apple")); // Output: 1

        // Check size (distinct elements)
        System.out.println("Size of multiset: " + multiset.size()); // Output: 2
*/
        // problem 6
/*
        Multimap<String, String> multimap = new Multimap<>();

        // Add values
        multimap.put("fruit", "apple");
        multimap.put("fruit", "banana");
        multimap.put("vegetable", "carrot");

        // Retrieve values
        Set<String> fruits = multimap.get("fruit");
        System.out.println("Fruits: " + fruits); // Output: Fruits: [apple, banana]

        Set<String> vegetables = multimap.get("vegetable");
        System.out.println("Vegetables: " + vegetables); // Output: Vegetables: [carrot]

        Set<String> nonExistent = multimap.get("meat");
        System.out.println("Meat: " + nonExistent); // Output: Meat: []

        // All values in the multimap
        Set<String> allValues = multimap.values();
        System.out.println("All Values: " + allValues); // Output: All Values: [apple, banana, carrot]
*/
        // problem 7
/*
        BidirectionalMap<String, Integer> biMap = new BidirectionalMap<>();

        // Add mappings
        biMap.put("Alice", 1);
        biMap.put("Bob", 2);
        biMap.put("Charlie", 3);

        // Test forward lookup
        System.out.println("Alice maps to: " + biMap.getForward("Alice")); // Output: 1
        System.out.println("Bob maps to: " + biMap.getForward("Bob")); // Output: 2

        // Test backward lookup
        System.out.println("1 maps to: " + biMap.getBackward(1)); // Output: Alice
        System.out.println("2 maps to: " + biMap.getBackward(2)); // Output: Bob

        // Update mappings (overwrite)
        biMap.put("Alice", 4);
        System.out.println("Alice maps to: " + biMap.getForward("Alice")); // Output: 4
        System.out.println("4 maps to: " + biMap.getBackward(4)); // Output: Alice

        // Check old mappings are removed
        System.out.println("1 maps to: " + biMap.getBackward(1)); // Output: null
*/
        // problem 8
/*
        // Create a queue with a capacity of 5
        Queue<Integer> queue = new Queue<>(5);

        // Enqueue elements
        System.out.println("Enqueuing elements: 1, 2, 3");
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue one element
        System.out.println("Dequeued: " + queue.dequeue()); // Should print 1

        // Enqueue more elements
        System.out.println("Enqueuing elements: 4, 5, 6");
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // This will wrap around to the start of the array

        // Attempt to dequeue all elements
        System.out.println("Dequeuing all elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        // Test the drain method
        System.out.println("Testing the drain method:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Last element drained: " + queue.drain(2)); // Should drain 10 and 20, return 20
        System.out.println("Is queue empty? " + queue.isEmpty()); // Should print false

        // Dequeue remaining element
        System.out.println("Dequeued: " + queue.dequeue()); // Should print 30

        // Test edge cases
        System.out.println("Testing edge cases:");
        try {
            System.out.println("Dequeue from an empty queue:");
            queue.dequeue(); // Should throw an exception
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Test completed.");
*/
        // problem 9
        Faculty profSmith = new Faculty("Dr. Smith", 45);
        Student alice = new Student("Alice", 20);
        Student bob = new Student("Bob", 22);

        Course math101 = new Course("Math 101");
        profSmith.addCourse(math101);

        alice.enrollInCourse(math101);
        bob.enrollInCourse(math101);

        System.out.println(math101);
        System.out.println("Enrolled students:");
        for (Student student : math101.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
