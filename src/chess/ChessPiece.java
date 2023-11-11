package chess;

import board_game.Board;
import board_game.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int movCount;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMovCount() {
        return movCount;
    }
}
