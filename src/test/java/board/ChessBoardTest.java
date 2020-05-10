package board;


import common.Position;
import exception.BoardInitializationException;
import org.junit.Assert;
import org.junit.Test;
import piece.Pawn;

import java.util.Arrays;

public class ChessBoardTest {
    @Test(expected = BoardInitializationException.class)
    public void shouldThrowExceptionWhenNumberOfPiecesAndPositionsDontMatch() throws BoardInitializationException {
        //when
        ChessBoard chessBoard = new ChessBoard(Arrays.asList(new Pawn(), new Pawn()), Arrays.asList(new Position(1, 1)));
    }

    @Test(expected = BoardInitializationException.class)
    public void shouldThrowExceptionWhenAnyPositionIsInvalid() throws BoardInitializationException {
        //when
        ChessBoard chessBoard = new ChessBoard(Arrays.asList(new Pawn()), Arrays.asList(new Position(1, 8)));
    }

    @Test(expected = BoardInitializationException.class)
    public void shouldThrowExceptionWhenAnyPositionIsNegative() throws BoardInitializationException {
        //when
        ChessBoard chessBoard = new ChessBoard(Arrays.asList(new Pawn()), Arrays.asList(new Position(1, -1)));
    }

    @Test
    public void shouldInitializeChessBoard() throws BoardInitializationException {
        //given
        Pawn pawnOne = new Pawn();
        Pawn pawnTwo = new Pawn();

        //when
        ChessBoard chessBoard = new ChessBoard(Arrays.asList(pawnOne, pawnTwo), Arrays.asList(new Position(1, 1), new Position(1, 2)));

        //then
        Assert.assertEquals(pawnOne, chessBoard.getBoard()[1][1]);
        Assert.assertEquals(pawnTwo, chessBoard.getBoard()[1][2]);
    }
}
