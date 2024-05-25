package fuel.domain.concreate;

import fuel.domain.Car;

public class Avante extends Car {
    private final int distance;

    public Avante(int distance) {
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
