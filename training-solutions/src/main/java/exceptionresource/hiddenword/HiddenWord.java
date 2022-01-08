package exceptionresource.hiddenword;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class HiddenWord {
    public String getHiddenWord(Path path) {
        try (Scanner sc = new Scanner(path)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNextLine()) {
                sb.append(getAlphabetFromNumericLine(sc.nextLine()));
            }
            return sb.toString();
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file!", ioe);
        }
    }

    private char getAlphabetFromNumericLine(String line) {
        for (char c : line.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                return c;
            }
        }
        return ' ';
    }
}
