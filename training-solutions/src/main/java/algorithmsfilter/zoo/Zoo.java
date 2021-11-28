package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animalsList;

    public Zoo(List<Animal> animalsList) {
        this.animalsList = animalsList;
    }

    public void addAnimal(Animal toAdd) {
        animalsList.add(toAdd);
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs) {
        List<Animal> results = new ArrayList<>();
        for (Animal actual : animalsList) {
            if (actual.getNumberOfLegs() == numberOfLegs) {
                results.add(actual);
            }
        }
        return results;
    }

    public List<Animal> getAnimalsList() {
        return new ArrayList<>(animalsList);
    }
}
