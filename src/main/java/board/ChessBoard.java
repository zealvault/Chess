package board;

import common.Position;
import exception.BoardInitializationException;
import piece.Pawn;

import java.util.List;

public class ChessBoard {
    int ROWS = 8;
    int COLUMNS = 8;


    private Pawn[][] board = new Pawn[ROWS][COLUMNS];

    public ChessBoard() {
    }

    public Pawn[][] getBoard() {
        return board;
    }

    public ChessBoard(List<Pawn> pawns, List<Position> positions) throws BoardInitializationException {
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

    public Pawn getPieceAt(Position position) {
        return board[position.getX()][position.getY()];
    }

    public boolean isValid(Position position) {
        return (position.getX() <= ROWS && position.getX() >= 0) && (position.getY() <= ROWS && position.getY() >= 0);
    }
}
