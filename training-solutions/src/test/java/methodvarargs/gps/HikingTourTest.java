package methodvarargs.gps;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class HikingTourTest {
    HikingTour hikingTour = new HikingTour();

    @Test
    void testLogFieldPoint() {
        hikingTour.logFieldPoints(LocalDateTime.of(2021,11,13,10,5),
                new FieldPoint(LocalDateTime.of(2021,11,13,7,25),
                        47.434452, 17.68433),
                new FieldPoint(LocalDateTime.of(2021,11,13,7,40),
                        47.434875, 17.68477),
                new FieldPoint(LocalDateTime.of(2021,11,13,7,52),
                        47.434781, 17.68393),
                new FieldPoint(LocalDateTime.of(2021,11,13,8,8),
                        47.434683, 17.68531));
        assertEquals(4, hikingTour.getFieldPoints().size());
        assertEquals(LocalDateTime.of(2021,11,13,10,5),
                hikingTour.getFieldPoints().get(0).getTimeOfLogging());
        assertEquals(LocalDateTime.of(2021,11,13,7,40),
                hikingTour.getFieldPoints().get(1).getTimeOfSetting());
        assertEquals(47.434781,
                hikingTour.getFieldPoints().get(2).getLatitude());
        assertEquals(17.68531,
                hikingTour.getFieldPoints().get(3).getLongitude());
    }

    @Test
    void testLogFieldPointWithNullLoggingTime() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> hikingTour.logFieldPoints(null,
                new FieldPoint(LocalDateTime.of(2021,11,13,7,25),
                        47.434452, 17.68433),
                new FieldPoint(LocalDateTime.of(2021,11,13,7,40),
                        47.434875, 17.68477),
                new FieldPoint(LocalDateTime.of(2021,11,13,7,52),
                        47.434781, 17.68393),
                new FieldPoint(LocalDateTime.of(2021,11,13,8,8),
                        47.434683, 17.68531)));
        assertEquals("Logging time is not available", iae.getMessage());
    }

}