package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistry;
    private final String registryNumber;

    public Monument(String name, String address, LocalDate dateOfRegistry, String registryNumber) {
        this.name = name;
        this.address = address;
        this.dateOfRegistry = dateOfRegistry;
        this.registryNumber = registryNumber;
    }

    private boolean isEmpty(String text) {
        if (text == null || "".equals(text.trim())) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }
}
