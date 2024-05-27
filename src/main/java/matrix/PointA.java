package matrix;

import java.util.List;

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

    @Override
    public String toString() {
        return x + " " + y;
    }
}
