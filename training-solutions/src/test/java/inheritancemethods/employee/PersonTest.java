package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("John Doe", "Vác, Alkotmány út 13.");
        assertEquals("John Doe", person.getName());
        assertEquals("Vác, Alkotmány út 13.", person.getAddress());
    }

    @Test
    void testMigrate() {
        Person person = new Person("John Doe", "Vác, Alkotmány út 13.");
        person.migrate("Sopron, Kőhíd utca 3.");
        assertEquals("Sopron, Kőhíd utca 3.", person.getAddress());
    }

}