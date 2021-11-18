package introexceptiontrycatch;

import java.util.ArrayList;
import java.util.List;

public class FirstLetter {
    private List<String> words = new ArrayList<>();

    public static void main(String[] args) {
        FirstLetter firstLetter = new FirstLetter();
        firstLetter.addWord("alma");
        firstLetter.addWord(null);
        firstLetter.addWord("körte");
        firstLetter.addWord("");
        firstLetter.addWord("ananász");

        firstLetter.printFirstLetters();
    }

    public void addWord (String word) {
        words.add(word);
    }

    public void printFirstLetters() {
        for (int i = 0; i < words.size(); i++) {
            try {
                System.out.println(words.get(i).charAt(0));
            }
            catch (NullPointerException npe) {
                System.out.println(npe.getMessage());
            }
            catch (IndexOutOfBoundsException ioobe) {
                System.out.println(ioobe.getMessage());
            }
        }
    }
}
