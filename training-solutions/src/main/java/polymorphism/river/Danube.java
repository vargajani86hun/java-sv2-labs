package polymorphism.river;

import java.util.ArrayList;
import java.util.List;

public class Danube extends River {
    private List<String> capitals ;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        String[] capitals = {"Wien", "Bratislava", "Budapest", "Belgrade"};
        Water water = new Danube("Duna", 2850, List.of(capitals));
        River river = new Danube("Duna", 2850, List.of(capitals));
        Danube danube = new Danube("Duna", 2850, List.of(capitals));
        System.out.println(water.equals(river));
        System.out.println(water.equals(danube));
        System.out.println(water);
        System.out.println("A " + river.getName() + " folyó teljes hossza: " + river.getLength() + "km");
        System.out.println(river.equals(danube));
        System.out.println(river);
        System.out.println("A " + danube.getName() + " által érintett fővárosok: " + danube.getCapitals() +
                ", hossza: " + danube.getLength() + "km");
        System.out.println(danube);
    }
}
