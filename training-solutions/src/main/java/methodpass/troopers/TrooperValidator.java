package methodpass.troopers;

public class TrooperValidator {
    public boolean isValidTrooper(Trooper trooper) {
        if (trooper == null) {
            throw new IllegalArgumentException("Trooper cannot be null!");
        }
        return true;
    }
}
