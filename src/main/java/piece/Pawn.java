package piece;

import common.Position;
import rule.Moves;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Pawn extends Piece {

    public Pawn() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveAStepForward = new Rule(1, Moves.moveForward);
        Rule moveAStepDiagonallyRight = new Rule(1, Moves.moveDiagonallyRight);
        Rule moveAStepDiagonallyLeft = new Rule(1, Moves.moveDiagonallyLeft);

        return Arrays.asList(moveAStepForward, moveAStepDiagonallyRight, moveAStepDiagonallyLeft);
    }
}
