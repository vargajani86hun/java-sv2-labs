package controladvanced.labels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {
    Labels labels;

    @BeforeEach
    void init() {
        labels = new Labels();
    }

    @Test
    void testGetTableOfNumbers() {
        int[][] numbers = labels.getTableOfNumbers(5);
        assertEquals(2, numbers[0][0]);
        assertEquals(6, numbers[2][2]);
        assertEquals(9, numbers[4][3]);
    }
}
