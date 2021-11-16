package introexceptionmoreexceptions;

import java.util.Locale;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person(null, 32);
        System.out.println(person);
        System.out.println(person.getName());
        System.out.println(person.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return name + " is " + age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
