package piece;

import common.Position;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Bishop extends Piece {
    public Bishop() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveDiagonallyRight = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() - 1));
        Rule moveDiagonallyLeft = new Rule(8, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() + 1));

        Rule moveDiagonallyRightBack = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() + 1));
        Rule moveDiagonallyLeftBack = new Rule(8, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() - 1));

        return Arrays.asList(moveDiagonallyRight, moveDiagonallyLeft, moveDiagonallyRightBack, moveDiagonallyLeftBack);
    }
}
