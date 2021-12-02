package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @Test
    void testIsEqual() {
        Time time = new Time(10,32,12);
        Time otherTime = new Time(10,32,12);
        assertTrue(time.isEqual(otherTime));
        assertTrue(otherTime.isEqual(10,32,12));
        assertFalse(time.isEqual(10,23,21));
    }

    @Test
    void testIsEarlier() {
        Time time = new Time(10,32,12);
        Time otherTime = new Time(10, 33,11);
        assertTrue(time.isEarlier(otherTime));
        assertTrue(otherTime.isEarlier(10,33,21));
        assertFalse(otherTime.isEarlier(time));
        assertFalse(time.isEarlier(time));
        assertFalse(otherTime.isEarlier(9, 33, 11));
    }

}