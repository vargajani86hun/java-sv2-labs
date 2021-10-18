package classstructureattributes;

import java.util.Scanner;

public class Music {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Song favoritSong = new Song();

        System.out.println("Kérem, adja meg kedvenc előadója nevét: ");
        favoritSong.band = scr.nextLine();
        System.out.println("Adja meg " + favoritSong.band + "-től kedvenc zeneszáma címét: ");
        favoritSong.title = scr.nextLine();
        System.out.println("kérem, ajda meg a(z) " + favoritSong.title + " hosszát percben: ");
        favoritSong.length = scr.nextInt();
        System.out.println("Az ön kedvenc zenéje: ");
        System.out.println(favoritSong.band + " - " + favoritSong.title + " (" + favoritSong.length + " perc)");

    }

}
