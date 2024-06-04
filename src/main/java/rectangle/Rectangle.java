package rectangle;

import java.util.ArrayList;
import java.util.List;
public class Rectangle{
    private final int width;
    private final int height;
    private List<Point> points = new ArrayList<>();

    public Rectangle(List<Integer> inputs) {
        this.width = 10;
        this.height = 10;
        init(inputs);
    }

    private void init(List<Integer> inputs) {
        for (int index = 0; index < inputs.size(); index++) {
            points.add(new Point(inputs.get(index), inputs.get(++index)));
        }
    }

    @Override
    public String toString() {
        return points.toString();
    }
}
