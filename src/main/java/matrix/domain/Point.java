package matrix.domain;
public class Point {
    public static final int MAX_NO = 24;
    protected final int x;
    protected final int y;
    public Point(int x, int y) {
        if (x > MAX_NO || y > MAX_NO){
            throw new IllegalArgumentException("x, y 둘 중 하나의 값이 24를 초과했습니다.");
        }
        this.x = x;
        this.y = y;
    }
    public double pointDistance(Point point){
        return Math.sqrt(pow(this.x, point.x) + pow(this.y, point.y));
    }
    private double pow(int self, int point) {
        return Math.pow(self - point, 2);
    }
}
