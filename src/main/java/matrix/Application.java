package matrix;

import matrix.controller.InputView;
import matrix.domain.Point;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<Integer> positions = inputView.inputMatrix();

        Point pointA = new Point(positions.get(0), positions.get(1));
        Point pointB = new Point(positions.get(2), positions.get(3));

        double result = pointA.getDistance(pointB);
        System.out.printf("두 점 사이의 거리는 %.6f", result);
    }
}
