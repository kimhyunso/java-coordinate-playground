package matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.print.PrintException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MatrixTest {
    @Test
    @DisplayName("구분된 데이터를 포인트A와 포인트B에 데이터를 삽입하는 기능")
    void 포인트A_포인트B_데이터삽입(){
        assertThat(new PointA(10, 10)).hasToString("10 10");
        assertThat(new PointB( 14, 15)).hasToString("14 15");
    }

    @Test
    @DisplayName("입력값 중 하나라도 24초과라면 에러발생")
    void 초과시_에러(){
        String message = Assertions.assertThrows(IllegalArgumentException.class, ()-> new PointA(25, 10)).getMessage();
        assertThat(message).isEqualTo("24초과입니다. 다시 입력해주세요");
    }

}
