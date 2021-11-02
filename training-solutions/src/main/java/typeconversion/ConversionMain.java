package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conv = new Conversion();
        System.out.println(conv.convertDoubleToDouble(3.111));

        int[] numbers = {5, -14, 6, 2, 125, 354, 9738, 3};
        System.out.println(Arrays.toString(conv.convertIntArrayToByteArray(numbers)));

        System.out.println(conv.getFirstDecimal(78.9012));
    }
}
