package triangle;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    private List<Point> points = new ArrayList<>();
    public Triangle(List<Integer> inputs) {
        init(inputs);
    }

    private void init(List<Integer> inputs) {
        for (int pointIndex = 0; pointIndex < inputs.size(); pointIndex++) {
            points.add(new Point(inputs.get(pointIndex), inputs.get(++pointIndex)));
        }
    }

    public double getArea() {
        int a = points.get(0).height(points.get(1));
        int b = points.get(1).height(points.get(2));
        int c = points.get(0).width(points.get(2));
        int s = s(a, b, c);

        return Math.floor(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public int s(int a, int b, int c) {
        return (a + b + c) / 2;
    }

    @Override
    public String toString() {
        return points.toString();
    }
}
