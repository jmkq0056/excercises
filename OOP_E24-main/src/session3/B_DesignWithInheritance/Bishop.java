package session3.B_DesignWithInheritance;

public class Bishop extends ChessPiece{
    public Bishop(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard,"Bishop",color, x, y);
    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success =
                Movements.isLegalDiagonalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 1);

        return success;
    }
}


