package constructoroverloading.advertisement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BikeAdvertisement {
    private String sortDescription, brand, serialNumber;
    private int price;
    private List<String> extras;

    public BikeAdvertisement(String sortDescription, int price) {
        this.sortDescription = sortDescription;
        this.price = price;
    }

    public BikeAdvertisement(String sortDescription, int price, String brand) {
        this(sortDescription, price);
        this.brand = brand;
    }

    public BikeAdvertisement(String sortDescription, int price, String brand, List<String> extras) {
        this(sortDescription, price, brand);
        this.extras = extras;
    }

    public BikeAdvertisement(String sortDescription, int price, String brand, List<String> extras,
                             String serialNumber) {
        this(sortDescription, price, brand, extras);
        this.serialNumber = serialNumber;
    }

    public String getSortDescription() {
        return sortDescription;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public List<String> getExtras() {
        return extras;
    }
}
