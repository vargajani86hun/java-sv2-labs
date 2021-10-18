package stringtype.registration;

public class UserValidator {
    public static boolean isValidUsername(String username) {
        return username.length() != 0;
    }

    public static boolean isValidPassword(String password1, String password2) {
        return password1.equals(password2) && password1.length() >= 8;
    }

    public static boolean isValidEmail(String email) {
        return email.indexOf("@") > 0 &&
                email.indexOf(".", email.indexOf("@")) > 0 &&
                email.indexOf(".", email.indexOf("@")) > 1 + email.indexOf("@") &&
                email.indexOf(".", email.indexOf("@")) < email.length() - 2;
    }
}
