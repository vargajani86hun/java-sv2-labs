package controliteration.division;

import java.util.Scanner;

public class Division {

    private int getLimitFromConsole() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        int limit = scr.nextInt();
        scr.nextLine();
        return limit;
    }

    private int getDivisorFromConsole() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        int divisor = scr.nextInt();
        scr.nextLine();
        return divisor;
    }

    private void printNumbersWithWhile(int limit, int divisor) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        int i = 1;
        while (i <= limit) {
            if (i % divisor == 0){
                if (isFirst) {
                    isFirst = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(i);
            }
            i++;
        }
        System.out.println(sb);
    }

    private void printNumbersWithFor(int limit, int divisor) {
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (int i = 1; i <= limit; i++) {
            if (i % divisor == 0){
                if (isFirst) {
                    isFirst = false;
                }
                else {
                    sb.append(", ");
                }
                sb.append(i);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Division div = new Division();
        int limit = div.getLimitFromConsole();
        int divisor = div.getDivisorFromConsole();
        div.printNumbersWithWhile(limit, divisor);
        div.printNumbersWithFor(limit, divisor);

    }
}
