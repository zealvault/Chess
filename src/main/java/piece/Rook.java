package piece;

import common.Position;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Rook extends Piece {
    public Rook() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveForward = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY()));
        Rule moveLeft = new Rule(8, previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() + 1));

        Rule moveBackward = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY()));
        Rule moveRight = new Rule(8, previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() - 1));


        return Arrays.asList(moveForward, moveBackward, moveLeft, moveRight);
    }
}
