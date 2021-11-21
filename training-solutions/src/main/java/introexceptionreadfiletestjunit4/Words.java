package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Words {
    private List<String> wordsList;

    public String getFirstWordWithA(Path path) {
        readWordsFromFile(path);
        for (String word : wordsList) {
            if (word.charAt(0) == 'A') {
                return word;
            }
        }
        return "A";
    }

    private void readWordsFromFile(Path path) {
        try {
            wordsList = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
    }
}
