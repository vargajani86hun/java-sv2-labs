package numbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Mit ad eredményül?");
        System.out.println("(12+5)/8-(3*7+1)/4");
        double answer = scr.nextDouble();
        double solution = ((12.+5)/8.)-(((3.*7)+1)/4.);
        if (Math.abs(answer - solution) < 0.0001) {
            System.out.println("Helyes megoldás!");
        }
        else {
            System.out.println("Hibás megoldás. A helyes válasz: " + solution);
        }
    }
}
