package sorting;

import java.util.Arrays;

public class Income {
    private int[] yearlyIncomes;

    public Income(int[] yearlyIncomes) {
        this.yearlyIncomes = yearlyIncomes;
    }

    public int getHighestIncome() {
        Arrays.sort(yearlyIncomes);
        return yearlyIncomes[yearlyIncomes.length - 1];
    }
}
