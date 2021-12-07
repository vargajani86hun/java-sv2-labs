package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigBossTest {

    @Test
    void testCreate() {
        BigBoss bigBoss = new BigBoss("John Doe",
                "Vác, Alkotmány út 13.",
                280_000, 45, 140_000);
        assertEquals("John Doe", bigBoss.getName());
        assertEquals("Vác, Alkotmány út 13.", bigBoss.getAddress());
        assertEquals(45, bigBoss.getNumberOfEmployees());
        assertEquals(140_000, bigBoss.getBonus());
        assertEquals(1_680_000, bigBoss.getSalary());
    }

}