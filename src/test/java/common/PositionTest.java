package common;


import org.junit.Assert;
import org.junit.Test;

public class PositionTest {
    @Test
    public void shouldInitializeBasedOnStringPosition(){
        //when
        Position position = new Position("D5");

        //then
        Assert.assertEquals(new Position(3, 4), position);
    }

    @Test
    public void shouldDisplayPositionInChessFormat(){
        //when
        Position position = new Position(3, 4);

        //then
        Assert.assertEquals("D5", position.toString());
    }
}
