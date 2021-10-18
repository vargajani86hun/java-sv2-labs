package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number;

        System.out.println("1. Felhasználók listázása\n" +
                "2. Felhasználó felvétele\n" +
                "Többi: Kilépés");
        number = scr.nextInt();

        if (number == 1) {
            System.out.println("Felhasználók listázása");
        }
        else if (number == 2) {
            System.out.println("Felhasználó felvétele");
        }
    }
}
