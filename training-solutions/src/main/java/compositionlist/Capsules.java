package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> colors = new ArrayList<>();

    public void addLast(String color) {
        colors.add(color);
    }

    public void addFirst(String color) {
        colors.add(0, color);
    }

    public String removeFirst() {
        return colors.remove(0);
    }

    public String removeLast() {
        return colors.remove(colors.size()-1);
    }

    public List<String> getColors() {
        return colors;
    }

    public static void main(String[] args) {
        Capsules capsules = new Capsules();
        capsules.addLast("red");
        capsules.addLast("blue");
        capsules.addLast("red");
        capsules.addFirst("white");
        capsules.addLast("white");
        capsules.addFirst("green");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeFirst();
        capsules.removeLast();
        System.out.println(capsules.getColors());
    }
}
