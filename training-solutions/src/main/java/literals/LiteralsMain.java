package literals;

import java.util.Locale;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("1" + '2');
        String one = "1";
        String two = "2";
        System.out.println(one + two);
        char charOne = '1';
        char charTwo = '2';
        System.out.println(charOne + "" + charTwo);

        double quotient = 3./4d;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}
