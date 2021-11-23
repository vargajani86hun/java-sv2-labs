package introexceptionfinally;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Adjon meg egy számot!");
            try {
                number = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not a number!", nfe);
            }
            finally {
                System.out.println("End of round.");
            }
        }
        while((number  % 2) != 0);
    }
}
