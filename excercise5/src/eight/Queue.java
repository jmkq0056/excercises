package eight;

public class Queue<T> {
    private T[] elements;
    private int current;
    private int next;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = (T[]) new Object[capacity];
        this.current = 0;
        this.next = 0;
        this.size = 0;
    }

    public void enqueue(T t) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        elements[next] = t;
        next = (next + 1) % capacity;
        size++;
    }

    public T dequeue() {
        if(size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = elements[current];
        elements[current] = null;
        current = (current + 1) % capacity;
        size--;
        return element;
    }

    public T drain(int n) {
        if(size == 0){
            throw new IllegalStateException("Queue is empty");
        }
        T lastRemoved = null;
        for(int i = 0; i < n && size > 0; i++){
            lastRemoved = dequeue();
        }
        return lastRemoved;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
