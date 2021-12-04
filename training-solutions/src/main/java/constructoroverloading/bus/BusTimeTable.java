package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {
    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable = new ArrayList<>(timeTable);
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        this.timeTable = generateTable(firstHour, lastHour, everyMinute);
    }

    public List<SimpleTime> getTimeTable() {
        return new ArrayList<>(timeTable);
    }

    public SimpleTime getNextBus(SimpleTime actual) {
        for (SimpleTime time : timeTable) {
            if (actual.getDifference(time) > 0) {
                return time;
            }
        }
        throw new IllegalStateException("Sorry! No more bus today!");
    }

    private List<SimpleTime> generateTable(int firstHour, int lastHour, int everyMinute) {
        List<SimpleTime> timeTable = new ArrayList<>();
        int minute = 0;
        for (int hour = firstHour; hour <= lastHour; ) {
            if (minute < 60) {
                timeTable.add(new SimpleTime(hour, minute));
            }
            minute += everyMinute;
            while (minute >= 60) {
                hour++;
                minute -= 60;
            }
        }
        return timeTable;
    }
}
