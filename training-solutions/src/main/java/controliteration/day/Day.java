package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay = new ArrayList<>();

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public List<Hour> getHoursOfDay() {
        return new ArrayList<>(hoursOfDay);
    }

    public void setDayPeriod() {
        for (Hour hour : hoursOfDay) {
            int h = hour.getHourNumber();
            if (h >= 6 && h < 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            }
            else {
                hour.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }
}
