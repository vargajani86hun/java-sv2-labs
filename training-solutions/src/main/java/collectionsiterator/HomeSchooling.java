package collectionsiterator;

import java.time.LocalDateTime;
import java.util.*;

public class HomeSchooling {
    private List<OnlineLesson> lessons = new LinkedList<>();

    public void addNewLesson(OnlineLesson lesson) {
        lessons.add(lesson);
        lessons.sort(new Comparator<OnlineLesson>() {
            @Override
            public int compare(OnlineLesson o1, OnlineLesson o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> results = new ArrayList<>();
        Iterator<OnlineLesson> oli = lessons.iterator();
        while (oli.hasNext()) {
            OnlineLesson olTemp = oli.next();
            if (olTemp.getLessonTitle().equals(title)) {
                results.add(olTemp);
            }
        }
        return results;
    }

    public List<OnlineLesson> getLessons() {
        return new LinkedList<>(lessons);
    }

    public void removeLesson(LocalDateTime startTime) {
        for (Iterator<OnlineLesson> oli = lessons.iterator(); oli.hasNext();) {
            if (oli.next().getStartTime().equals(startTime)) {
                oli.remove();
            }
        }
    }
}
