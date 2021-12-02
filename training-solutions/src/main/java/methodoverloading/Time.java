package methodoverloading;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public boolean isEqual(int hours, int minutes, int seconds) {
        return (hours == this.hours) &&
                (minutes == this.minutes) &&
                (seconds == this.seconds);
    }

    public boolean isEqual(Time time) {
        return this.isEqual(time.hours, time.minutes, time.seconds);
    }

    public boolean isEarlier(int hours, int minutes, int seconds) {
        if (this.hours > hours) {
            return false;
        }
        if (this.hours == hours && this.minutes > minutes) {
            return false;
        }
        if (this.hours == hours && this.minutes == minutes && this.seconds >= seconds) {
            return false;
        }
        return true;
    }

    public boolean isEarlier(Time time) {
        return this.isEarlier(time.hours, time.minutes, time.seconds);
    }
}
