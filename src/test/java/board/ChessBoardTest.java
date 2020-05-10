package board;


import common.Position;
import exception.BoardInitializationException;
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
}
