package methodparam.marriage;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MarriageTest {

    @Test
    void testGetMarried() {
        Man husband = new Man("Nagy Béla", LocalDate.of(1968, 4, 22));
        Woman wife = new Woman("Tóth Rozália", LocalDate.of(1972, 11, 5));
        Marriage marriage = new Marriage();
        marriage.getMarried(wife, husband);
        assertEquals(2, husband.getRegisterDates().size());
        assertEquals(2, wife.getRegisterDates().size());
        assertEquals("Nagy Bélané Tóth Rozália", wife.getName());
        assertEquals("Nagy Béla", husband.getName());

    }

}