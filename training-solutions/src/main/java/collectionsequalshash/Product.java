package collectionsequalshash;

import java.util.Objects;

public class Product {
    private String name, registryNumber;

    public Product(String name, String registryNumber) {
        validateRegistryNumber(registryNumber);
        this.name = name;
        this.registryNumber = registryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return registryNumber.equals(product.registryNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registryNumber);
    }

    private void validateRegistryNumber(String registryNumber) {
        if (registryNumber == null) {
            throw new NullPointerException("Registry number must not be null!");
        }
        if (registryNumber.isEmpty()) {
            throw new IllegalArgumentException("Registry number must not be empty!");
        }
    }
}
