package piece;


import exception.InvalidPieceException;
import org.junit.Assert;
import org.junit.Test;

public class PieceTest {

    @Test
    public void getPiece() throws InvalidPieceException {
        //when
        Piece piece = Piece.getPiece("Pawn");

        //then
        Assert.assertTrue(piece instanceof Pawn);
    }

    @Test(expected = InvalidPieceException.class)
    public void shouldThrowInvalidPieceException() throws InvalidPieceException {
        //when
        Piece piece = Piece.getPiece("Invalid Piece");
    }
}
