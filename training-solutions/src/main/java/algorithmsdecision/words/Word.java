package algorithmsdecision.words;

import java.util.List;

public class Word {
    public boolean containsLongerWord(List<String> words, String newWord) {
        for (String word : words) {
            if (word.length() > newWord.length()) {
                return true;
            }
        }
        return false;
    }
}
