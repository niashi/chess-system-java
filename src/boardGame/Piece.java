package boardGame;

public abstract class Piece {
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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove() {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
