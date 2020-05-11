package piece;

import common.Position;
import rule.Moves;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class King extends Piece {
    public King() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveForward = new Rule(1, Moves.moveForward);
        Rule moveBackward = new Rule(1, Moves.moveBackward);

        Rule moveDiagonallyRight = new Rule(1, Moves.moveDiagonallyRight);
        Rule moveDiagonallyRightBack = new Rule(1, Moves.moveDiagonallyRightBack);

        Rule moveDiagonallyLeft = new Rule(1, Moves.moveDiagonallyLeft);
        Rule moveDiagonallyLeftBack = new Rule(1, Moves.moveDiagonallyLeftBack);

        Rule moveLeft = new Rule(1, Moves.moveLeft);
        Rule moveRight = new Rule(1, Moves.moveRight);


        return Arrays.asList(moveForward, moveDiagonallyRight, moveDiagonallyLeft, moveBackward, moveDiagonallyRightBack, moveDiagonallyLeftBack, moveLeft, moveRight);
    }
}
