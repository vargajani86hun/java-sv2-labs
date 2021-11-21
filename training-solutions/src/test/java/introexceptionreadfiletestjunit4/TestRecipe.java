package introexceptionreadfiletestjunit4;

import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThrows;

public class TestRecipe {
    Recipe recipe = new Recipe();

    @Test
    public void testAddIngredients() {
        recipe.addIngredients(Paths.get("src/test/texts/recipe.txt"));
        assertThat(Arrays.asList("liszt", "margarin", "kristálycukor", "tojás",
                "citrom", "sütőpor", "vanillincukor", "tejföl", "alma", "fahéj"),
                equalTo(recipe.getIngredients()));
    }

    @Test
    public void testAddIngredientsWithInvalidFile() {
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("")));
        assertThat("Unable to read file!", equalTo(ise.getMessage()));
    }
}
