package junit5fixture;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return new ArrayList<>(words);
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> toDelete = getWordsNotStartWith(prefix);
        for (String s : toDelete) {
            words.remove(s);
        }
    }

    private List<String> getWordsNotStartWith(String prefix) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).indexOf(prefix) != 0) {
                result.add(words.get(i));
            }
        }
        return result;
    }

    public void getWordsWithLength(int length) {
        List<String> toDelete = getWordsNotWithLength(length);
        for (String s : toDelete) {
            words.remove(s);
        }
    }

    private List<String> getWordsNotWithLength(int length) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() != length) {
                result.add(words.get(i));
            }
        }
        return result;
    }
}
