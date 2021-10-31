package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("Zeusz", 3, "fekete");
        dogs.add(dog);
        Dog dog2 = new Dog("Apollo", 7, "zsemle");
        dogs.add(dog2);
        Dog dog3 = new Dog("Tündér", 4, "szürke");
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4 = dogs.get(1);
        dog4.setColour("barna");
        System.out.println(dogs);

        Dog dog5 = new Dog("Mona", 1, "foltos");
        System.out.println(dog5);

        dog5 = dogs.get(1);
        System.out.println(dog5);

        Dog dog6 = dog4;
        dog6.setColour("fehér");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;
        Dog dog7 = dog4;
        dog7.setColour("hamu szürke");
        System.out.println(dogs2);

        dog2.setColour("vörös");
        System.out.println(dogs2);

        dog2 = null;
        System.out.println(dogs2);

        Dog dog8 = dogs.get(1);
        dog8 = null;
        System.out.println(dogs2);

        Dog dog9 = dogs.get(1);
        dog9.setColour("zsemle");
        System.out.println(dogs2);
    }
}
