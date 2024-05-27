package fuel.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        return carList.stream()
                .map(this::stringFormat)
                .collect(Collectors.joining("\n"));
    }

    private String  stringFormat(Car car) {
        return String.format("%s : %d리터", car.getName(), (int) car.getChargeQuantity());
    }
}
