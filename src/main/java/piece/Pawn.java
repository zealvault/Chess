package piece;

import java.util.Arrays;
import java.util.List;

public class Pawn {
    public Pawn() {
    }

    public List<String> getMoves(String position) {
        return Arrays.asList("C1", "C2", "C3");
    }
}
