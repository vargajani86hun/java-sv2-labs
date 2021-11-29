package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testCreate() {
        Student student = new Student("Mészáros Karola", "3545 Kazincbarcika, Kölcsey utca 13.");

        assertEquals("Mészáros Karola", student.getName());
        assertEquals("3545 Kazincbarcika, Kölcsey utca 13.", student.getAddress());
    }
}