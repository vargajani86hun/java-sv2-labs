package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {
    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer oldest = trainers.get(0);
        for (int i = 1; i < trainers.size(); i++) {
            if (oldest.getAge() < trainers.get(i).getAge()) {
                oldest = trainers.get(i);
            }
        }
        return oldest;
    }
}
