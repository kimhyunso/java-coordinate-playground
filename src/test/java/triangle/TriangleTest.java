package triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.Utils;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.in;

public class TriangleTest {

    private List<Integer> inputs;


    @BeforeEach
    void setUp() {
        inputs = Utils.split("(10,10)-(14,15)-(20,8)");
    }

    @Test
    @DisplayName("특수문자가 제거된 리스트를 point 객체로 바꾸는 기능")
    void 특수문자제거_point객체로변경() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(20, 8));

        Triangle triangle = new Triangle(inputs);
        assertThat(points).hasToString(triangle.toString());
    }

    @Test
    @DisplayName("삼각형 넓이 구하는 기능")
    void getArea() {
        Triangle triangle = new Triangle(inputs);
        double area = triangle.getArea();
        assertThat(area).isEqualTo(16.0);
    }

}
