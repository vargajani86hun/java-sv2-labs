package conversions;

import java.util.ArrayList;
import java.util.List;

public class Digits {
    private List<Integer> numbers = new ArrayList<>();

    public void addDigitsToList(String text) {
        char[] letters = text.toCharArray();
        for (char c : letters) {
            if (Character.isDigit(c)) {
                numbers.add(Character.getNumericValue(c));
            }
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static void main(String[] args) {
        Digits digits = new Digits();
        digits.addDigitsToList("13as41df973c");
        List<Integer> digitChars = digits.getNumbers();
        System.out.println(digitChars);
    }
}
