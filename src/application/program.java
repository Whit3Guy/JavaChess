package application;

import ChessLayer.ChessExeption;
import ChessLayer.ChessMatch;
import ChessLayer.ChessPiece;
import ChessLayer.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.printf("Source: ");
                ChessPosition source = UI.readChessPosition(sc);
                System.out.printf("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
                System.out.println();
                ChessPiece capturedPiece = chessMatch.performChessmMove(source, target);
            }

            catch (ChessExeption e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }

            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
