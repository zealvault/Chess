package piece;

import common.Position;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Horse extends Piece {

    public Horse() {
    }

    @Override
    public List<Rule> getRules(Position position) {
        Rule move1 = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 2, previousPosition.getY() + 1));
        Rule move2 = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 2, previousPosition.getY() - 1));
        Rule move3 = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() + 2));
        Rule move4 = new Rule(1, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() + 2));

        Rule move5 = new Rule(1, previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() - 2));
        Rule move6 = new Rule(1, previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() - 2));
        Rule move7 = new Rule(1, previousPosition -> new Position(previousPosition.getX() - 2, previousPosition.getY() + 1));
        Rule move8 = new Rule(1, previousPosition -> new Position(previousPosition.getX() - 2, previousPosition.getY() - 1));

        return Arrays.asList(move1, move2, move3, move4, move5, move6, move7, move8);
    }
}
