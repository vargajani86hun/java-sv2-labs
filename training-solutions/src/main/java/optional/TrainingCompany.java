package optional;

import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> courses;

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public Course getCheaperCourse(int maxPrice) {
        Optional<Course> result = Optional.empty();
        for (Course c: courses) {
            if (c.getPrice() < maxPrice) {
                result = Optional.of(c);
            }
        }
        return result.orElseThrow(() ->
                new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level) {
        Optional<Course> result = Optional.empty();
        for (Course c: courses) {
            if (c.getName().equals(name) && c.getLevel() == level) {
                result = Optional.of(c);
            }
        }
        return result.orElseThrow(() ->
                new IllegalArgumentException("No such course.")).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level) {
        Optional<String> result = Optional.empty();
        for (Course c: courses) {
            if (c.getLevel() == level) {
                result = Optional.of(c.getName());
            }
        }
        return result.orElse("Sorry, there is no course at this level.");
    }
}
