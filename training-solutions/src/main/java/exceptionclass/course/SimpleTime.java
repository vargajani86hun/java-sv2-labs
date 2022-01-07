package exceptionclass.course;

public class SimpleTime {
    private final int hour, minute;
    private static final String STANDARD_EXCEPTION_MESSAGE = "Time is not hh:mm";

    public SimpleTime(int hour, int minute) {
        checkHour(hour);
        checkMinute(minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String timeString) {
        checkTimeString(timeString);
        int[] timeParts = convertToTimeParts(timeString);
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
        return String.format("%02d:%02d", hour, minute);
    }

    private int[] convertToTimeParts(String timeString) {
        String[] timeParts = timeString.split(":");
        checkHour(timeParts[0]);
        checkMinute(timeParts[1]);
        return new int[]{Integer.parseInt(timeParts[0]), Integer.parseInt(timeParts[1])};
    }

    private void checkTimeString(String timeString) {
        if (timeString == null) {
            throw new InvalideTimeException("Time is null");
        }
        if (timeString.length() != 5 || !timeString.contains(":")) {
            throw new InvalideTimeException(STANDARD_EXCEPTION_MESSAGE);
        }
    }

    private void checkHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new InvalideTimeException("Hour is invalid (0-23)");
        }
    }

    private void checkHour(String hour) {
        try {
            checkHour(Integer.parseInt(hour));
        }
        catch (NumberFormatException nfe) {
            throw new InvalideTimeException(STANDARD_EXCEPTION_MESSAGE);
        }
    }

    private void checkMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new InvalideTimeException("Minute is invalid (0-59)");
        }
    }

    private void checkMinute(String minute) {
        try {
            checkMinute(Integer.parseInt(minute));
        }
        catch (NumberFormatException nfe) {
            throw new InvalideTimeException(STANDARD_EXCEPTION_MESSAGE);
        }
    }
}
