package algorithmsfilter.prefix;

import java.util.ArrayList;
import java.util.List;

public class Prefix {
    public List<String> getWordsStartWith(List<String> words, String prefix) {
        List<String> result = new ArrayList<>();

        if (words == null) {
            return null;
        }

        for (String word : words) {
            if (word.indexOf(prefix) == 0) {
                result.add(word);
            }
        }

        if (result.size() == 0) {
            return null;
        }

        return result;
    }
}
