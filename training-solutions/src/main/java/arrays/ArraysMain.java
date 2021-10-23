package arrays;

import java.util.Arrays;

public class ArraysMain {
    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] multiplicationTable = new int[size][];
        for (int i = 0; i < size; i++) {
            multiplicationTable[i] = new int[size];
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i+1) * (j+1);
            }
        }
        return Arrays.deepToString(multiplicationTable);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {

        return Arrays.equals(day, anotherDay);
    }

    private int min(int value1, int value2){
        return (value1 > value2) ? value2 : value1;
    }

    public boolean sameTempValuesDaylight(double[] day, double[] anotherDay) {
        int hoursOfDay = day.length;
        int hoursOfAnotherDay = anotherDay.length;

        if (hoursOfDay == hoursOfAnotherDay) {
            return this.sameTempValues(day, anotherDay);
        }

        int minimum = min(hoursOfDay, hoursOfAnotherDay);
        double[] rangedDay = Arrays.copyOfRange(day, 0, minimum);
        double[] rangedAnotherDay = Arrays.copyOfRange(anotherDay, 0, minimum);

        return this.sameTempValues(rangedDay, rangedAnotherDay);
    }

    public boolean wonLottery(int[] played, int[] pulled) {
        int playedNumbers = played.length;
        int[] playedLocal = Arrays.copyOf(played, playedNumbers);
        int[] pulledLocal = Arrays.copyOf(pulled, playedNumbers);

        Arrays.sort(playedLocal);
        Arrays.sort(pulledLocal);
        return Arrays.equals(playedLocal, pulledLocal);
    }

    public static void main(String[] args) {
        int[] played1 = {25, 10, 65, 48, 2};
        int[] played2 = {19, 47, 5, 81, 33};
        int[] pulled = {81, 33, 47, 5, 19};
        ArraysMain arraysMain = new ArraysMain();

        System.out.println("Az eheti nyerő számok: " + Arrays.toString(pulled));
        System.out.println("Az ön szelvénye: " + Arrays.toString(played1));
        System.out.println(arraysMain.wonLottery(played1, pulled)?"Nyert":"Nem nyert");
        System.out.println("Az ön szelvénye: " + Arrays.toString(played2));
        System.out.println(arraysMain.wonLottery(played2, pulled)?"Nyert":"Nem nyert");

        System.out.println(Arrays.toString(played1));
        System.out.println(Arrays.toString(played2));

    }
}
