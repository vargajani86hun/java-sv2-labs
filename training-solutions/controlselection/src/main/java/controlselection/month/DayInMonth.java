package controlselection.month;

import java.util.Locale;

public class DayInMonth {

    public int daysOfTheMonth(int year, String month) {
        boolean leapYear = isLeapYear(year);
        switch (month.toLowerCase()) {
            case "január" :
            case "március" :
            case "május" :
            case "július" :
            case "augusztus" :
            case "október" :
            case "december" :
                return 31;
            case "április" :
            case "június" :
            case "szeptember" :
            case "november" :
                return 30;
            case "február" :
                return leapYear ? 29 : 28;
            default:
                throw new IllegalArgumentException("Nincs ilyen nevű hónap");
        }
    }

    public boolean isLeapYear(int year) {
        if (((year % 100 == 0) && (year % 400 != 0)) || (year % 4 != 0)) {
            return false;
        }
        else {
            return true;
        }
    }

}
