package methodpass.troopers;

public class Position {
    private final double posX, posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position position) {
        new PositionValidator().isValidPosition(position);
        double distX = this.posX-position.posX;
        double distY = this.posY-position.posY;
        return Math.sqrt((distX * distX) + (distY * distY));
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }
}
