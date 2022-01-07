package exceptionclass.course;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SimpleTimeTest {

    @Test
    void testInvalidHourShouldThrowException() {
        int hour = 24;
        int minute = 1;

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(hour, minute));
        assertEquals("Hour is invalid (0-23)", itex.getMessage());
    }

    @Test
    public void testInvalidMinuteShouldThrowException() {
        int hour = 1;
        int minute = 60;

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(hour, minute));
        assertEquals("Minute is invalid (0-59)", itex.getMessage());

    }

    @Test
    void testCreateWithInts() {
        int hour = 1;
        int minute = 2;
        SimpleTime simpleTime = new SimpleTime(hour, minute);

        assertEquals(1, simpleTime.getHour());
        assertEquals(2, simpleTime.getMinute());
    }

    @Test
    void testNullParameterShouldThrowException() {
        String timeString = null;

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Time is null", itex.getMessage());
    }

    @Test
    void testInvalidLengthShouldThrowException() {
        String timeString = "aa";

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Time is not hh:mm", itex.getMessage());
    }

    @Test
    void testInvalideDelimiterShouldThrowException() {
        String timeString = "12,23";

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Time is not hh:mm", itex.getMessage());
    }

    @Test
    void testInvalideNumberShouldThrowException() {
        String timeString = "a1:23";

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Time is not hh:mm", itex.getMessage());
    }

    @Test
    void testInvalideHourShouldThrowException() {
        String timeString = "24:23";

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Hour is invalid (0-23)", itex.getMessage());
    }

    @Test
    void testInvalideMinuteShouldThrowException() {
        String timeString = "12:60";

        InvalideTimeException itex = assertThrows(InvalideTimeException.class, () -> new SimpleTime(timeString));
        assertEquals("Minute is invalid (0-59)", itex.getMessage());
    }

    @Test
    void testCreateWithString() {
        String timeStr = "01:12";
        SimpleTime simpleTime = new SimpleTime(timeStr);

        assertEquals(1,simpleTime.getHour());
        assertEquals(12,simpleTime.getMinute());
    }

    @Test
    void testToStringShouldReturnCorrectFormat() {
        int hour = 1;
        int minute = 12;
        SimpleTime simpleTime = new SimpleTime(hour, minute);

        assertEquals(String.format("%02d:%02d", hour, minute),simpleTime.toString());
    }
}