package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {
    private String address;
    private int area;
    private int levels;

    public Building(String address, int area, int levels) {
        this.address = address;
        this.area = area;
        this.levels = levels;
    }

    public String getAddress() {
        return address;
    }

    public int getArea() {
        return area;
    }

    public int getLevels() {
        return levels;
    }

    @Override
    public int compareTo(Building o) {
        return this.levels - o.levels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;
        Building building = (Building) o;
        return this.levels == building.levels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(levels);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", levels=" + levels +
                "}\n";
    }

    public static void main(String[] args) {
        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Alkotmány út 1.", 142, 3));
        buildings.add(new Building("Egyetem tér 3.", 372, 6));
        buildings.add(new Building("Veres utca 17.", 227, 4));
        buildings.add(new Building("Alma út 33.", 115, 2));
        buildings.add(new Building("Petőfi tér 7.", 1129, 10));
        buildings.add(new Building("Homok köz 10.", 182, 1));

        System.out.println(buildings);
    }
}
