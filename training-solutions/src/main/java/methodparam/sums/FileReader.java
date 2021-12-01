package methodparam.sums;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private List<String> lines;

    public double getSumFromFile(Path path) {
        readLinesFromFile(path);
        SeparatedSum separatedSum = new SeparatedSum();
        return separatedSum.sum(lines.get(0));
    }

    private void readLinesFromFile(Path path) {
        try {
            lines = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
    }
}
