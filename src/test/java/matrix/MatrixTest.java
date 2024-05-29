package matrix;

import matrix.domain.Point;
import matrix.domain.PointA;
import matrix.domain.PointB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    @Test
    @DisplayName("구분된 데이터를 포인트A와 포인트B에 데이터를 삽입하는 기능")
    void 포인트A_포인트B_데이터삽입(){
        assertThat(new PointA(10, 10)).hasToString("10 10");
        assertThat(new PointB( 14, 15)).hasToString("14 15");
    }
    @Test
    @DisplayName("x, y 24초과이면 에러발생")
    void 초과시_에러(){
        String message = Assertions.assertThrows(IllegalArgumentException.class, ()-> new PointA(25, 10)).getMessage();
        assertThat(message).isEqualTo("24초과입니다. 다시 입력해주세요");
    }
    @Test
    @DisplayName("포인트 두 점 사이의 거리를 계산한다")
    void 두_점_사이의거리계산(){
        Point point = new Point(new PointA(10, 10), new PointB( 14, 15));
        assertEquals(point.pointDistance(), 6.403124, 0.000001);
    }
}
