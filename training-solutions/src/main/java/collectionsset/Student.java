package collectionsset;

import java.util.Objects;

public class Student {
    private String name;
    private int height;

    public Student(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return height == student.height && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
}
