package algorithmstransformation.family;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {

    Family bigFamily = new Family();

    @Test
    void testCreate() {
        Family family = new Family();
        assertEquals(0, family.getMemberList().size());
    }

    @Test
    void testAddFamilyMember() {
        bigFamily.addFamilyMember(new FamilyMember("Mézga Aladár", 12));
        bigFamily.addFamilyMember(new FamilyMember("Mézga Kriszina", 16));

        assertEquals(2, bigFamily.getMemberList().size());
        assertEquals("Mézga Aladár", bigFamily.getMemberList().get(0).getName());
        assertEquals(16, bigFamily.getMemberList().get(1).getAge());
    }

    @Test
    void testGetAgesOfFamilyMembersWithNameGiven() {
        bigFamily.addFamilyMember(new FamilyMember("Kiss Béla Ádám", 52));
        bigFamily.addFamilyMember(new FamilyMember("Kiss Márta Karola", 24));
        bigFamily.addFamilyMember(new FamilyMember("Kiss Mátyás Ádám", 21));
        bigFamily.addFamilyMember(new FamilyMember("Kissné Tóth Karola Mária", 49));
        bigFamily.addFamilyMember(new FamilyMember("Kiss Béla Endre", 14));
        bigFamily.addFamilyMember(new FamilyMember("Tóth Béla Sándor", 53));
        bigFamily.addFamilyMember(new FamilyMember("Tóth Mihályné Szabó Mária", 73));
        bigFamily.addFamilyMember(new FamilyMember("Tóth Mihály Mátyás", 74));

        List<Integer> agesOfBelas = bigFamily.getAgesOfFamilyMembersWithNameGiven("Béla");
        assertEquals(3, agesOfBelas.size());
        assertEquals(14, agesOfBelas.get(1));
    }

}