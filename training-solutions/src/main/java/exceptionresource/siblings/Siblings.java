package exceptionresource.siblings;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Siblings {

    public List<String> getFullNames(String lastName, Path path) {
        try (Scanner sc = new Scanner(path)) {
            List<String> results = new ArrayList<>();
            while (sc.hasNextLine()) {
                results.add(lastName + " " + sc.nextLine());
            }
            return results;
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }
}
