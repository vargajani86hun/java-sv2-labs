package lambdaoptional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Club {
    private List<Member> members;

    public Club(List<Member> members) {
        this.members = members;
    }

    public Optional<Member> findFirst(Predicate<Member> predicate) {
        return members.stream()
                .filter(predicate)
                .findFirst();
    }

    public Optional<Double> averageNumberOfSkills() {
        List<Integer> numberOfSkills = members.stream()
                .map(member -> member.getSkills().size())
                .toList();
        if (numberOfSkills == null || numberOfSkills.isEmpty()) {
            return Optional.empty();
        }
        int sum = 0;
        for (int i: numberOfSkills) {
            sum += i;
        }
        return Optional.of((double)sum/ numberOfSkills.size());
    }
}
