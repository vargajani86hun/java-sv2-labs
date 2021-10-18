package array;

import java.lang.reflect.Array;

public class ArrayHandler {
    void addIndexToNumber(int[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] += i;
        }
    }

    void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i + source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8, 13};
        String[] words = {"egy", "kető", "három", "négy", "öt"};
        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.addIndexToNumber(numbers);
        arrayHandler.concatenateIndexToWord(words);

        for (int number: numbers) {
            System.out.println(number);
        }
        for (String word: words) {
            System.out.println(word);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1) {
                System.out.print(numbers[i] + ", ");
            }
            else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            if (i < words.length - 1){
                System.out.print(words[i] + ", ");
            }
            else {
                System.out.print(words[i]);
            }
        }
    }
}
