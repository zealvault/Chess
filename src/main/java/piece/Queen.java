package piece;


import common.Position;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Queen extends Piece {
    public Queen() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveForward = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY()));
        Rule moveDiagonallyRight = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() - 1));
        Rule moveDiagonallyLeft = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() + 1));
        Rule moveLeft = new Rule(8, previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() + 1));

        Rule moveBackward = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY()));
        Rule moveDiagonallyRightBack = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() + 1));
        Rule moveDiagonallyLeftBack = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() - 1));
        Rule moveRight = new Rule(8, previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() - 1));


        return Arrays.asList(moveForward, moveDiagonallyRight, moveDiagonallyLeft, moveBackward, moveDiagonallyRightBack, moveDiagonallyLeftBack, moveLeft, moveRight);
    }
}
