package arrays;

import java.util.Arrays;

public class ArraysMain {
    static String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    static String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][];
        for (int i = 0; i < size; i++) {
            multiplicationTable[i] = new int[size];
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    static boolean sameTempValues(double[] day, double[] anotherDay) {

        return Arrays.equals(day, anotherDay);
    }

    static boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        //@todo
        return false;
    }
}
