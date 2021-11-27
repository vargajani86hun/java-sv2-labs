package algorithmsdecision.towns;

import java.util.List;

public class Town {
    public boolean containsFewerHabitants(List<Integer> populations, int minimum) {
        for (Integer population : populations){
            if (population < minimum) {
                return true;
            }
        }
        return false;
    }
}
