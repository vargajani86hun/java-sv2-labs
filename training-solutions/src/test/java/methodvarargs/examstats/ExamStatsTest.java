package methodvarargs.examstats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExamStatsTest {

    ExamStats examStats;

    @Test
    void testCreate() {
        examStats = new ExamStats(75);
        assertEquals(75, examStats.getMaxPoints());
    }

    @Test
    void testGetNumberOfTopGrades() {
        examStats = new ExamStats(60);
        assertEquals(4, examStats.getNumberOfTopGrades(90,
                38, 58, 42, 52, 56, 48, 60, 57, 44));
    }

    @Test
    void testGetNumberOfTopGradesWithNoResults() {
        examStats = new ExamStats(60);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> examStats.getNumberOfTopGrades(85));
        assertEquals("Results of exam are not available", iae.getMessage());
    }

    @Test
    void testHasAnyFailed() {
        examStats = new ExamStats(60);
        assertFalse(examStats.hasAnyFailed(60,
                38, 58, 42, 52, 56, 48, 60, 57, 44));

        assertTrue(examStats.hasAnyFailed(60,
                38, 58, 42, 31, 52, 56, 48, 60, 28, 57, 44));
    }

    @Test
    void testGHasAnyFailedWithNoResults() {
        examStats = new ExamStats(60);
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> examStats.hasAnyFailed(55));
        assertEquals("Results of exam are not available", iae.getMessage());
    }
}