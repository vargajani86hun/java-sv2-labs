package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Calculator calc = new Calculator();
        try {
            int[] numbers = calc.readNumbers();
            System.out.println("Adja meg az elvégzendő műveletet ( + | - | * | / )");
            char operator = scr.nextLine().charAt(0);
            switch (operator) {
                case '+' :
                    System.out.println(numbers[0] + " + " + numbers[1] +
                            " = " + (numbers[0] + numbers[1]));
                    break;
                case '-' :
                    System.out.println(numbers[0] + " - " + numbers[1] +
                            " = " + (numbers[0] - numbers[1]));
                    break;
                case '*' :
                    System.out.println(numbers[0] + " * " + numbers[1] +
                            " = " + (numbers[0] * numbers[1]));
                    break;
                case '/' :
                    System.out.println(numbers[0] + " / " + numbers[1] +
                            " = " + (numbers[0] / numbers[1]));
                    break;
                default :
                    System.out.println("Ismeretlen művelet");
                    break;
            }
        }
        catch (IndexOutOfBoundsException ioob) {
            System.out.println("Nem adott meg operátort!");
            System.out.println(ioob.getMessage());
        }
        catch (ArithmeticException ae) {
            System.out.println("Nullával való osztás nem lehetséges!");
            System.out.println(ae.getMessage());
        }
        catch (InputMismatchException ime) {
            System.out.println("Nem egész számo(ka)t adott meg!");
            System.out.println(ime.getMessage());
        }
    }

    private int[] readNumbers() {
        int[] results = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg két számot:");
        for (int i = 0; i < 2; i++) {
            results[i] = sc.nextInt();
        }
        return results;
    }
}
