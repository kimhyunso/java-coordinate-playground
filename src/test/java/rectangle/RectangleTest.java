package rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setRemoveAssertJRelatedElementsFromStackTrace;

public class RectangleTest {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    private List<Integer> inputs;

    @BeforeEach
    void setUp() {
        pointA = new Point(10, 10);
        pointB = new Point(22, 10);
        pointC = new Point(22, 18);
        inputs = Arrays.asList(10, 10, 22, 10, 22, 18, 10, 18);
    }

    @Test
    @DisplayName("특수문자가 제거된 리스트를 point 객체로 바꾸는 기능")
    void 특수문자제거_point객체로변경() {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18));

        Rectangle rectangle = new Rectangle(inputs);
        assertThat(points).hasToString(rectangle.toString());
    }

    @Test
    @DisplayName("width 구하는 기능")
    void getWidth() {
        assertThat(pointA.width(pointB)).isEqualTo(12);
    }

    @Test
    @DisplayName("height 구하는 기능")
    void getHeight() {
        assertThat(pointB.height(pointC)).isEqualTo(8);
    }

    @Test
    @DisplayName("사각형의 넓이를 구하는 기능")
    void getArea() {
        Rectangle rectangle = new Rectangle(inputs);
        int area = rectangle.getArea();

        assertThat(area).isEqualTo(96);
    }



}
