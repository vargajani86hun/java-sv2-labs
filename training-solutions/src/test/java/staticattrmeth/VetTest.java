package staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetTest {

    @Test
    void testCreate() {
        Vet vet = new Vet();
        assertEquals(0, vet.getDogs().size());
    }

    @Test
    void testAddDog() {
        Vet vet = new Vet();
        vet.addDog(new Dog("Zeus", 4, Species.LABRADOR));
        assertEquals(1, vet.getDogs().size());
        assertEquals(Vet.getCode() - 1, vet.getDogs().get(0).getCodeNumber());
    }
}