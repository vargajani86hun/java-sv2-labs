package methodpass.troopers;

public class PositionValidator {
    public boolean isValidPosition(Position target) {
        if (target == null) {
            throw new IllegalArgumentException("Position cannot be null!");
        }
        return true;
    }
}
