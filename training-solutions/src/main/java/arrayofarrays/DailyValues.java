package arrayofarrays;

public class DailyValues {
    static int[][] getValues() {
        int[][] daysOfMonths = new int[12][];
        for (int i = 0; i < daysOfMonths.length; i++) {
            if (i == 1) {
                daysOfMonths[i] = new int[28];
            }
            else if (i == 3 || i == 5 || i == 8 || i == 10) {
                daysOfMonths[i] = new int[30];
            }
            else {
                daysOfMonths[i] = new int[31];
            }
        }
        return daysOfMonths;
    }

    public static void main(String[] args) {
        int[][] days = getValues();
        for (int i = 0; i < days.length; i++){
            System.out.println("A(z) " + (i+1) + ". hónap " + days[i].length + " napos.");
        }
    }
}
