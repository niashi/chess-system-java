package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch mat = new ChessMatch();
        UI.printBoard(mat.getPieces());

    }
}
