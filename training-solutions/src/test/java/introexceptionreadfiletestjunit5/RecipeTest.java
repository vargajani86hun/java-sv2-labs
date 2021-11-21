package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RecipeTest {
    Recipe recipe = new Recipe();

    @Test
    void testAddIngredientsFromValidFile() {
        recipe.addIngredients(Paths.get(
                "src/test/texts/recipe.txt"));
        assertEquals(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás",
                "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),
                recipe.getIngredients());
    }

    @Test
    void testAddIngredientsFromInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("")));
        assertEquals("Unable to read file!", ise.getMessage());
    }
}
