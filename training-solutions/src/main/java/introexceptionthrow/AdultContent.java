package introexceptionthrow;

import java.util.Scanner;

public class AdultContent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét:");
        String name = sc.nextLine();
        System.out.println("Adja meg az életkorát:");
        int age = sc.nextInt();
        Adult person = new Adult(name, age);
    }
}
