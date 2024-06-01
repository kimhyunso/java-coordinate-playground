package matrix.controller;

import matrix.domain.Point;

import java.util.List;

public class PointReport {
    private final Point pointA;
    private final Point pointB;
    private final InputView inputView;

    public PointReport(List<Integer> positions, InputView inputView) {
        this.pointA = new Point(positions.get(0), positions.get(1));
        this.pointB = new Point(positions.get(2), positions.get(3));
        this.inputView = inputView;
    }
    public void print(){
        double result = pointA.getDistance(pointB);
        inputView.printMatrix(pointA, pointB);
        System.out.printf("두 점 사이의 거리는 %.6f\n", result);
    }
}
