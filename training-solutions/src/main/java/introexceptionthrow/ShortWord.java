package introexceptionthrow;

import java.util.Scanner;

public class ShortWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy legfeljebb öt betűs szót:");
        String word = sc.nextLine();
        new ShortWord().printShortWord(word);
    }

    public void printShortWord(String word) {
        if (word.length() > 5) {
            throw new IllegalArgumentException("Túl hosszú szó!");
        }
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                throw new IllegalArgumentException("Számjegyet nem tartalmazhat!");
            }
        }
        System.out.println(word);
    }
}
