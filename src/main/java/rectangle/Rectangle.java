package rectangle;

import java.util.ArrayList;
import java.util.List;
public class Rectangle{
    private final int width;
    private final int height;

    private List<Point> points = new ArrayList<>();
    private static final int ARRAY_SIZE = 2;

    public Rectangle(List<Integer> inputs) {
        init(inputs);
        this.width = getWith();
        this.height = getHeight();
    }

    public int getArea() {
        return width * height;
    }

    private void init(List<Integer> inputs) {
        for (int pointIndex = 0; pointIndex < inputs.size(); pointIndex++) {
            points.add(new Point(inputs.get(pointIndex), inputs.get(++pointIndex)));
        }
    }

    private int getWith() {
        return points.get(0).width(points.get(1));
    }

    private int getHeight() {
        return points.get(1).height(points.get(3));
    }

    @Override
    public String toString() {
        return points.toString();
    }

}
