package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> bunch = new LinkedList<>();

    public void addFlower(String flower) {
        bunch.add(flower);
    }

    public void addFlowerInTheMiddle(String flower) {
        if (bunch.size() % 2 == 0) {
            bunch.add(bunch.size() / 2, flower);
        } else {
            int index = bunch.size() / 2;
            bunch.add(index + 1, flower);
            bunch.add(index, flower);
        }
    }

    public List<String> getBunch() {
        return new LinkedList<>(bunch);
    }
}
