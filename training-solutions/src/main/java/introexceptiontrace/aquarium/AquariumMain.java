package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Fish fish1 = new Fish("guppy", "yellow");
        Fish fish2 = new Fish("guppy", "brown");
        Fish fish3 = new Fish("fugu", "purple");
        Fish fish4 = new Fish("golden", "yellow");

        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        aquarium.addFish(fish4);

        System.out.println("Az akváriumban " + aquarium.getNumberOfFish() +
                "db hal van.");
    }
}
