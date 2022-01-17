package collectionsautoboxing;

import java.util.HashMap;
import java.util.Map;

public class Vote {
    public Map<VoteResult, Integer> getResult(Map<String, VoteResult> votes) {
        Map<VoteResult, Integer> results = new HashMap<>();
        for (VoteResult actual: votes.values()) {
            if (results.containsKey(actual)) {
                results.put(actual, results.get(actual) + 1);
            } else {
                results.put(actual, 1);
            }
        }
        return results;
    }
}
