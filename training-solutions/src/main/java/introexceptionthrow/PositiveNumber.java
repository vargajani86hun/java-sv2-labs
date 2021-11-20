package introexceptionthrow;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy pozitív számot: ");
        String line = sc.nextLine();
        int number = new PositiveNumber().checkPositive(line);
        System.out.println(number);
    }

    public int checkPositive(String line) {
        Scanner lineScanner = new Scanner(line);
        if (!(lineScanner.hasNextInt())) {
            throw new IllegalArgumentException("Nem számot adott meg!");
        }
        int number = lineScanner.nextInt();
        if (number <= 0) {
            throw new IllegalArgumentException("Nem pozitív szám!");
        }
        return number;
    }
}
