package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> players = Arrays.asList("Kiss Béláné", "Apró Mária", "Csomós Andrea",
                "Nagy Péter", "Tóthné Horváth Mónika", "Dér Imre", "Daku Mátyás", "Mezei Éva",
                "Farkas László", "Gáspár Gáspás");
        Random rnd = new Random();
        int winner1 = rnd.nextInt(5);
        int winner2 = rnd.nextInt(5) + 5;

        System.out.println("A mai sorsolás nyertesei: ");
        System.out.println(players.get(winner1));
        System.out.println(players.get(winner2));
    }
}
