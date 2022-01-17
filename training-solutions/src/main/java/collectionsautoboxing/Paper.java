package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Paper {
    private Map<String, Integer> paperOfClasses = new HashMap<>();

    public Map<String, Integer> getPaper() {
        return new HashMap<>(paperOfClasses);
    }

    public void putFurtherPaper(String className, int kilogramms) {
        if (paperOfClasses.containsKey(className)) {
            paperOfClasses.put(className, paperOfClasses.get(className) + kilogramms);
        } else {
            paperOfClasses.put(className, kilogramms);
        }
    }

    public String getWinnerClass() {
        int max = 0;
        String winnerClass = "";
        for (Map.Entry<String, Integer> actual: paperOfClasses.entrySet()) {
            if (actual.getValue() > max) {
                max = actual.getValue();
                winnerClass = actual.getKey();
            }
        }
        return winnerClass;
    }

    public int getTotalWeight() {
        int sum = 0;
        for (int a: paperOfClasses.values()) {
            sum += a;
        }
        return sum;
    }
}
