package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyMemberTest {

    @Test
    void testCreate() {
        FamilyMember sister = new FamilyMember("Viki", 40);

        assertEquals("Viki", sister.getName());
        assertEquals(40, sister.getAge());
    }
}