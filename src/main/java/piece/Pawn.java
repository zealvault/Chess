package piece;

import common.Position;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Pawn {

    public Pawn() {
    }

    public List<Rule> getRules(Position position) {
        Rule moveAStepForward = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY()));
        Rule moveAStepDiagonallyRight = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY()));
        Rule moveAStepDiagonallyLeft = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY()));

        return Arrays.asList(moveAStepForward, moveAStepDiagonallyRight, moveAStepDiagonallyLeft);
    }
}
