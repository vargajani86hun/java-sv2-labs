package algorithmssum.school;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void testGetNumberOfStudents() {
        assertEquals(181, new School().getNumberOfStudents(
                new ArrayList<>(Arrays.asList(18, 24, 21, 23, 28, 17, 26, 24))));
    }
}