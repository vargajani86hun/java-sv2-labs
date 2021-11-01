package mathproblems;

public class Division {
    public void getDivisors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(number + " osztója: " + i);
            }
        }
    }

    public static void main(String[] args) {
        Division division = new Division();
        division.getDivisors(12);
        division.getDivisors(15);
        division.getDivisors(19);
    }
}
