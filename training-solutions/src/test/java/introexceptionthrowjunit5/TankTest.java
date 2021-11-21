package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TankTest {
    Tank tank;

    @BeforeEach
    void init() {
        tank = new Tank();
    }

    @Test
    void testModifyAngle() {
        tank.modifyAngle(-40);
        assertEquals(-40, tank.getAngle());
        tank.modifyAngle(100);
        assertEquals(60, tank.getAngle());
    }

    @Test
    void testModifyAngleWithInvalidAngle() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(-90));
        assertEquals("Túl nagy szögérték!", iae.getMessage());
        IllegalArgumentException iae2 = assertThrows(IllegalArgumentException.class,
                () -> tank.modifyAngle(110));
        assertEquals("Túl nagy szögérték!", iae2.getMessage());
    }
}
