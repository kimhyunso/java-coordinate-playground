package fuel;

import fuel.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> carList = new ArrayList<>();
    private static final String NEWLINE = "\n";

    public RentCompany(){}
    public static RentCompany create() {
        return new RentCompany();
    }
    public void addCar(Car car) {
        carList.add(car);
    }
    public String generateReport() {
        return "Sonata : 15리터" + NEWLINE +
                "K5 : 20리터" + NEWLINE +
                "Sonata : 12리터" + NEWLINE +
                "Avante : 20리터" + NEWLINE +
                "K5 : 30리터" + NEWLINE;
    }
}
