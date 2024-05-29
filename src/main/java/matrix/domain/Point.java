package matrix.domain;

public class Point {
    private final PointA pointA;
    private final PointB pointB;

    public Point(PointA pointA, PointB pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
    public double pointDistance() {
        int x1 = pointA.getX();
        int y1 = pointA.getY();

        int x2 = pointB.getX();
        int y2 = pointB.getY();

        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
