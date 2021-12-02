package methodoverloading;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassFiveATest {

    ClassFiveA classFiveA = new ClassFiveA();

    @Test
    void testGetTodayReferringStudentWithInt() {
        assertEquals("Asztalos Attila", classFiveA.getTodayReferringStudent(1));
        assertEquals("Gyurkó Béla", classFiveA.getTodayReferringStudent(8));
        assertEquals("Sándor Szafira", classFiveA.getTodayReferringStudent(25));
    }

    @Test
    void testGetTodayReferringStudentWithEnum() {
        assertEquals("Asztalos Attila", classFiveA.getTodayReferringStudent(Number.ONE));
        assertEquals("Kovács Balázs", classFiveA.getTodayReferringStudent(Number.THIRTEEN));
        assertEquals("Sándor Szafira", classFiveA.getTodayReferringStudent(Number.TWENTYFIVE));
    }

    @Test
    void testGetTodayReferringStudentWithString() {
        assertEquals("Asztalos Attila", classFiveA.getTodayReferringStudent("one"));
        assertEquals("Karnik Mercédesz", classFiveA.getTodayReferringStudent("eleven"));
        assertEquals("Sándor Szafira", classFiveA.getTodayReferringStudent("twentyfive"));
    }

}