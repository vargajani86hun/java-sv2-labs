package introcontrol;

import java.util.Scanner;

public class BoatRental {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int passengers;

        System.out.println("Adja meg a csapattagok számát: ");
        passengers = scr.nextInt();

        if (passengers > 10) {
            System.out.println("Minden csónakot elvittek, " +
                    (passengers-10) + " ember vár még csónakra.");
        }
        else if (passengers > 4) {
            if (passengers == 4 || passengers == 5) {
                System.out.println("Az 5 fős csónakot elvitték. Még 5 fő bérelhet csónakot");
            }
            else if(passengers == 6 || passengers == 7) {
                System.out.println("Az 5 és a 2 fős csónakokat elvitték. Még 3 fő számára van csónak");
            }
            else if(passengers == 8) {
                System.out.println("Az 5 és a 3 fős csónakokat elvitték. Még 2 fő számára van csónak");
            }
            else {
                System.out.println("Minden csónakunkat elvitték.");
            }
        }
        else if (passengers < 3) {
            System.out.println("A 2 fős csónakunkat elvitték. Még 8 fő bérelhet csónakot");
        }
        else {
            System.out.println("A 3 fős csónakunkat elvitték. Még 7 fő bérelhet csónakot");
        }
    }
}
