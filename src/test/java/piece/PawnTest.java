package piece;

import common.Position;
import org.junit.Assert;
import org.junit.Test;
import rule.Rule;

import java.util.Arrays;
import java.util.List;

public class PawnTest {
    @Test
    public void givenACellNumberAPawnShouldBeAbleToMoveAStepForward() {
//        //given
//        Pawn aPawn = new Pawn();
//
//        //when
//        List<Rule> output = aPawn.getRules(new Position(0, 1));
//
//        //then
//        List<Position> expectedOutput = Arrays.asList(new Position(1, 0), new Position(1, 1), new Position(1, 2));
//        Assert.assertEquals(expectedOutput, output);
    }

    @Test
    public void givenAPawnAtTheLastCellShouldNotBeAbleToMove() {
//        //given
//        Pawn aPawn = new Pawn();
//
//        //when
//        List<Position> output = aPawn.getRules(new Position(7, 2));
//
//        //then
//        List<Position> expectedOutput = Arrays.asList(new Position(7, 2));
//        Assert.assertEquals(expectedOutput, output);
    }
}
