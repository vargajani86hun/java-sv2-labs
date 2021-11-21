package introexceptionthrowjunit5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;


public class StudentTest {

    Student student;

    @BeforeEach
    void init() {
        student = new Student();
    }

    @Test
    void testAddNote() {
        student.addNote(4);
        student.addNote(3);
        student.addNote(5);
        assertEquals(Arrays.asList(4, 3, 5), student.getGrades());
    }

    @Test
    void testAddNoteWithInvalidGrade() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> student.addNote(8));
        assertEquals("Note must be between 1 and 5!", iae.getMessage());
    }
}
