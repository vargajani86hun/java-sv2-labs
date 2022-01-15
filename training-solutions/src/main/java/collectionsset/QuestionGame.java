package collectionsset;

import java.util.*;

public class QuestionGame {
    private List<RightAnswer> answers;

    public QuestionGame(List<RightAnswer> answers) {
        this.answers = answers;
    }

    public Set<String> drawWinners() {
        Set<String> winners = new HashSet<>();
        Random rnd = new Random();
        while (winners.size() < 5) {
            if (answers.isEmpty()) {
                throw new IllegalArgumentException("Not enough right answers!");
            }
            int index = rnd.nextInt(answers.size());
            winners.add(answers.get(index).getName());
            answers.remove(index);
        }
        return winners;
    }

    public void addAnswer(String name) {
        answers.add(new RightAnswer(name));
    }
}
