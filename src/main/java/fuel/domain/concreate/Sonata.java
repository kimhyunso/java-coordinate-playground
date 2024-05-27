package fuel.domain.concreate;

import fuel.domain.Car;

public class Sonata extends Car {
    private final int tripDistance;
    public static final int DISTANCE_PER_LITER = 10;
    public static final String CAR_NAME = "Sonata";

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    protected double getDistancePerLiter() {
        return DISTANCE_PER_LITER;
    }

    @Override
    protected double getTripDistance() {
        return tripDistance;
    }

    @Override
    protected String getName() {
        return CAR_NAME;
    }
}
