package looptypes;

public class Sum {
    public void printSums(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.print((numbers[i-1] + numbers[i]) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        int[] numbers = {2, 6, 3, 5, 7, 9};
        int[] numbers2 = {3, 9, 5, 6, 1, 3, 7};

        sum.printSums(numbers);

        sum.printSums(numbers2);
    }
}
