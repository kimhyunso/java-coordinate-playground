package rectangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.*;

public class UtilsTest {

    @Test
    @DisplayName("입력 문자 중 특수문자를 제거 후 하는 기능")
    void 특수문자제거(){
        assertThat(Utils.split("(10,10)-(22,10)-(22,18)-(10,18)")).isEqualTo(Arrays.asList(10, 10, 22, 10, 22, 18, 10, 18));
    }



}
