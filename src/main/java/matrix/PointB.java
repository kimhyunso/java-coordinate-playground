package matrix;

import java.util.List;

public class PointB {
    private final int x;
    private final int y;

    public PointB(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
