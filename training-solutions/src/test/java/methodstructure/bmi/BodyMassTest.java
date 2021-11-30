package methodstructure.bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyMassTest {

    @Test
    void testCreate() {
        BodyMass body = new BodyMass(91.2, 1.78);

        assertEquals(91.2, body.getWeight());
        assertEquals(1.78, body.getHeight());
    }

    @Test
    void testGetBodyMassIndex() {
        BodyMass body = new BodyMass(91.2, 1.78);
        double bmi = body.getBodyMassIndex();

        assertEquals(28.784, bmi, 0.0005);
    }

    @Test
    void testGetBody() {
        BodyMass flatBody = new BodyMass(91.2, 1.78);
        BodyMass normBody = new BodyMass(71.2, 1.78);
        BodyMass thinBody = new BodyMass(71.2, 2.08);

        assertEquals("OVERWEIGHT", flatBody.getBody().name());
        assertEquals("NORMAL", normBody.getBody().name());
        assertEquals("UNDERWEIGHT", thinBody.getBody().name());
    }

    @Test
    void testisThinnerThan() {
        BodyMass body = new BodyMass(94.5, 1.92);
        BodyMass otherBody = new BodyMass(91.2, 1.78);

        assertTrue(body.isThinnerThan(otherBody));
    }
}