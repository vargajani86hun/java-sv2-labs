package staticattrmeth;

import java.util.ArrayList;
import java.util.List;

public class Vet {
    private List<Dog> dogs = new ArrayList<>();

    private static long code = 1;

    public void addDog(Dog dog) {
        dog.setCodeNumber(code);
        dogs.add(dog);
        code++;
    }

    public List<Dog> getDogs() {
        return new ArrayList<>(dogs);
    }

    public static long getCode() {
        return code;
    }
}
