package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person p1;
        Person p2;

        p1 = new Person("John Doe", 1981);
        p2 = p1;
        p2.setName("Jack Doe");
        System.out.printf(p1.getName() + ", " + p1.getAge());
        System.out.printf(p2.getName() + ", " + p2.getAge());

        p1 = new Person("Joe Doe", 1978);;
        System.out.printf(p1.getName() + ", " + p1.getAge());
        System.out.printf(p2.getName() + ", " + p2.getAge());
    }
}
