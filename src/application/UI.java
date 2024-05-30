package application;

import ChessLayer.ChessPiece;

public class UI {
    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8-i) + " ");
            for (int j = 0; j < pieces[i].length; j++) {
                printOnePiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }
    private static void printOnePiece(ChessPiece x){
        if(x == null){
            System.out.print("-");
        }
        else{
            System.out.print(x);
        }
        System.out.print(" ");
    }
}
