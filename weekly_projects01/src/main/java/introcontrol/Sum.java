package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int number;
            System.out.println("Adja meg a(z) " + (i+1) + ". számot:");
            number = scr.nextInt();
            scr.nextLine();
            sum += number;
        }

        System.out.println("A megadott számok összege: " + sum);
    }
}
