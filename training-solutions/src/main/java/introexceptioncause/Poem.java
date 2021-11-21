package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Poem {
    private List<String> rows;

    public static void main(String[] args) {
        Poem poem = new Poem();
        poem.readRowsFromFile("src/main/texts/poem.txt");
        poem.printFirstLetters();
    }

    public void readRowsFromFile(String path) {
        try {
            rows = Files.readAllLines(Paths.get(path));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }

    public void printFirstLetters() {
        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row.charAt(0));
        }
        System.out.println(sb);
    }
}
