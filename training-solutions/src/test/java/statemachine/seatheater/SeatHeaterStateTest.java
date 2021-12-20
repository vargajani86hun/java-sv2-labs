package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatHeaterStateTest {

    @Test
    void testNext() {
        assertEquals("OFF", SeatHeaterState.LEVEL_ONE.next().name());
        assertEquals("LEVEL_ONE", SeatHeaterState.LEVEL_TWO.next().name());
        assertEquals("LEVEL_TWO", SeatHeaterState.MAXIMUM.next().name());
        assertEquals("MAXIMUM", SeatHeaterState.OFF.next().name());
    }

}