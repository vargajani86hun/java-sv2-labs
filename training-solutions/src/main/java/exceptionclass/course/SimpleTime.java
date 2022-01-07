package exceptionclass.course;

public class SimpleTime {
    private final int hour, minute;

    public SimpleTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeString) {
        checkTimeString(timeString);
        int[] timeParts = convertToTime(timeString);
        this.hour = timeParts[0];
        this.minute = timeParts[1];
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }

    private int[] convertToTime(String timeString) {
        String[] timeParts = timeString.split(":");
        return new int[]{Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1])};
    }

    private void checkTimeString(String timeString) {
        if (timeString == null) {
            throw new InvalideTimeException("Time is null");
        }
        if (timeString.length() != 5 || !timeString.contains(":")) {
            throw new InvalideTimeException("Time is not hh:mm");
        }
        int[] parts = convertToTime(timeString);
        if (parts[0] < 0 || parts[0] > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
        if (parts[1] < 0 || parts[1] > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
    }
}
