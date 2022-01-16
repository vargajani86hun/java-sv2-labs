package collectionsmap;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassTrip {
    private Map<String, Integer> inpayments = new HashMap<>();

    public Map<String, Integer> getInpayments() {
        return new HashMap<>(inpayments);
    }

    public void loadInpayments(Path path) {
        try (Scanner sc = new Scanner(path)) {
            while (sc.hasNextLine()) {
                String[] elements = sc.nextLine().split(": ");
                inpayments.put(elements[0], Integer.parseInt(elements[1]));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.");
        }
    }
}
