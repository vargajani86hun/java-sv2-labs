package stringscanner;

import java.util.Scanner;

public class IntScanner {
    public String convertInts(String ints) {
        Scanner scr = new Scanner(ints).useDelimiter(";");
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        while (scr.hasNextInt()) {
            int number = scr.nextInt();
            if (number > 100) {
                if (first) {
                    first = false;
                }
                else {
                    sb.append(";");
                }
                sb.append(number);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String originIntList = "5;3;107;12;123;18;198";
        String emptyIntList = "";
        String soloInt = "111";
        String littleIntList = "12;3;33;7;73;56;8;21";
        IntScanner is = new IntScanner();
        System.out.println(is.convertInts(originIntList));
        System.out.println(is.convertInts(soloInt));
        System.out.println(is.convertInts(littleIntList));
        System.out.println(is.convertInts(emptyIntList));
    }
}
