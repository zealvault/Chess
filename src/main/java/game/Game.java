package game;

import board.ChessBoard;
import common.Position;
import exception.BoardInitializationException;
import piece.Pawn;
import rule.Rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Game {

    ChessBoard board;

    public Game(Pawn aPawn, Position position) throws BoardInitializationException {
        this.board = new ChessBoard(asList(aPawn), asList(position));
    }

    public Set<Position> getMoves(Position position) {
        Pawn piece = board.getPieceAt(position);
        List<Rule> rules = piece.getRules(position);

        Set<Position> moves = rules.stream().map(rule -> applyRule(rule, position)).flatMap(List::stream).collect(Collectors.toSet());
        return moves.stream().filter(pos -> board.isValid(pos)).collect(Collectors.toSet());
    }

    private List<Position> applyRule(Rule rule, Position initialPosition){
        List<Position> positions = new ArrayList<>();
        Position current = initialPosition;
        int times = rule.getTimes();
        for(int i = 0; i < times; i++){
            current = rule.getMove().next(current);
            positions.add(current);
        }
        return positions;
    }

}
