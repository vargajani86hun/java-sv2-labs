package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfProduction;

    public Car(String brand, String type, int yearOfProduction) {
        isValidBrand(brand);
        isValidYearOfProduction(yearOfProduction);
        this.brand = brand;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    private boolean isValidBrand(String brand) {
        if (brand == null || "".equals(brand.trim())) {
            throw new IllegalArgumentException("Brand should not be empty!");
        }
        return true;
    }

    private boolean isValidYearOfProduction(int yearOfProduction) {
        if (yearOfProduction > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Year of production should not be in the future!");
        }
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
