package collectionsqueue;

import java.util.*;

public class Vaccination {
    public static Queue<Integer> getVaccinationOrder(List<Person> people) {
        Queue<Integer> results = new PriorityQueue<>();
        for (Person p: people) {
            if (p.getAge() >= 18 && p.getAge() <= 65) {
                results.offer(p.getAge());
            }
        }
        return results;
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Irén", 38), new Person("Béla", 32),
                new Person("Géza", 42), new Person("Jolán", 22), new Person("János", 35),
                new Person("Éva", 52), new Person("Blanka", 15), new Person("Bálint", 77),
                new Person("Margit", 62), new Person("Mihály", 31), new Person("Mikolós", 65),
                new Person("Kriszta", 19), new Person("Sándor", 18), new Person("Imre", 66),
                new Person("Irma", 18), new Person("Ábel", 17));
        Queue<Integer> ages = getVaccinationOrder(people);

        System.out.println(ages);
        while(!ages.isEmpty()) {
            System.out.println(ages.poll());
            System.out.println(ages);
        }
    }
}
