package fuel.domain.concreate;

import fuel.domain.Car;

public class Sonata extends Car {
    private final int distance;

    public Sonata(int distance) {
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
