package rule;

public class Rule {
    private int times;
    private Move move;

    public int getTimes() {
        return times;
    }

    public Move getMove() {
        return move;
    }

    public Rule(int times, Move move) {
        this.times = times;
        this.move = move;
    }
}

