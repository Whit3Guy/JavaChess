package ChessLayer.Pieces;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessPiece;
import ChessLayer.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getCols()];


        Position p = new Position(0,0);

        // above (1,0)
        p.setPosition(p.getLine(),p.getColumn());
        while(getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setLine(p.getLine() - 1);
        }
        if(getBoard().positionExist(p) && isThereOponentPiece(p)){
            mat[p.getLine()][p.getColumn()] = true;
        }
        // below
        while(getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setLine(p.getLine() + 1);
        }
        if(getBoard().positionExist(p) && isThereOponentPiece(p)){
        mat[p.getLine()][p.getColumn()] = true;
        }
        // left
        while(getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setLine(p.getColumn() - 1);
        }
        if(getBoard().positionExist(p) && isThereOponentPiece(p)){
        }
        mat[p.getLine()][p.getColumn()] = true;
        //Right
        while(getBoard().positionExist(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getLine()][p.getColumn()] = true;
            p.setLine(p.getColumn() + 1);
        }
        if(getBoard().positionExist(p) && isThereOponentPiece(p)){
        }
        mat[p.getLine()][p.getColumn()] = true;



        return mat;
    }



}
