package algorithmsfilter.zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testCreate() {
        Animal animal = new Animal("kutya", 4);
        assertEquals("kutya", animal.getName());
        assertEquals(4, animal.getNumberOfLegs());
    }

}