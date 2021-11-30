package immutable;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String type;
    private final int yearOfManufacture;

    public Car(String brand, String type, int yearOfManufacture) {
        isValidBrand(brand);
        isValidYearOfManufacture(yearOfManufacture);
        this.brand = brand;
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    private boolean isValidBrand(String brand) {
        if (brand == null || "".equals(brand.trim())) {
            throw new IllegalArgumentException("Brand should not be empty!");
        }
        return true;
    }

    private boolean isValidYearOfManufacture(int yearOfManufacture) {
        if (yearOfManufacture > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Invalid year of manufacture!");
        }
        return true;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }
}
