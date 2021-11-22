package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TrackPoints {
    private List<String> longitudes = new ArrayList<>();
    private List<String> latitudes = new ArrayList<>();
    private List<Integer> heights = new ArrayList<>();

    public void readDataFromFile(String path) {
        try {
            List<String> rows = Files.readAllLines(Paths.get(path));
            for (String row : rows) {
                separateRow(row);
            }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file", ioe);
        }
    }

    private void separateRow(String row) {
        int first = row.indexOf(";");
        int last = row.lastIndexOf(";");
        longitudes.add(row.substring(0,first));
        latitudes.add((row.substring(first + 1, last)));
        heights.add(Integer.parseInt(row.substring(last+1)));
    }

    public void printHeightDifferences() {
        for (int i = 1; i < heights.size(); i++) {
            System.out.println(heights.get(i) - heights.get(i - 1));
        }
    }
}
