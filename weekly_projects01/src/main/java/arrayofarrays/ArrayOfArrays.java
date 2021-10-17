package arrayofarrays;

public class ArrayOfArrays {
    static void printArrayOfArrays(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 1, 2}, {1, 2, 3, 5},
                {2, 3, 5, 8, 13}, {3, 5, 8}};

        printArrayOfArrays(array);
    }
}
