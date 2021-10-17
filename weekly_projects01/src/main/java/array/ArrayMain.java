package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println(daysOfWeek[1] + ", " + daysOfWeek.length);

        int[] powersOfTwo = new int[5];
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                powersOfTwo[i] = 1;
            }
            else {
                powersOfTwo[i] = powersOfTwo[i-1] * 2;
            }
        }

        for (int powers: powersOfTwo) {
            System.out.print(powers + " ");
        }
    }
}
