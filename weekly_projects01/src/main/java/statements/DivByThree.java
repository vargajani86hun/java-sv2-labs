package statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        int value;
        Scanner scr = new Scanner(System.in);

        System.out.println("Adjon meg egy egész számot: ");
        value = scr.nextInt();
        System.out.println("Ez a szám" + ((value % 3 == 0)?" ":" nem ") + "osztható hárommal.");

    }
}
