package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusTimeTableTest {

    @Test
    void testCreateWithTable() {
        List<SimpleTime> timeTable = new ArrayList<>();
        timeTable.add(new SimpleTime(4, 45));
        timeTable.add(new SimpleTime(5, 25));
        timeTable.add(new SimpleTime(6, 15));
        timeTable.add(new SimpleTime(6, 45));
        timeTable.add(new SimpleTime(7, 5));
        timeTable.add(new SimpleTime(7, 25));
        timeTable.add(new SimpleTime(7, 45));
        timeTable.add(new SimpleTime(8, 05));
        BusTimeTable busTimeTable = new BusTimeTable(timeTable);
        assertEquals(8, busTimeTable.getTimeTable().size());
    }

    @Test
    void testCreateWithTimeData() {
        BusTimeTable busTimeTable = new BusTimeTable(4, 22, 30);
        assertEquals(38, busTimeTable.getTimeTable().size());
    }

    @Test
    void testGetNextBus() {
        BusTimeTable busTimeTable = new BusTimeTable(4, 22, 30);
        assertEquals("12:30", busTimeTable.getNextBus(new SimpleTime(12)).toString());
        assertEquals("11:00", busTimeTable.getNextBus(new SimpleTime(10, 40)).toString());
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                () -> busTimeTable.getNextBus(new SimpleTime(22, 40)));
        assertEquals("Sorry! No more bus today!", ise.getMessage());
    }
}