package stringbasic;

public class UniversityMain {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", "johny@example.com",
                "012-345-678",
                "11223344-55667788-99001122",
                "06305554555");
        Person person2 = new Person("Jane Doe", "jany@example.com",
                "013-245-678",
                "11223344-5561188-99077122",
                "06305554555");
        Person person3 = new Person("Jack Doe", "jacky@example.com",
                "012-346-578",
                "11223311-55667711-99001122",
                "06305554555");

        Student student1 = new Student(person1, "HTLFGT",
                "1234567890");
        Student student2 = new Student(person2, "FRXSMH",
                "3274561890");
        Student student3 = new Student(person3, "HTLFGT",
                "1234567890");
        Student student4 = new Student(person2, "H8LIG5",
                "7231564890");
        University unideb = new University();
        unideb.addStudent(student1);
        unideb.addStudent(student2);
        unideb.addStudent(student3);
        unideb.addStudent(student4);
        System.out.println(unideb.areEqual(student1, student2));
        System.out.println(unideb.areEqual(student4, student2));
        System.out.println(unideb.areEqual(student1, student3));
    }
}
