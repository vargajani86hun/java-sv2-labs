package lambdaintro;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UsedCars {
    private List<Car> cars;

    public UsedCars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> listCarsByPrice() {
        return cars.stream()
                .sorted(Comparator.comparingInt(Car::getPrice))
                .toList();
    }

    public List<Car> listCarsByLengthDesc() {
        return cars.stream()
                .sorted((car1,car2) -> {
                    double diff = car2.getLength() - car1.getLength();
                    if (diff < 0) {
                        return -1;
                    } else if (diff > 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                })
                .collect(Collectors.toList());
    }

    public List<Car> listCarsOneBrandByType(String brand) {
        return cars.stream()
                .filter(car -> car.getBrand().equals(brand))
                .sorted(Comparator.comparing(Car::getType))
                .toList();
    }
}
