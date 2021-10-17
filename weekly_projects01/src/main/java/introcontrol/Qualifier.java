package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number;

        System.out.println("Kérem, adjon meg egy számot: ");
        number = scr.nextInt();

        //System.out.println((number > 100) ? "Nagyobb, mint száz" : "Száz, vagy kisebb");
        if (number > 100) {
            System.out.println("Nagyobb, mint száz");
        }
        else {
            System.out.println("Száz, vagy kisebb");
        }
    }
}
