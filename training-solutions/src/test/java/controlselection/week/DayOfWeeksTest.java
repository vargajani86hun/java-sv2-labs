package controlselection.week;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DayOfWeeksTest {
    DayOfWeeks dow;

    @BeforeEach
    void init() {
        dow = new DayOfWeeks();
    }

    @Test
    void testTypeOfDay() {
        assertEquals("hét eleje", dow.getTypeOfDay("Hétfő"));
        assertEquals("hét közepe", dow.getTypeOfDay("Szerda"));
        assertEquals("majdnem hétvége", dow.getTypeOfDay("Péntek"));
        assertEquals("hét vége", dow.getTypeOfDay("Szombat"));
    }
}
