package introexceptioncause;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PaulStreetBoys {
    private List<String> names;

    public void readNamesFromFile(String path) {
        try {
            names = Files.readAllLines(Paths.get(path));
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
    }

    public void printBoysName() {
        for (String name : names) {
            if(name.toLowerCase().contains("nemecsek")) {
                System.out.println(name.toLowerCase());
            }
            else {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        PaulStreetBoys psb = new PaulStreetBoys();
        psb.readNamesFromFile("src/main/texts/palutcaifiuk.txt");
        psb.printBoysName();
    }
}
