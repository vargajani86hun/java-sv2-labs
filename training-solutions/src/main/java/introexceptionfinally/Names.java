package introexceptionfinally;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Names {
    private List<String> namesList;

    public static void main(String[] args) {
        Names names = new Names();
        Names otherNames = new Names();
        Names noNames = new Names();
        try {
            names.readNamesFromFile(Paths.get("src/main/texts/names.txt"));
            System.out.println(names.getFirstDoctor());
            otherNames.readNamesFromFile(Paths.get("src/main/texts/nodoctors.txt"));
            System.out.println(otherNames.getFirstDoctor());
            noNames.readNamesFromFile(Paths.get("src/main/texts/nonames.txt"));
            System.out.println(noNames.getFirstDoctor());
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();;
        }
    }

    public String getFirstDoctor() {
        for (String name : namesList) {
            if ("dr".equals(name.substring(0,2))){
                return name;
            }
        }
        return "";
    }

    public void readNamesFromFile(Path path) {
        try {
            namesList = Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
        finally {
            System.out.println("End of reading.");
        }
    }
}
