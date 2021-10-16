package statements;

public class Time {
    private int hour, minute, secund;

    public Time(int hour, int minute, int secund) {
        this.hour = hour;
        this.minute = minute;
        this.secund = secund;
    }

    public int getInMinutes () {
        return minute + 60 * hour;
    }

    public int getInSecunds () {
        return secund + 60 * minute + 3600 * hour;
    }

    public boolean earlierThan(Time otherTime) {
        return this.getInSecunds() < otherTime.getInSecunds();
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + secund;
    }
}
