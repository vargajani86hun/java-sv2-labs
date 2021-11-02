package stringscanner;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adjon meg egy többszörösen összetett mondatot:");
        String complexSentence = scr.nextLine();
        System.out.println("Adjon meg még egy többszörösen összetett mondatot:");
        String otherComplexSentence = scr.nextLine();

        Scanner stringScanner = new Scanner(complexSentence).useDelimiter(", ");
        while (stringScanner.hasNext()) {
            System.out.println(stringScanner.next());
        }

        stringScanner = new Scanner(otherComplexSentence).useDelimiter(", ");
        while (stringScanner.hasNext()) {
            System.out.println(stringScanner.next());
        }
    }
}
