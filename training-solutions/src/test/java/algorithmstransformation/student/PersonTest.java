package algorithmstransformation.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCreate() {
        Person person = new Person("Kiss Károly", 32,"4027 Debrecen, Víztorony utca 32");
        assertEquals("Kiss Károly", person.getName());
        assertEquals(32, person.getAge());
        assertEquals("4027 Debrecen, Víztorony utca 32", person.getAddress());
    }

}