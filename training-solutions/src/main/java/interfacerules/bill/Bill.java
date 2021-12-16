package interfacerules.bill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Bill {

    public List<String> readBillItemsFromFile(Path path) {
        try {
            List<String> results = Files.readAllLines(path);
            return results;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!");
        }
    }
}
