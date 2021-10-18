package classstrucutreio;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Szóközzel elválsztva adjon meg két egész számot: ");
        int a, b;
        Scanner scr = new Scanner(System.in);
        a = scr.nextInt();
        b = scr.nextInt();
        System.out.println(a + " + " + b);
        System.out.println(a+b);
    }
}
