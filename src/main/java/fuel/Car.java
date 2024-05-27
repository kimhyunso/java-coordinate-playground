package fuel.domain;

public abstract class Car {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    protected abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    protected abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    protected abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}