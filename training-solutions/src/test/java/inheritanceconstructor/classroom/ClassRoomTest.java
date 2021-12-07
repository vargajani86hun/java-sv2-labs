package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {

    @Test
    void testIsSuitable() {
        ClassRoom smallComputerLabour = new ClassRoom("I. emelet, bal oldal, elöl",
                15, Facility.COMPUTERS);
        ClassRoom normalComputerLabour = new ClassRoom("I. emelet, bal oldal, hátul",
                20, Facility.COMPUTERS);
        ClassRoom largeComputerLabour = new ClassRoom("I. emelet, jobb oldal, hátul",
                25, Facility.COMPUTERS);
        ClassRoom auditorium = new ClassRoom("Földszint", 120, Facility.PROJECTOR);
        ClassRoom labourAndMeetingRoom = new ClassRoom("I. emelet, jobb oldal, elöl",
                18, Facility.CHALKBOARD);

        Course oracle = new Course(18, Facility.COMPUTERS);
        Course cisco = new Course(24, Facility.COMPUTERS);
        Course computerNetworks = new Course(100, Facility.PROJECTOR);
        Course scrum = new Course(12, Facility.CHALKBOARD);

        assertFalse(smallComputerLabour.isSuitable(oracle));
        assertFalse(largeComputerLabour.isSuitable(scrum));
        assertTrue(normalComputerLabour.isSuitable(oracle));
        assertTrue(largeComputerLabour.isSuitable(cisco));
        assertFalse(auditorium.isSuitable(scrum));
        assertTrue(auditorium.isSuitable(computerNetworks));
    }

}