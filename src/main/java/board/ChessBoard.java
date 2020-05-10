package board;

import common.Position;
import exception.BoardInitializationException;
import piece.Pawn;

import java.util.List;

public class ChessBoard {
    int ROWS = 8;
    int COLUMNS = 8;

     Pawn[][] board = new Pawn[ROWS][COLUMNS];

    public ChessBoard() {
    }

    public ChessBoard(List<Pawn> pawns, List<Position> positions) throws BoardInitializationException {
        if(pawns.size() != positions.size()){
            throw new BoardInitializationException("Pieces and Positions dont match");
        }

        if(positions.stream().anyMatch(position -> (position.getX() >= ROWS || position.getX() < 0)
                || (position.getY() >= COLUMNS || position.getY() < 0))){
            throw new BoardInitializationException("Invalid Position passed");
        }
    }
}
