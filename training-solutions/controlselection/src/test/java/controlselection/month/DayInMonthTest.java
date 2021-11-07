package controlselection.month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DayInMonthTest {
    DayInMonth dim;

    @BeforeEach
    void init(){
        dim = new DayInMonth();
    }

    @Test
    void testDaysOfTheMonth() {
        assertEquals(30, dim.daysOfTheMonth(2002, "Április"));
        assertEquals(31, dim.daysOfTheMonth(2002, "Május"));
        assertEquals(28, dim.daysOfTheMonth(2002, "Február"));
        assertEquals(29, dim.daysOfTheMonth(2000, "Február"));
    }

    @Test
    void testIsLeapYear() {
        assertTrue(dim.isLeapYear(1992));
        assertTrue(dim.isLeapYear(2000));
        assertFalse(dim.isLeapYear(1900));
    }
}
