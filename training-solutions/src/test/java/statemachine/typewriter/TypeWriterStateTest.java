package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {

    @Test
    void testNext() {
        assertEquals("CAPS_LOCK_ON", TypeWriterState.CAPS_LOCK_OFF.next().name());
        assertEquals("CAPS_LOCK_OFF", TypeWriterState.CAPS_LOCK_ON.next().name());
    }

}