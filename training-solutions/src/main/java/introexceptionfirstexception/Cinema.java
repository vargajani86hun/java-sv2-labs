package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Üdvözöljük mozink jegyfoglaló rendszerében!\nAdja meg a nevét:");
        String name = scr.nextLine();
        System.out.println("Melyik filmet szeretné megtekinteni?");
        String title = scr.nextLine();
        System.out.println("Hány főre szeretne jegyet foglalni?");
        int guests = scr.nextInt();
        System.out.println("Hányadik sorban szeretnének ülni?");
        int row = scr.nextInt();

        StringBuilder sb = new StringBuilder();
        sb.append("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők:\n");
        sb.append("Vásárló neve: ").append(name).append("\n");
        sb.append("Film címe: ").append(title).append("\n");
        sb.append("Lefoglalt helyek: ");
        for (int i = 1; i <= guests; i++) {
            if (i > 1) {
                sb.append(", ");
            }
            sb.append(row).append(". sor ").append(i).append(". szék");
        }
        sb.append("\nJó szórakozást!");
        System.out.println(sb);
    }
}
