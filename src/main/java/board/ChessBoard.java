package board;

import common.Position;
import exception.BoardInitializationException;
import piece.Piece;

import java.util.List;

public class ChessBoard {
    int ROWS = 8;
    int COLUMNS = 8;

    private Piece[][] board = new Piece[ROWS][COLUMNS];

    public ChessBoard() {
    }

    public Piece[][] getBoard() {
        return board;
    }

    public ChessBoard(List<Piece> pawns, List<Position> positions) throws BoardInitializationException {
        if(pawns.size() != positions.size()){
            throw new BoardInitializationException("Pieces and Positions dont match");
        }

        if(positions.stream().anyMatch(position -> (position.getX() >= ROWS || position.getX() < 0)
                || (position.getY() >= COLUMNS || position.getY() < 0))){
            throw new BoardInitializationException("Invalid Position passed");
        }

        int counter = 0;
        for(Position position : positions){
            board[position.getX()][position.getY()] = pawns.get(counter);
            counter++;
        }
    }

    public Piece getPieceAt(Position position) {
        return board[position.getX()][position.getY()];
    }

    public boolean isValid(Position position) {
        return (position.getX() < ROWS && position.getX() >= 0) && (position.getY() < COLUMNS && position.getY() >= 0);
    }
}
