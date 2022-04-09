package covid;

public class Citizen {
    private String citizenName;
    private String zipCode;
    private int age;
    private String email;
    private String socialSecurityNumber;

    public Citizen(String citizenName, String zipCode, int age, String email, String socialSecurityNumber) {
        validateName(citizenName);
        this.citizenName = citizenName;
        validateZipCode(zipCode);
        this.zipCode = zipCode;
        validateAge(age);
        this.age = age;
        validateEmail(email);
        this.email = email;
        validateSocialSecurityNumber(socialSecurityNumber);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    private void validateName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name must not be empty!");
    }

    private void validateZipCode(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) throw new IllegalArgumentException("Zip code must not be empty!");
    }

    private void validateAge(int age) {
        if (age < 10) throw new IllegalArgumentException("You are too young to register for vaccination!");
        else if (age > 150) throw new IllegalArgumentException("You are too old to register for vaccination!");
    }

    private void validateEmail(String email) {
        if (email == null || email.isEmpty()) throw new IllegalArgumentException("E-mail address must not be empty!");
        if (email.length() < 3) throw new IllegalArgumentException("It's too short to be valid e-mail address");
        if (email.indexOf('@') < 1) throw new IllegalArgumentException("E-mail address should contain '@' character!");
        if (email.lastIndexOf('.') < email.indexOf('@')) throw new IllegalArgumentException("E-mail address should contain a domain at its end.");
    }

    private void validateSocialSecurityNumber(String SSN) {
        if (SSN == null || SSN.isEmpty() || SSN.length() != 9) throw new IllegalArgumentException("Social Security Number must not be empty!");
        int CDV = Character.getNumericValue(SSN.charAt(8));
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 1) {
                sum += Character.getNumericValue(SSN.charAt(i)) * 7;
            } else {
                sum += Character.getNumericValue(SSN.charAt(i)) * 3;
            }
        }
        if (CDV != sum % 10) throw new IllegalArgumentException("Social Security Number is not valid!");
    }
}
