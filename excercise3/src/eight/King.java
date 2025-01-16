package eight;

public class King extends ChessPiece {

    public King(String color, int x, int y) {
        super(color, x, y);
    }

    @Override
    public boolean isValidMove(int newX, int newY, ChessPiece[][] board) {
        int dx = Math.abs(newX - getX());
        int dy = Math.abs(newY - getY());

        // A king can move only one square in any direction
        if (dx <= 1 && dy <= 1) {
            // Ensure the target position is either empty or contains an opponent's piece
            ChessPiece target = board[newX][newY];
            return target == null || !target.getColor().equals(this.getColor());
        }
        return false;
    }
}
