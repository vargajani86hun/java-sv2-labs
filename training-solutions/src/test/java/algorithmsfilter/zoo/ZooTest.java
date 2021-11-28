package algorithmsfilter.zoo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    Zoo debreceni;
    List<Animal> animals = new ArrayList<>();

    @BeforeEach
    void init() {
        animals.add(new Animal("emu", 2));
        animals.add(new Animal("kangaroo", 4));
        animals.add(new Animal("goat", 4));
        animals.add(new Animal("owl", 2));
        debreceni = new Zoo(animals);
    }

    @Test
    void testCreate() {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("ocelot", 4));
        animalList.add(new Animal("cockatoo", 2));
        Zoo nyiregyi = new Zoo(animalList);
        assertEquals(animalList.size(), nyiregyi.getAnimalsList().size());
        assertEquals(animalList.get(0), nyiregyi.getAnimalsList().get(0));
    }

    @Test
    void testAddAnimal() {
        debreceni.addAnimal(new Animal("tiger", 4));
        debreceni.addAnimal(new Animal("flamingo", 2));
        assertEquals(6, debreceni.getAnimalsList().size());
    }

    @Test
    void testGetAnimalsWithNumberOfLegsGiven() {
        List<Animal> birds = debreceni.getAnimalsWithNumberOfLegsGiven(2);
        assertEquals(2, birds.size());
        assertEquals("emu", birds.get(0).getName());
        assertEquals("owl", birds.get(1).getName());
    }
}