package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        char c;
        do {
            System.out.println("Az ügyfélszolgálat menüje jelenleg nem elérhető.\nKilépés: 'x' billentyű megnyomásával");
            c = scr.next().charAt(0);
        } while (c != 'x');
    }
}
