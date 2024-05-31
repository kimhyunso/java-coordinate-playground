package matrix.domain;

import java.util.Arrays;

public class Point {
    public static final int MAX_NO = 25;
    protected final int x;
    protected final int y;
    public Point(int x, int y) {
        if (x >= MAX_NO || y >= MAX_NO){
            throw new IllegalArgumentException("x, y 둘 중 하나의 값이 24를 초과했습니다.");
        }
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point point){
        return Math.sqrt(pow(this.x, point.x) + pow(this.y, point.y));
    }

    private double pow(int self, int point) {
        return Math.pow(self - point, 2);
    }

    public String[][] getMatrix(Point pointB) {
        String [][]matrix = new String[MAX_NO][MAX_NO];

        for (String[] height : matrix){
            Arrays.fill(height, " ");
        }

        matrix[this.y][this.x] = "●";
        matrix[pointB.y][pointB.x] = "●";

        return matrix;
    }
}
