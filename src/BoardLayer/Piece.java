package BoardLayer;

public abstract class Piece {
    protected Position position;
    public Board board;


    public Piece(Board board) {
        this.board = board;
    }

    public Position getPosition() {
        return position;
    }

    protected Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position){
        return possibleMoves()[position.getLine()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++){
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
