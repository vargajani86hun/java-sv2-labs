package algorithmscount.height;

import java.util.List;

public class Height {
    public int countChildrenWithHeightGreaterThan(List<Integer> heightsOfChildren,
                                                  int minHeight) {
        int amount = 0;
        for (Integer child : heightsOfChildren) {
            if (child >= minHeight) {
                amount++;
            }
        }
        return amount;
    }
}
