package matrix;

import matrix.domain.Point;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    @DisplayName("입력값 중 하나라도 24초과라면 에러발생")
    void 초과시_에러(){
        assertThatThrownBy(() -> {
            Point point = new Point(25, 24);
        }).isInstanceOf(IllegalArgumentException.class);

        new Point(24, 24);

        assertThatThrownBy(() -> {
            Point point = new Point(24, 25);
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    @DisplayName("포인트 두 점 사이의 거리를 계산한다")
    void 두_점_사이의거리계산(){
        Point pointA = new Point(10, 10);
        Point pointB = new Point(14, 15);

        assertEquals(pointA.getDistance(pointB), 6.403124, 0.000001);
    }
}
