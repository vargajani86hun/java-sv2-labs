package controlselection.month;

import java.util.Locale;

public enum NameOfMonth {
    JANUARY("január"), FEBRUARY("február"),
    MARCH("március"), APRIL("április"),
    MAY("május"), JUNE("június"),
    JULY("július"), AUGUST("augusztus"),
    SEPTEMBER("szeptember"), OCTOBER("október"),
    NOVEMBER("november"), DECEMBER("december");

    private final String hungarianName;

    NameOfMonth(String hungarianName){
        this.hungarianName = hungarianName;
    }

    public String getHungarianName(){
        return hungarianName;
    }

}
