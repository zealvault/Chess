package piece;

import common.Position;
import rule.Moves;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Bishop extends Piece {
    public Bishop() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveDiagonallyRight = new Rule(8, Moves.moveDiagonallyRight);
        Rule moveDiagonallyRightBack = new Rule(8, Moves.moveDiagonallyRightBack);

        Rule moveDiagonallyLeft = new Rule(8, Moves.moveDiagonallyLeft);
        Rule moveDiagonallyLeftBack = new Rule(8, Moves.moveDiagonallyLeftBack);

        return Arrays.asList(moveDiagonallyRight, moveDiagonallyLeft, moveDiagonallyRightBack, moveDiagonallyLeftBack);
    }
}
