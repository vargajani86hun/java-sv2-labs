package collectionsmap;

import java.util.Map;
import java.util.Set;

public class Casting {

    public static String callNextApplicant(int lastNumber, Map<Integer, String> applicants) {
        return applicants.get(getLowerNext(lastNumber, applicants.keySet()));
    }

    private static int getLowerNext(int lastNumber, Set<Integer> numbers) {
        int nextNumber = Integer.MAX_VALUE;
        for (int i: numbers) {
            if (lastNumber < i && nextNumber > i) {
                nextNumber = i;
            }
        }
        return nextNumber;
    }
}
