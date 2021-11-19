package introexceptiontrycatchtrace;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Winner {
    private List<String> names = Arrays.asList("Kiss Péter", null, "Kovács Tamás", "Erdei Imre",
            "Mező Péter", null, "Molnár Evelin", "Szabó Olívia", null, "Tóth Márton");

    private Random rnd = new Random();

    public String getWinner() {
        int winner = rnd.nextInt(names.size());
        return names.get(winner).toUpperCase();
    }
}
