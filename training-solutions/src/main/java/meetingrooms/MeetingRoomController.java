package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public static void main(String[] args) {
        MeetingRoomController mrc = new MeetingRoomController();
        mrc.runMenu();
    }

    private void readOffice() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Adja meg a tárgyaló nevét:");
        String name = scr.nextLine();
        System.out.println("Adja meg a tárgyal szélességét:");
        int width = scr.nextInt();
        scr.nextLine();
        System.out.println("Adja meg a tárgyaló hosszúságát:");
        int length = scr.nextInt();
        office.addMeetingRoom(new MeetingRoom(name, length, width));
    }

    private void printMenu() {
        String menu = "```\n1. Tárgyaló rögzítése\n" +
            "2. Tárgyalók sorrendben\n" +
            "3. Tárgyalók visszafele sorrendben\n" +
            "4. Minden második tárgyaló\n" +
            "5. Területek\n" +
            "6. Keresés pontos név alapján\n" +
            "7. Keresés névtöredék alapján\n" +
            "8. Keresés terület alapján\n" +
            "9. Kilépés\n```";
        System.out.println(menu);
    }

    private void runMenu() {
        Scanner scr = new Scanner(System.in);
        int menuNumber;
        do {
            printMenu();
            menuNumber = scr.nextInt();
            scr.nextLine();

            switch (menuNumber) {
                case 1 :
                    readOffice();
                    break;
                case 2 :
                    office.printNames();
                    break;
                case 3 :
                    office.printNamesReverse();
                    break;
                case 4 :
                    office.printEvenNames();
                    break;
                case 5 :
                    office.printAreas();
                    break;
                case 6 :
                    System.out.println("Adja meg a keresett tárgyaló nevét:");
                    String name = scr.nextLine();
                    office.printMeetingRoomsWithName(name);
                    break;
                case 7 :
                    System.out.println("Adja meg a keresett tárgyaló nevének egy részét:");
                    String part = scr.nextLine();
                    office.printMeetingRoomsContains(part);
                    break;
                case 8 :
                    System.out.println("Mekkora területnél nagybb tárgyalót keres?");
                    int area = scr.nextInt();
                    scr.nextLine();
                    office.printAreasLargerThan(area);
                    break;
                case 9 :
                    break;
                default :
                    System.out.println("Nincs ilyen menüpont!");
            }

        } while (menuNumber != 9);
    }
}
