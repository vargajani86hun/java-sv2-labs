package defaultconstructor.date;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateTest {

    @Test
    void testCreate() {
        SimpleDate simpleDate = new SimpleDate();
        assertEquals(0, simpleDate.getDay());
        assertEquals(0, simpleDate.getMonth());
        assertEquals(0, simpleDate.getYear());
    }

    @Test
    void testSetDate() {
        SimpleDate simpleDate = new SimpleDate();
        simpleDate.setDate(1986, 9, 8);
        assertEquals(1986, simpleDate.getYear());
        assertEquals(9, simpleDate.getMonth());
        assertEquals(8, simpleDate.getDay());

        simpleDate.setDate(1900, 2, 28);
        assertEquals(1900, simpleDate.getYear());
        assertEquals(2, simpleDate.getMonth());
        assertEquals(28, simpleDate.getDay());

        simpleDate.setDate(1988, 2, 29);
        assertEquals(1988, simpleDate.getYear());
        assertEquals(2, simpleDate.getMonth());
        assertEquals(29, simpleDate.getDay());

        simpleDate.setDate(2000, 2, 29);
        assertEquals(2000, simpleDate.getYear());
        assertEquals(2, simpleDate.getMonth());
        assertEquals(29, simpleDate.getDay());
    }

    @Test
    void testSetDateWithInvalidYear() {
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1899, 9, 8));
        assertEquals("Invalid year: 1899", iae.getMessage());
    }

    @Test
    void testSetDateWithInvalidMonth() {
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1986, 0, 8));
        assertEquals("Invalid month: 0", iae.getMessage());
        IllegalArgumentException otherIAE = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1986, 13, 8));
        assertEquals("Invalid month: 13", otherIAE.getMessage());

    }

    @Test
    void testSetDateWithInvalidDay() {
        SimpleDate simpleDate = new SimpleDate();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1986, 9, 0));
        assertEquals("Invalid day: 0", iae.getMessage());

        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1986, 9, 31));
        assertEquals("Invalid day: 31", iae2.getMessage());

        IllegalArgumentException iae3 = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(1988, 2, 30));
        assertEquals("Invalid day: 30", iae3.getMessage());

        IllegalArgumentException iae4 = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2000, 2, 30));
        assertEquals("Invalid day: 30", iae4.getMessage());

        IllegalArgumentException iae5 = assertThrows(IllegalArgumentException.class,
                () -> simpleDate.setDate(2100, 2, 29));
        assertEquals("Invalid day: 29", iae5.getMessage());
    }
}