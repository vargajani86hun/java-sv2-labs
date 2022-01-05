package exceptions.sum;

public class NumbersSum {
    public long getSum(int[] numbers) {
        long sum = 0;
        checkEmptyArray(numbers);
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }

    public long getSum(String[] numbers) {
        long sum = 0;
        checkEmptyArray(numbers);
        try {
            for (String s: numbers) {
                sum += Integer.parseInt(s);
            }
        }
        catch (NumberFormatException nfe) {
            throw new IllegalArgumentException("Not a number!", nfe);
        }
        return sum;
    }

    private void checkEmptyArray(String[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Empty array of numbers!");
        }
    }
    private void checkEmptyArray(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Empty array of numbers!");
        }
    }
}
