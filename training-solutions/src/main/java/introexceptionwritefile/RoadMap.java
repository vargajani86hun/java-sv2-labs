package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class RoadMap {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mezőkövesd", "Egerlövő",
                "Borsodivánka", "Poroszló", "Tiszafüred", "Hortobágy",
                "Debrecen");
        try {
            new RoadMap().writeListToFile(cities, Paths.get(("roadmap.txt")));
        }
        catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.getCause().printStackTrace();
        }
    }

    private void writeListToFile(List<String> list, Path path) {
        try {
            Files.write(path, list);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to create file!", ioe);
        }
    }
}
