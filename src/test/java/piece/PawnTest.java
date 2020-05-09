package piece;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class PawnTest {
    @Test
    public void givenACellNumberAPawnShouldBeAbleToMoveAStepForward(){
        //given
        Pawn aPawn = new Pawn();

        //when
        List<String> output = aPawn.getMoves("B2");

        //then
        List<String> expectedOutput = Arrays.asList("C1", "C2", "C3");
        Assert.assertEquals(expectedOutput, output);
    }
}
