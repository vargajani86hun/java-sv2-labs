package algorithmsmax.temperature;

import java.util.List;

public class Temperature {
    public int getMin(List<Integer> tempList) {
        int minimum = Integer.MAX_VALUE;
        for (Integer temp : tempList) {
            if (temp < minimum) {
                minimum = temp;
            }
        }
        return minimum;
    }
}
