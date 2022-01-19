package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exam {
    private List<ExamResult> examResults;

    public Exam(List<ExamResult> examResults) {
        this.examResults = examResults;
    }
    public List<String> getNamesOfSucceededPeople(int places) {
        List<String> results = new ArrayList<>(places);
        examResults.sort(new Comparator<ExamResult>() {
            @Override
            public int compare(ExamResult o1, ExamResult o2) {
                return o1.getPoints() - o2.getPoints();
            }
        });
        Collections.reverse(examResults);
        for (int i = 0; i < places && i < examResults.size(); i++) {
            results.add(examResults.get(i).getName());
        }
        return results;
    }
}
