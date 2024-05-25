package fuel.domain.concreate;

import fuel.domain.Car;

public class K5 extends Car {
    private final int distance;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    protected double getDistancePerLiter() {
        return 0;
    }

    @Override
    protected double getTripDistance() {
        return 0;
    }

    @Override
    protected String getName() {
        return null;
    }
}
