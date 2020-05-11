package piece;


import common.Position;
import rule.Moves;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Queen extends Piece {
    public Queen() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveForward = new Rule(8, Moves.moveForward);
        Rule moveBackward = new Rule(8, Moves.moveBackward);

        Rule moveDiagonallyRight = new Rule(8, Moves.moveDiagonallyRight);
        Rule moveDiagonallyRightBack = new Rule(8, Moves.moveDiagonallyRightBack);

        Rule moveDiagonallyLeft = new Rule(8, Moves.moveDiagonallyLeft);
        Rule moveDiagonallyLeftBack = new Rule(8, Moves.moveDiagonallyLeftBack);

        Rule moveLeft = new Rule(8, Moves.moveLeft);
        Rule moveRight = new Rule(8, Moves.moveRight);

        return Arrays.asList(moveForward, moveDiagonallyRight, moveDiagonallyLeft, moveBackward, moveDiagonallyRightBack, moveDiagonallyLeftBack, moveLeft, moveRight);
    }
}
