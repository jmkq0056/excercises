package session3.B_DesignWithInheritance;

public class Queen extends ChessPiece {

    public Queen(ChessBoard chessBoard, String color, int x, int y) {
        super(chessBoard,"Queen",color, x, y);

    }

    @Override
    public boolean isLegalTheMovement(int newX, int newY){
        //Check if the movement is allowed.
        boolean success = Movements.isLegalVerticalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8) ||
                Movements.isLegalHorizontalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8) ||
                Movements.isLegalDiagonalMovement(this.getChessBoard(), this.getX(), this.getY(), newX, newY, 8);

        return success;
    }

    public boolean isB(){
        return false;
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        Queen blackQueen = new Queen(chessBoard,"Black",0,0);
        System.out.println(blackQueen);

        ChessPiece chessPiece = new ChessPiece(chessBoard,"Queen","whiteQueen", 0,0);
        //chessPiece.isB();

        chessPiece = blackQueen;

        //chessPiece.isB();



        System.out.println(chessPiece);
    }

}
