package matrix;

import matrix.validation.Utils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UtilsTest {
    @Test
    @DisplayName("입력된 값 중 괄호 및 쉼표를 제거하여 x값과 y값을 추출하는 기능")
    void 괄호및쉼표제거(){
        assertThat(Utils.filterParseIntegers("(10,10)-(14,15)")).isEqualTo(Arrays.asList(10, 10, 14, 15));
    }

    @Test
    @DisplayName("입력된 값이 이상할 때 검증하는 기능")
    void 입력된값확인(){
        assertThat(Utils.containAlphabet("123")).isFalse();
        assertThat(Utils.containAlphabet("qw12")).isTrue();
    }
}
