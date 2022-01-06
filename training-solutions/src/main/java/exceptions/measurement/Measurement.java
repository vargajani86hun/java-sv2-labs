package exceptions.measurement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Measurement {
    public List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("File not found!");
        }
    }

    public List<String> validate(List<String> lines) {
        List<String> wrongLines = new ArrayList<>();
        for (String s: lines) {
            if (!isValidLine(s)) {
                wrongLines.add(s);
            }
        }
        return wrongLines;
    }

    private boolean isValidLine(String line) {
        String[] data = line.split(",");
        return data.length == 3 && isValidID(data[0]) &&
                isValidValue(data[1]) && isValidName(data[2]);
    }

    private boolean isValidID(String id) {
        boolean isNumeric = true;
        for (char c : id.toCharArray()) {
            isNumeric &= Character.isDigit(c);
        }
        return isNumeric;
    }

    private boolean isValidValue(String value) {
        try {
            Double.parseDouble(value);
            return true;
        }
        catch (NumberFormatException nfe) {
            return false;
        }
    }

    private boolean isValidName(String name) {
        return name.trim().contains(" ");
    }
}
