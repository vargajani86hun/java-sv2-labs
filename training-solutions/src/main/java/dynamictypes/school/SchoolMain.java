package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Internátus", 12);
        School primarySchool = new PrimarySchool("New Kids", 4);
        School secondarySchool = new SecondarySchool("New Kids Turbo", 4);
        System.out.println(school);
        System.out.println(primarySchool);
        System.out.println(secondarySchool);
    }
}
