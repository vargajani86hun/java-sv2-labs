package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Jone Doe");
        client.setAddress("Miskolc");
        client.setYear(1977);

        System.out.println(client.getName() + ", született " + client.getYear() + "., címe: " + client.getAddress());

        client.migrate("Pécs");
        System.out.println(client.getName() + " új címe " + client.getAddress());

    }
}
