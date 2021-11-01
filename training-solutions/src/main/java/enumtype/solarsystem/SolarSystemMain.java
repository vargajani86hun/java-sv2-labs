package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        SolarSystem[] planets = SolarSystem.values();
        for (SolarSystem planet : planets) {
            System.out.println(planet.name() + " holdjainak száma: " + planet.getValue());
        }
    }
}
