package interfacestaticmethods.schoolchild;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimarySchoolChildTest {

    @Test
    void testLowerClassSchool() {
        PrimarySchoolChild lowerClassChild = PrimarySchoolChild.of(6);
        assertEquals(6,
                ((LowerClassSchoolChild) lowerClassChild).getAge());
        PrimarySchoolChild lowerClassChild2 = PrimarySchoolChild.of(8);
        assertEquals(8,
                ((LowerClassSchoolChild) lowerClassChild2).getAge());
        PrimarySchoolChild lowerClassChild3 = PrimarySchoolChild.of(10);
        assertEquals(10,
                ((LowerClassSchoolChild) lowerClassChild3).getAge());
    }

    @Test
    void testUpperClassSchool() {
        PrimarySchoolChild upperClassChild = PrimarySchoolChild.of(11);
        assertEquals(11,
                ((UpperClassSchoolChild) upperClassChild).getAge());
        PrimarySchoolChild upperClassChild2 = PrimarySchoolChild.of(12);
        assertEquals(12,
                ((UpperClassSchoolChild) upperClassChild2).getAge());
        PrimarySchoolChild upperClassChild3 = PrimarySchoolChild.of(14);
        assertEquals(14,
                ((UpperClassSchoolChild) upperClassChild3).getAge());
    }

    @Test
    void testNotPrimarySchool() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                ()-> PrimarySchoolChild.of(5));
        assertEquals("Not a primary school aged child: 5", iae.getMessage());

        iae = assertThrows(IllegalArgumentException.class,
                ()-> PrimarySchoolChild.of(15));
        assertEquals("Not a primary school aged child: 15", iae.getMessage());
    }

}