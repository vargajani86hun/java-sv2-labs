package exceptionclass.course;

public class Course {
    private String name;
    private SimpleTime begin;

    public Course(String name, SimpleTime begin) {
        checkName(name);
        checkBegin(begin);
        this.name = name;
        this.begin = begin;
    }

    public String getName() {
        return name;
    }

    public SimpleTime getBegin() {
        return begin;
    }

    @Override
    public String toString() {
        return begin + ": " + name;
    }

    private void checkName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name is null!");
        }
    }

    private void checkBegin(SimpleTime begin) {
        if (begin == null) {
            throw new IllegalArgumentException("Begin is null!");
        }
    }
}
