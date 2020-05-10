package rule;

import common.Position;

public interface Move {
    Position next(Position position);
}