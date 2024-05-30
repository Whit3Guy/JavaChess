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

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2,4));
        board.placePiece(new King(board, Color.BLACK), new Position(2,5));
        board.placePiece(new King(board, Color.WHITE), new Position(7,7));

    }


}

