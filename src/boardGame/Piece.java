package boardGame;

public class Piece {
    protected Position position;

    private Board board;

    public Piece(Board board) {
        this.board = board;

        // The position of a new piece is null, that is, it has not been put on the board yet.
        position = null;
    }

    // Only classes and subclasses in the same package are allowed to access the board.
    protected Board getBoard() {
        return board;
    }
}
