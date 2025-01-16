package one;

public class Box<T> {
    private T content;

    // Constructor to initialize the box
    public Box(T content) {
        if (content == null) {
            throw new IllegalArgumentException("Box cannot contain null value.");
        }
        this.content = content;
    }

    // Getter method
    public T getContent() {
        return content;
    }

    // Setter method
    public void setContent(T content) {
        if (content == null) {
            throw new IllegalArgumentException("Box cannot contain null value.");
        }
        this.content = content;
    }
}
