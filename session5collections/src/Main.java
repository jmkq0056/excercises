import java.util.ArrayList;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1 ArrayList
/*
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Date");
        System.out.println("List: " + list);
        System.out.println("Index Of Cherry " + list.indexOf("Cherry"));
        list.remove(2);
        list.remove("Banana");
        System.out.println("After removal: " + list);
*/
        // 2 HashSet
/*
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Apple"); // Duplicate, ignored
        set.add("Banana");
        set.add("Cherry");
        System.out.println("Set: " + set); // [Apple, Banana, Cherry]
        set.remove("Banana");
        System.out.println("After removal: " + set); // [Apple, Cherry]
*/
        // 3 HashMap
/*
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Alice", 28); // Overwrites Alice's value
        System.out.println("Map: " + map); // {Alice=28, Bob=30}
        System.out.println("Contains Bob? " + map.containsKey("Bob"));
        System.out.println("Value for Alice: " + map.getOrDefault("Alice", 0));
        map.remove("Bob");
        System.out.println("After removal: " + map); // {Alice=28}
*/
        // 4 Queue Example: LinkedList
/*
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue Peek: " + queue.peek());
        queue.poll();
        System.out.println("After poll: " + queue);
*/
        // 5 Stack
/*
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Stack Peek: " + stack.peek()); // Second
        stack.pop(); // Remove Second
        System.out.println("After pop: " + stack); // [First]'
*/
        // 6 Additional Collection Methods
/*
        Collection<String> collection = new ArrayList<>(List.of("A", "B", "C"));
        System.out.println("Collection size: " + collection.size()); // 3
        System.out.println("Contains A? " + collection.contains("A")); // true
        collection.remove("B");
        System.out.println("After removal: " + collection); // [A, C]
        collection.clear();
        System.out.println("Is empty? " + collection.isEmpty()); // true
*/
        // 7 Sorting and Shuffling
/*
        List<Integer> numbers = new ArrayList<>(List.of(5, 3, 8, 1));
        Collections.sort(numbers); // Sort in ascending order
        System.out.println("Sorted: " + numbers); // [1, 3, 5, 8]
        Collections.shuffle(numbers); // Random shuffle
        System.out.println("Shuffled: " + numbers); // Random order
*/

    }

}