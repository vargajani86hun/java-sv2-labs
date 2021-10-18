package statements;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        int hour, minute, secund;
        Scanner scr = new Scanner(System.in);

        System.out.println("Adjon meg egy időpontot úgy, hogy az óra, perc és másodperc szóközökkel van elválasztva: ");
        hour = scr.nextInt();
        minute = scr.nextInt();
        secund = scr.nextInt();
        scr.nextLine();
        Time time1 = new Time(hour, minute, secund);

        System.out.println("Adjon meg még egy időpontotúgy, hogy az óra, perc és másodperc szóközökkel van elválasztva: ");
        hour = scr.nextInt();
        minute = scr.nextInt();
        secund = scr.nextInt();
        Time time2 = new Time(hour, minute, secund);

        System.out.println("Az első időpont " + time1 + " = " + time1.getInMinutes());
        System.out.println("A második időpont " + time2 + " = " + time2.getInSecunds());
        System.out.println("Az első korábbi, mint a második: " + time1.earlierThan(time2));
    }
}
