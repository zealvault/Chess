package piece;

import common.Position;
import rule.Moves;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class Horse extends Piece {

    public Horse() {
    }

    @Override
    public List<Rule> getRules(Position position) {
        Rule move1 = new Rule(1, Moves.knightMove1);
        Rule move8 = new Rule(1, Moves.knightMove8);

        Rule move3 = new Rule(1, Moves.knightMove3);
        Rule move6 = new Rule(1, Moves.knightMove6);

        Rule move2 = new Rule(1, Moves.knightMove2);
        Rule move7 = new Rule(1, Moves.knightMove7);

        Rule move4 = new Rule(1, Moves.knightMove4);
        Rule move5 = new Rule(1, Moves.knightMove5);

        return Arrays.asList(move1, move2, move3, move4, move5, move6, move7, move8);
    }
}
