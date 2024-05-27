package fuel.domain.concreate;

import fuel.domain.Car;

public class K5 extends Car {
    private final int tripDistance;
    public static final int DISTANCE_PER_LITER = 13;
    public static final String CAR_NAME = "K5";

    public K5(int tripDistance) {
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
