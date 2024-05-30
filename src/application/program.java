package application;

import BoardLayer.Board;
import BoardLayer.Position;
import ChessLayer.ChessMatch;

public class program {
    public static void main(String[] args){
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());


    }

}
