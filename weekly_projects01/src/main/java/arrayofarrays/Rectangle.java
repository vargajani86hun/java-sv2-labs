package arrayofarrays;

public class Rectangle {
    static int[][] rectangularMatrix(int size) {
        int[][] tMatrix = new int[size][];
        for (int i = 0; i < size; i++) {
            tMatrix[i] = new int[size];
            for (int j = 0; j < size; j++){
                tMatrix[i][j] = i;
            }
        }
        return tMatrix;
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
