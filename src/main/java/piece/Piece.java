package piece;

import common.Position;
import exception.InvalidPieceException;
import rule.Rule;

import java.util.List;

public abstract class Piece {
    public static Piece getPiece(String s) throws InvalidPieceException {
        switch (s){
            case "Pawn": return new Pawn();
            case "Queen": return new Queen();
            case "Horse": return new Horse();
            default: throw new InvalidPieceException(s + "is not a valid chess piece");
        }
    }

    public abstract List<Rule> getRules(Position position);


}
