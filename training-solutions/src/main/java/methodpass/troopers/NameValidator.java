package methodpass.troopers;

public class NameValidator {
    public boolean isValidName(String name) {
        if (name == null || "".equals(name.trim())) {
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        return true;
    }
}
