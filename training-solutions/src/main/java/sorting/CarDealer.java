package sorting;

import java.util.LinkedList;
import java.util.List;

public class CarDealer {
    private List<Car> forSale = new LinkedList<>();

    public void addCar(Car car) {
        forSale.add(car);
    }

    public List<Car> getCarsOrderedByYearOfConstruction() {
        List<Car> orderedCars = new LinkedList<>(forSale);
        orderedCars.sort(new CarConstructionComparator());
        return orderedCars;
    }

    public List<Car> getCarsOrderedByPrice() {
        List<Car> orderedCars = new LinkedList<>(forSale);
        orderedCars.sort(new CarPriceComparator());
        return orderedCars;
    }
}
