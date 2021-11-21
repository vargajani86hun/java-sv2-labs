package introexceptionthrowjunit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThrows;

public class TankTest {
    @Test
    public void testModifyAngle() {
        Tank tank = new Tank();
        tank.modifyAngle(30);
        assertThat(30, equalTo(tank.getAngle()));
    }

    @Test (expected = IllegalArgumentException.class)
    public void testModifyAngleWithInvalidAngle() {
        Tank tank = new Tank();
        tank.modifyAngle(-130);
    }

    @Rule
    public ExpectedException ee = ExpectedException.none();

    @Test
    public void testModifyAngleWithInvalidAngleByRule() {
        Tank tank = new Tank();
        ee.expect(IllegalArgumentException.class);
        ee.expectMessage("Túl nagy szögérték!");
        tank.modifyAngle(100);
    }

    @Test
    public void testModifyAngleWithInvalidAngleByAssertThrows() {
        Tank tank = new Tank();
        tank.modifyAngle(30);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
               () -> tank.modifyAngle(-130));
        assertThat("Túl nagy szögérték!", equalTo(iae.getMessage()));
    }
}
