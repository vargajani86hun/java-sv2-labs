package abstractclass.gamecharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void testCreate() {
        Point point = new Point(10,11);
        assertEquals(10, point.getX());
        assertEquals(11, point.getY());
    }

    @Test
    void testGetDistance() {
        Point start = new Point(10, 11);
        Point end = new Point(13, 7);
        assertEquals(5, start.getDistance(end));
    }

}