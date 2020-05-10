import common.Position;
import exception.BoardInitializationException;
import exception.InvalidPieceException;
import game.Game;
import piece.Piece;

import java.util.Scanner;
import java.util.Set;

public class GameConsole {
    public static void main(String[] args) throws InvalidPieceException, BoardInitializationException {
        Scanner scanner = new Scanner(System.in);
        String input[] = scanner.nextLine().split(" ");

        Position position = new Position(input[1]);
        Piece piece = Piece.getPiece(input[0]);

        Game game = new Game(piece, position);

        Set<Position> moves = game.getMoves(position);
        System.out.printf(moves.toString());
    }


}
