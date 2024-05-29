package matrix.domain;

import java.util.List;
import java.util.Objects;

public class PointA {
    public static final int MAX_NO = 24;
    private final int x;
    private final int y;

    public PointA(int x, int y) {
        if (x > MAX_NO || y > MAX_NO){
            throw new IllegalArgumentException("24초과입니다. 다시 입력해주세요");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PointA pointA = (PointA) o;
        return x == pointA.x && y == pointA.y;
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
