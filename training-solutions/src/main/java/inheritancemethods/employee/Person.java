package inheritancemethods.employee;

public class Person {
    private String name, address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void migrate(String newAddress) {
        address = newAddress;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
