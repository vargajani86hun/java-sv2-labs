package collectionsiterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChristmasShopping {
    private List<ChristmasPresent> presents;

    public ChristmasShopping(List<ChristmasPresent> presents) {
        this.presents = presents;
    }

    public void addNewPresent(ChristmasPresent present) {
        presents.add(present);
    }

    public List<ChristmasPresent> getPresents() {
        return new ArrayList<>(presents);
    }

    public void removeTooExpensivePresent(int maxPrice) {
        for (Iterator<ChristmasPresent> cpi = presents.iterator(); cpi.hasNext();) {
            if (cpi.next().getPrice() > maxPrice) {
                cpi.remove();
            }
        }
    }
}
