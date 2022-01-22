package lambdaoptional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CostumerTest {

    Costumer costumer;

    @BeforeEach
    void init() {
        List<Costume> costumes = Arrays.asList(
                new Costume("tűzokádó sárkány jelmez", Size.S, 2500),
                new Costume("űrhajós jelmez", Size.M, 3400),
                new Costume("napocska jelmez", Size.S, 2100),
                new Costume("zebra jelmez", Size.L, 3300),
                new Costume("újszülött csecsemő jelmez", Size.L, 4200)
        );
        costumer = new Costumer(costumes);
    }

    @Test
    void testFindFirstCostumeWithKeyWord() {
        assertEquals(Optional.empty(), costumer.findFirstCostumeWithKeyWord("zsiráf"));
        assertTrue(costumer.findFirstCostumeWithKeyWord("sárkány").isPresent());
        assertEquals("tűzokádó sárkány jelmez", costumer.findFirstCostumeWithKeyWord("sárkány").get().getDescription());
        assertTrue(costumer.findFirstCostumeWithKeyWord("nap").isPresent());
        assertEquals("napocska jelmez", costumer.findFirstCostumeWithKeyWord("nap").get().getDescription());
    }

    @Test
    void testFindFirstCheaperCostume() {
        assertEquals(Optional.empty(), costumer.findFirstCheaperCostume(100));
        assertTrue(costumer.findFirstCheaperCostume(2400).isPresent());
        assertEquals(2100, costumer.findFirstCheaperCostume(2400).get().getPrice());
        assertTrue(costumer.findFirstCheaperCostume(3000).isPresent());
        assertEquals(2500, costumer.findFirstCheaperCostume(3000).get().getPrice());
    }

    @Test
    void testFindFirstCostumeSameSize() {
        assertEquals(Optional.empty(), costumer.findFirstCostumeSameSize(Size.XL));
        assertTrue(costumer.findFirstCostumeSameSize(Size.M).isPresent());
        assertEquals("űrhajós jelmez", costumer.findFirstCostumeSameSize(Size.M).get().getDescription());
        assertTrue(costumer.findFirstCostumeSameSize(Size.L).isPresent());
        assertEquals("zebra jelmez", costumer.findFirstCostumeSameSize(Size.L).get().getDescription());
    }
}