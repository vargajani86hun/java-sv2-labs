package algorithmsdecision.towns;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TownTest {

    @Test
    void testContainsFewerHabitants() {
        List<Integer> populations = Arrays.asList(2800, 3340, 7200, 8550, 6210,
                4290, 3880, 5130);
        Town town = new Town();

        assertFalse(town.containsFewerHabitants(populations, 2500));
        assertTrue(town.containsFewerHabitants(populations, 3500));
        assertTrue(town.containsFewerHabitants(populations, 5500));
        assertTrue(town.containsFewerHabitants(populations, 8500));

    }
}