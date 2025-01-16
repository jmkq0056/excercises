package eight;

public abstract class ChessPiece {
    private String color; // "White" or "Black"
    private int x; // Current x-position on the board
    private int y; // Current y-position on the board

    public ChessPiece(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Abstract method to check if a move is valid for the specific piece
    public abstract boolean isValidMove(int newX, int newY, ChessPiece[][] board);
}
