package methodstructure.pendrives;

import java.util.List;

public class Pendrives {
    public Pendrive getBest(List<Pendrive> pendriveList) {
        Pendrive best = pendriveList.get(0);
        for (Pendrive actual : pendriveList) {
            if (best.comparePricePerCapacity(actual) > 0) {
                best = actual;
            }
        }
        return best;
    }

    public Pendrive getCheapest(List<Pendrive> pendriveList) {
        Pendrive cheapest = pendriveList.get(0);
        for (Pendrive actual : pendriveList) {
            if (actual.isCheaperThan(cheapest)) {
                cheapest = actual;
            }
        }
        return cheapest;
    }

    public void risePriceWhereCapacity(List<Pendrive> pendriveList, int percent, int capacity) {
        for (Pendrive actual : pendriveList) {
            if (actual.getCapacity() == capacity) {
                actual.risePrice(percent);
            }
        }
    }
}
