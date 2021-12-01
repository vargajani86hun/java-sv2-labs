package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        new NameValidator().isValidName(name);
        this.name = name;
        this.position = new Position(0,0);
    }

    public void changePosition(Position target) {
        if (new PositionValidator().isValidPosition(target)) {
            position = target;
        }
    }

    public double distanceFrom(Position target) {
        new PositionValidator().isValidPosition(target);
        return this.position.distanceFrom(target);
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
}
