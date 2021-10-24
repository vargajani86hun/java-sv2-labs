package looptypesmodify;

import java.util.Arrays;

public class EveryThird {
    public int[] changeToZero(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i -= 3) {
            numbers[i] = 0;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};
        int[] numbers2 = {5, 3, 3, 7, 8, 1, 6, 4, 9, 4, 6, 9, 5, 2, 8};
        int[] numbers3 = {4, 7, 5, 1, 9, 8, 1, 3, 4, 7, 8, 3, 7};
        EveryThird et = new EveryThird();

        System.out.println(Arrays.toString(et.changeToZero(numbers)));
        System.out.println(Arrays.toString(et.changeToZero(numbers2)));
        System.out.println(Arrays.toString(et.changeToZero(numbers3)));

    }
}
