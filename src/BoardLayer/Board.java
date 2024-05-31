package BoardLayer;

public class Board {
    private int rows;
    private int cols;
    private Piece[][] pieces;

    public Board(int rows, int cols) {
        if(rows < 1 || cols < 1){
            throw new BoardException("Error creating board, there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.cols = cols;
        this.pieces = new Piece[rows][cols];
    }


    public Piece piece(int row, int col){
        if(!positionExist(new Position(row, col))){
            throw new BoardException("Error getting piece, position does not exists");
        }
        return pieces[row][col];
    }
    public Piece piece(Position position){
        if(!positionExist(position)){
            throw new BoardException("Error getting piece, position does not exist");
        }
        return pieces[position.getLine()][position.getColumn()];
    }
    public void placePiece(Piece piece, Position pos){
        if(thereIsAPiece(pos)){
            throw new BoardException("There is already a piece in position " + pos);
        }
       pieces[pos.getLine()][pos.getColumn()] = piece;
       piece.position = pos;
    }
    public Piece removePiece(Position position){
        if(!positionExist(position)){
            throw new BoardException("Error removing piece, position does not exist");
        }
        if((piece(position)) == null){
            return null;
        }
        else{
            Piece aux = piece(position);
            aux.position = null;
            pieces[position.getLine()][position.getColumn()] = null;
            return aux;
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Piece[][] getPieces() {
        return pieces;
    }

    public void setPieces(Piece[][] pieces) {
        this.pieces = pieces;
    }

    public  boolean positionExist(int row, int col){
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    public boolean positionExist(Position position){
        return positionExist(position.getLine(), position.getColumn());
    }
    public boolean thereIsAPiece(Position position){
        if(!positionExist(position)){
            throw new BoardException("Error checking piece, position does not exist " + position);
        }
        return piece(position) != null;
    }


}
