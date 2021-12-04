package defaultconstructor.date;

public class SimpleDate {
    private int year, month, day;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    private boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    private boolean isCorrect(int year, int month, int day) {
        if (year < 1900) {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if (day < 1 || day > calculateMonthLength(year, month)) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
        return true;
    }

    private int calculateMonthLength(int year, int month) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return (isLeapYear(year) ? 29 : 28);
            default:
                return 31;
        }
    }
}
