package matrix;

import matrix.controller.InputView;
import matrix.controller.PointReport;
import matrix.domain.Point;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        List<Integer> positions = inputView.inputMatrix();
        PointReport report = new PointReport(positions, inputView);
        report.print();

        // inputView.printMatrix(pointA, pointB);
    }
}
