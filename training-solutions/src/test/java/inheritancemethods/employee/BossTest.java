package inheritancemethods.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BossTest {

    @Test
    void testCreate() {
        Boss boss = new Boss("John Doe",
                "Vác, Alkotmány út 13.", 240_000, 20);
        assertEquals(720_000, boss.getSalary());
        assertEquals(20, boss.getNumberOfEmployees());
        assertEquals("John Doe", boss.getName());
        assertEquals("Vác, Alkotmány út 13.", boss.getAddress());
    }

}