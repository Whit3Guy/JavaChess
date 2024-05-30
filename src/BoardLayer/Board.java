package BoardLayer;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.pieces = new Piece[rows][cols];
    }


    public Piece piece(int row, int col){
        return pieces[row][col];
    }
    public Piece piece(Position position){
        return pieces[position.getLine()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position pos){
       pieces[pos.getLine()][pos.getColumn()] = piece;
       piece.position = pos;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }
}
