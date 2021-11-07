package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg a kezdő értéket:");
        int start = scr.nextInt();
        for (int i = start; ; i++) {
            if((i % 7 != 0) && Integer.toString(i).contains("7")){
                break;
            }
            System.out.println((i % 7 == 0) ? "X" : i);
        }
    }
}
