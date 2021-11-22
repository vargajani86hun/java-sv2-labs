package introexceptionthrowjunit4;


import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

    @Test
    public void testAddNote() {
        Student student = new Student();
        student.addNote(3);
        student.addNote(5);
        student.addNote(3);
        assertEquals(new ArrayList<>(Arrays.asList(3, 5, 3)), student.getGrades());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddNoteWithInvalidGrade() {
        Student student = new Student();
        student.addNote(6);
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testAddNoteWithInvalidGradeByRule() {
        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("Note must be between 1 and 5!");
        Student student = new Student();
        student.addNote(6);
    }

    @Test
    public void testAddNoteWithInvalidGradeByAssertThrows() {
        Student student = new Student();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> student.addNote(6));
        assertEquals("Note must be between 1 and 5!",
                exception.getMessage());
    }
}
