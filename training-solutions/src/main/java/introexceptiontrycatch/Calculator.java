package introexceptiontrycatch;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adjon meg két egész számot: ");
        int a = scr.nextInt();
        int b = scr.nextInt();
        scr.nextLine();
        System.out.println("Adja meg az elvégzendő műveletet ( + | - | * | / )");
        try {
            char operator = scr.nextLine().charAt(0);
            switch (operator) {
                case '+' :
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case '-' :
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case '*' :
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case '/' :
                    System.out.println(a + " / " + b + " = " + (a / b));
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
    }
}
