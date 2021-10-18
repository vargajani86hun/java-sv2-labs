package arrayofarrays;

public class Rectangle {
    static int[][] rectangularMatrix(int size) {
        int[][] rMatrix = new int[size][];
        for (int i = 0; i < size; i++) {
            rMatrix[i] = new int[size];
            for (int j = 0; j < size; j++){
                rMatrix[i][j] = i;
            }
        }
        return rMatrix;
    }

    public static void main(String[] args) {
        int[][] mainMatrix = rectangularMatrix(4);
        for (int i = 0; i < mainMatrix.length; i++){
            for (int j = 0; j < mainMatrix[i].length; j++) {
                System.out.print(mainMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
