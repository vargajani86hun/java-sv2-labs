package methodparam.sums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparatedSum {
    public double sum(String floatingNumbers) {
        String dottedFloats = changeFloatSeparator(floatingNumbers);
        List<Double> numbers = getValues(dottedFloats);
        double sum = 0;
        for (Double actual : numbers) {
            sum += actual;
        }
        return sum;
    }

    private String changeFloatSeparator(String source) {
        char[] chars = source.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ',') {
                chars[i] = '.';
            }
        }
        return new String(chars);
    }

    private List<Double> getValues(String floatingNumbers) {
        List<Double> results = new ArrayList<>();
        String[] numbers = floatingNumbers.split(";");
        for (String actual : numbers) {
            results.add(Double.parseDouble(actual));
        }
        return results;
    }


}
