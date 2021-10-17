package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        String username, psw1, psw2, email;
        Scanner scr = new Scanner(System.in);

        System.out.println("Adjon meg egy felhasználó nevet: ");
        username = scr.nextLine();
        System.out.println("A megadott felhasználó név " +
                (UserValidator.isValidUsername(username) ?
                "érvényes" : "érvénytelen"));

        System.out.println("Adjon meg egy jelszót: ");
        psw1 = scr.nextLine();
        System.out.println("Adja meg újra a jelszót: ");
        psw2 = scr.nextLine();
        System.out.println("A megadott jelszó " +
                (UserValidator.isValidPassword(psw1, psw2) ?
                "érvényes" : "érvénytelen"));

        System.out.println("Adjon meg egy e-mail címet: ");
        email = scr.nextLine();
        System.out.println("A megadott e-mail cím " +
                (UserValidator.isValidEmail(email) ?
                "helyes" : "helytelen"));
    }
}
