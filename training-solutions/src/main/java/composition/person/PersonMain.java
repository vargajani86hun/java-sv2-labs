package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("John Doe", "123123AA");
        Address address = new Address("Hungary", "Debrecen",
                "Hal köz 3.", "H-4001");
        System.out.println(person.personToString());
        System.out.println(person.getAddress());
        System.out.println(address.addressToString());

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Jack Doe", "123456AA");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        address.correctData("Hungary", "Pécs",
                "Alkotmány utca 33.", "H-7601");
        System.out.println(address.addressToString());

        person.moveTo(address);
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.getAddress().correctData("Hungary", "Eger",
                "Sas út 17", "H-3301");
        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());
    }
}
