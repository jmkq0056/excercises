package eight;

public class ChessBoard {
    private ChessPiece[][] board;
    private String currentPlayer; // "White" or "Black"

    public ChessBoard() {
        board = new ChessPiece[8][8]; // 8x8 chessboard
        currentPlayer = "White";
        initializePieces();
    }

    // Initialize board with basic pieces for simplicity (only Kings for now)
    private void initializePieces() {
        board[0][4] = new King("White", 0, 4);
        board[7][4] = new King("Black", 7, 4);
    }

    public ChessPiece getPiece(int x, int y) {
        return board[x][y];
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        ChessPiece piece = board[startX][startY];

        // Check if there's a piece at the start position and if it's the current player's turn
        if (piece == null || !piece.getColor().equals(currentPlayer)) {
            System.out.println("Invalid move: Not your turn or no piece selected.");
            return false;
        }

        // Check if the move is valid
        if (piece.isValidMove(endX, endY, board)) {
            // Move the piece
            board[endX][endY] = piece;
            board[startX][startY] = null;
            piece.setPosition(endX, endY);

            // Switch the turn
            currentPlayer = currentPlayer.equals("White") ? "Black" : "White";
            return true;
        } else {
            System.out.println("Invalid move for the piece.");
            return false;
        }
    }

    public void displayBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print("- ");
                } else {
                    System.out.print((board[i][j] instanceof King ? "K" : "?") + board[i][j].getColor().charAt(0) + " ");
                }
            }
            System.out.println();
        }
    }
}
