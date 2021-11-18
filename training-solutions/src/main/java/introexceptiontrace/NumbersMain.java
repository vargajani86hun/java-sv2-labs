package introexceptiontrace;

import java.util.Arrays;

public class NumbersMain {
    public static void main(String[] args) {
        Change change = new Change();
        int[] numbers = change.changeNumbers();
        System.out.println(Arrays.toString(numbers));
    }
}
