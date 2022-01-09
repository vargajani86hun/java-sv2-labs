package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String socialSecurityNumber;

    public Person(String name, int age, String socialSecurityNumber) {
        validateName(name);
        validateAge(age);
        validateSocialSecurityNumber(socialSecurityNumber);
        this.name = name;
        this.age = age;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public static void main(String[] args) {
        Person person = new Person("Kiss Ádám", 33, "131-321-531");
        Person otherPerson = new Person("Tóth Irén", 28, "131-321-531");
        System.out.println(person.equals(otherPerson));
        System.out.println(person.hashCode());
        System.out.println(otherPerson.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return socialSecurityNumber.equals(person.socialSecurityNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(socialSecurityNumber);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    private void validateSocialSecurityNumber(String socialSecurityNumber) {
        if (socialSecurityNumber == null) {
            throw new NullPointerException("Social security number must not be null!");
        }
        if (socialSecurityNumber.isEmpty()) {
            throw new IllegalArgumentException("Social security number must not be empty!");
        }
    }

    private void validateName(String name) {
        if (name == null) {
            throw new NullPointerException("Name must not be null!");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty!");
        }
    }

    private void validateAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }
}
