package matrix.domain;

import java.util.List;
import java.util.Objects;

public class PointB {
    private final int x;
    private final int y;

    public PointB(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointB pointB = (PointB) o;
        return x == pointB.x && y == pointB.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
