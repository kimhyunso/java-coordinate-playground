package fuel.domain.concreate;

import fuel.domain.Car;

public class Avante extends Car {
    private final int tripDistance;
    public static final String CAR_NAME = "Avante";
    public static final int DISTANCE_PER_LITER = 15;

    public Avante(int tripDistance) {
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
