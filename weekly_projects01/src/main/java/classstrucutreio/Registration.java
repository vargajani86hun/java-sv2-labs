package classstrucutreio;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String name, email;

        System.out.println("Kérem, adja meg a névet: ");
        name = scr.nextLine();

        System.out.println("Kérem, adja meg az e-mail címéet: ");
        email = scr.nextLine();

        System.out.println("Ön " + name + " néven, " + email + " címmel sikeresen regisztrált!");

    }
}
