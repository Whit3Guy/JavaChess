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
}
