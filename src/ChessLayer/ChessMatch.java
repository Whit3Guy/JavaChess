package ChessLayer;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.Pieces.King;
import ChessLayer.Pieces.Rook;


public class ChessMatch {
    private Board board;
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public Board getBoard() {
        return board;
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCols()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int line, ChessPiece chesspiece){
        board.placePiece(chesspiece, new ChessPosition(column, line).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));


}}
