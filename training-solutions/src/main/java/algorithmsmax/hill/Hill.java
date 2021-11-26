package algorithmsmax.hill;

import java.util.List;

public class Hill {
    public int getMax(List<Integer> heightsOfHills) {
        int maxHeight = Integer.MIN_VALUE;
        for (Integer height : heightsOfHills) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }
}
