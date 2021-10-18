package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();
        Scanner scr = new Scanner(System.in);

        System.out.println("Kérem, adja meg a nevét: ");
        client.name = scr.nextLine();
        System.out.println("Kérem, adja meg a születési évét: ");
        client.year = scr.nextInt();
        scr.nextLine();
        System.out.println("Kérem, adje meg a címét: ");
        client.address = scr.nextLine();

        System.out.println("A " + client.name + " nevű ügyfél " + client.year + "-ben született.");
        System.out.println("Az ügyfél címe: " + client.address);
    }
}
