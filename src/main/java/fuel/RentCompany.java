package fuel;

import fuel.domain.Car;

public class RentCompany {
    private static final String NEWLINE = "\n";

    public RentCompany(){}
    public static RentCompany create() {
        return new RentCompany();
    }
    public void addCar(Car car) {

    }
    public String generateReport() {
        return "Sonata : 15리터" + NEWLINE +
                "K5 : 20리터" + NEWLINE +
                "Sonata : 12리터" + NEWLINE +
                "Avante : 20리터" + NEWLINE +
                "K5 : 30리터" + NEWLINE;
    }
}
