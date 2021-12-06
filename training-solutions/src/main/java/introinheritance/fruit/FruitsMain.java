package introinheritance.fruit;

public class FruitsMain {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("büszke");
        fruit.setWeight(0.012);
        System.out.println(fruit.getName() + ": " + fruit.getWeight() + "kg");

        Grape grape = new Grape();
        grape.setType("bor szöllő");
        grape.setName("Irsai Oliver");
        grape.setWeight(0.43);
        System.out.println(grape.getName() + " - " + grape.getType() +
                ": " +grape.getWeight() + "kg");

        Apple apple = new Apple();
        apple.setName("Idared");
        apple.setWeight(0.21);
        apple.setPieces(3);
        System.out.println(apple.getName() + ": " + apple.getWeight() +
                "kg * " + apple.getPieces());

        GoldenDelicious goldenDelicious = new GoldenDelicious();
        goldenDelicious.setName("nyírségi");
        goldenDelicious.setWeight(0.18);
        goldenDelicious.setPieces(5);
        System.out.println(goldenDelicious.getColour() + " " +
                goldenDelicious.getName() + ": " + goldenDelicious.getWeight() +
                "kg * " + goldenDelicious.getPieces());

        Starking starking = new Starking();
        starking.setName("szabolcsi");
        starking.setWeight(0.23);
        starking.setPieces(2);
        System.out.println(starking.getColour() + " " + starking.getName() +
                ": " + starking.getWeight() + "kg * " + starking.getPieces());
    }
}
