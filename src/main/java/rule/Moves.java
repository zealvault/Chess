package rule;

import common.Position;

public class Moves {
    public static Move moveForward = previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY());
    public static Move moveBackward = previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY());

    public static Move moveDiagonallyRight = previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() - 1);
    public static Move moveDiagonallyRightBack = previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() + 1);

    public static Move moveDiagonallyLeft = previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() + 1);
    public static Move moveDiagonallyLeftBack = previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() - 1);

    public static Move moveLeft = previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() + 1);
    public static Move moveRight = previousPosition -> new Position(previousPosition.getX(), previousPosition.getY() - 1);

    public static Move knightMove1 = previousPosition -> new Position(previousPosition.getX() + 2, previousPosition.getY() + 1);
    public static Move knightMove8 = previousPosition -> new Position(previousPosition.getX() - 2, previousPosition.getY() - 1);

    public static Move knightMove3 = previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() + 2);
    public static Move knightMove6 = previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() - 2);

    public static Move knightMove2 = previousPosition -> new Position(previousPosition.getX() + 2, previousPosition.getY() - 1);
    public static Move knightMove7 = previousPosition -> new Position(previousPosition.getX() - 2, previousPosition.getY() + 1);

    public static Move knightMove4 = previousPosition -> new Position(previousPosition.getX() - 1, previousPosition.getY() + 2);
    public static Move knightMove5 = previousPosition -> new Position(previousPosition.getX() + 1, previousPosition.getY() - 2);

}
