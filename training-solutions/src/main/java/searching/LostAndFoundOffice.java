package searching;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LostAndFoundOffice {
    private List<LostProperty> lostProperties = new LinkedList<>();

    public void addProperty(LostProperty lostProperty) {
        lostProperties.add(lostProperty);
    }

    public LostProperty findLostProperty(LostProperty lostProperty) {
        Collections.sort(lostProperties);
        int i = Collections.binarySearch(lostProperties, lostProperty);
        if (i < 0) {
            throw new IllegalArgumentException("Property not found.");
        }
        else {
            return lostProperties.get(i);
        }
    }
}
