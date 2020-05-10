package rule;

public class Rule {
    private int times;
    public Move move;

    public int getTimes() {
        return times;
    }

    public Rule(int times, Move move) {
        this.times = times;
        this.move = move;
    }
}

