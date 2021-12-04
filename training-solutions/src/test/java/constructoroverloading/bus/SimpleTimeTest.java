package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTimeTest {

    @Test
    void testCreateByHours() {
        SimpleTime time = new SimpleTime(10);
        assertEquals("10:00", time.toString());
        SimpleTime otherTime = new SimpleTime(-10);
        assertEquals("14:00", otherTime.toString());
    }

    @Test
    void testCreateByHoursAndMinutes() {
        SimpleTime time = new SimpleTime(10, 25);
        assertEquals("10:25", time.toString());
        SimpleTime otherTime = new SimpleTime(10, -25);
        assertEquals("10:35", otherTime.toString());
    }

    @Test
    void testCreateCopy() {
        SimpleTime time = new SimpleTime(10, 25);
        SimpleTime copiedTime = new SimpleTime(time);
        assertEquals("10:25", copiedTime.toString());
    }

    @Test
    void testGetDifference() {
        SimpleTime time = new SimpleTime(9, 45);
        SimpleTime otherTime = new SimpleTime(10, 25);
        assertEquals(40,time.getDifference(otherTime));
        assertEquals(-40, otherTime.getDifference(time));
    }
}