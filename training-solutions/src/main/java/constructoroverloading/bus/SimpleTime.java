package constructoroverloading.bus;

public class SimpleTime {
    private int hours, minutes;

    public SimpleTime(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        }
        else if (hours < 0) {
            this.hours = hours + (24 * (1 + Math.abs(hours / 24)));
        }
        else {
            this.hours = hours - (24 * (hours / 24));
        }
    }

    public SimpleTime(int hours, int minutes) {
        this(hours);
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        }
        else if (minutes < 0) {
            this.minutes = minutes + (60 * (1 + Math.abs(minutes / 60)));
        }
        else {
            this.minutes = minutes - (60 * (minutes / 60));
        }
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getDifference(SimpleTime time) {
        return (time.minutes + time.hours * 60) -
                (this.minutes + this.hours * 60);
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", hours, minutes);
    }
}
