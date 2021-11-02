package stringbasic.characters;

import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg a feladatnak szánt szót:");
        String task = scr.nextLine();

        char[] letters = new char[task.length()];
        System.out.println("Gépelje be a betűnként '" + task + "' szót!");
        for (int i = 0; i < letters.length; i++) {
            letters[i] = scr.nextLine().charAt(0);
        }

        String solution = new String(letters);
        if (task.equals(solution)){
            System.out.println("Helyesen betűzted!");
        }
        else {
            System.out.println("Ezt most elrontottad. Ezt írtad be: " +
                    solution + ", a feladat viszont '" + task + "' volt.");
        }
    }
}
