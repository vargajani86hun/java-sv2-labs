package enumtype.solarsystem;

public enum SolarSystem {
    MERCURY(0), VENUS(0), EARTH(1), MARS(2),
    JUPITER(63), SATURNUS(62), URANUS(27),
    NEPTUNUS(13), PLUTO(5);

    private final int value;

    SolarSystem(int value) {
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
