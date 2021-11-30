package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog = new Dog();

    @Test
    void testGetSetName() {
        dog.setName("Morzsi");

        assertEquals("Morzsi", dog.getName());
    }

    @Test
    void testGetSetAge() {
        dog.setAge(3);

        assertEquals(3, dog.getAge());
    }

    @Test
    void testIsSetPedigree() {
        dog.setPedigree(true);

        assertEquals(true, dog.isPedigree());
    }

    @Test
    void testGetSetWeight() {
        dog.setWeight(7.2);

        assertEquals(7.2, dog.getWeight());
    }

}