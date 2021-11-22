package introexceptionreadfiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        List<String> lines = readFromFile(path);
        for (int i = 2; i < lines.size(); i++) {
            ingredients.add(lines.get(i).substring(
                    lines.get(i).lastIndexOf(" ") + 1));
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    private List<String> readFromFile(Path path) {
        try {
            return Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Unable to read file!", ioe);
        }
    }
}
