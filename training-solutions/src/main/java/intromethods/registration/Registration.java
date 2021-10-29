package intromethods.registration;

import java.time.LocalDate;
import java.util.Scanner;

public class Registration {

    public String getFullName(String familyName, String givenName) {
        return familyName + ' ' + givenName;
    }

    public LocalDate getFullDate(int year, int month, int day) {
        return LocalDate.of(year, month, day);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Kérem, adje meg a  vezeték nevét: ");
        String familyName = scr.nextLine();
        System.out.println("Kérem, adja meg keresztnevét: ");
        String givenName = scr.nextLine();

        System.out.println("Kérem, adja meg születési évét: ");
        int year = scr.nextInt();
        scr.nextLine();
        System.out.println("Kérem, adja meg születési hónapját: ");
        int month = scr.nextInt();
        scr.nextLine();
        System.out.println("Kérem, adja meg születési napját: ");
        int day = scr.nextInt();
        scr.nextLine();

        System.out.println("Kérem, adja meg az e-mail címét: ");
        String email = scr.nextLine();

        Registration reg = new Registration();
        Person person = new Person(reg.getFullName(familyName, givenName),
                reg.getFullDate(year, month, day), email);

        System.out.println("Regisztrációja során a következő adatokat adta meg: ");
        System.out.println(person);
    }
}
