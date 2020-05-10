package game;

import common.Position;
import exception.BoardInitializationException;
import org.junit.Assert;
import org.junit.Test;
import piece.Horse;
import piece.Pawn;
import piece.Queen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Queue;
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

    @Test
    public void shouldGetMovesForGivenQueenAndPosition() throws BoardInitializationException {
        //given
        Queen aQueen = new Queen();
        Position position = new Position(0,0);
        Game game = new Game(aQueen, position);

        //when
        Set<Position> moves = game.getMoves(position);

        //then
        Set<Position> expectedMoves = new HashSet(Arrays.asList(new Position(1, 0), new Position(2, 0), new Position(3, 0), new Position(4, 0), new Position(5, 0), new Position(6, 0), new Position(7, 0),
                new Position(0, 1), new Position(0, 2), new Position(0, 3), new Position(0, 4), new Position(0, 5), new Position(0, 6), new Position(0, 7),
                new Position(1, 1), new Position(2, 2), new Position(3, 3), new Position(4, 4), new Position(5, 5), new Position(6, 6), new Position(7, 7)));
        Assert.assertEquals(expectedMoves, moves);

    }

    @Test
    public void shouldGetMovesForGivenHorseAndPosition() throws BoardInitializationException {
        //given
        Horse aHorse = new Horse();
        Position position = new Position(0,1);
        Game game = new Game(aHorse, position);

        //when
        Set<Position> moves = game.getMoves(position);

        //then
        Set<Position> expectedMoves = new HashSet(Arrays.asList(new Position(2, 2), new Position(2, 0), new Position(1, 3)));
        Assert.assertEquals(expectedMoves, moves);

    }
}
