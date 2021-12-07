package inheritanceattributes.building;

public class BuildingMain {
    public static void main(String[] args) {
        Building building = new Building("Office", 1240, 8);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Elementary",
                1852.5, 3, 33);
        System.out.println(building.name + ": " + building.area +
                "m2, " + building.getFloors() + " floors");

        System.out.println(schoolBuilding.name + " school: " +
                schoolBuilding.area + "m2, " + schoolBuilding.getFloors() +
                " floors, " + schoolBuilding.getNumberOfClassRooms() +
                " classes");
    }
}
