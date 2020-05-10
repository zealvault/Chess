package game;

import common.Position;
import exception.BoardInitializationException;
import org.junit.Assert;
import org.junit.Test;
import piece.Pawn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GameTest {
    @Test
    public void shouldGetMovesForGivenPawnAndPosition() throws BoardInitializationException {
        //given
        Pawn aPawn = new Pawn();
        Position position = new Position(1,1);
        Game game = new Game(aPawn, position);

        //when
        Set<Position> moves = game.getMoves(position);

        //then
        Set<Position> expectedMoves = new HashSet(Arrays.asList(new Position(2, 0), new Position(2, 2), new Position(2, 1)));
        Assert.assertEquals(expectedMoves, moves);

    }

    @Test
    public void shouldIgnoreOutOfBoardMoves() throws BoardInitializationException {
        //given
        Pawn aPawn = new Pawn();
        Position position = new Position(0,0);
        Game game = new Game(aPawn, position);

        //when
        Set<Position> moves = game.getMoves(position);

        //then
        Set<Position> expectedMoves = new HashSet(Arrays.asList(new Position(1, 0), new Position(1, 1)));
        Assert.assertEquals(expectedMoves, moves);

    }
}
