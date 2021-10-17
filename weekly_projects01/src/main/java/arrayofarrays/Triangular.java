package arrayofarrays;

public class Triangular {
    static int[][] triangularMatrix(int size) {
        int[][] tMatrix = new int[size][];
        for (int i = 0; i < size; i++) {
            tMatrix[i] = new int[i+1];
            for (int j = 0; j <= i; j++){
                tMatrix[i][j] = i;
            }
        }
        return tMatrix;
    }

    public static void main(String[] args) {
        int[][] mainMatrix = triangularMatrix(5);
        for (int i = 0; i < mainMatrix.length; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(mainMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
