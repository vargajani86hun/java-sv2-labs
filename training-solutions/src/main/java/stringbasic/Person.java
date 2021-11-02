package stringbasic;

public class Person {
    private String name;
    private String email;
    private String socialSecurtiyNumber;
    private String bancAccountNumber;
    private String telephonNumber;

    public Person(String name, String email, String socialSecurtiyNumber, String bancAccountNumber, String telephonNumber) {
        this.name = name;
        this.email = email;
        this.socialSecurtiyNumber = socialSecurtiyNumber;
        this.bancAccountNumber = bancAccountNumber;
        this.telephonNumber = telephonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialSecurtiyNumber() {
        return socialSecurtiyNumber;
    }

    public void setSocialSecurtiyNumber(String socialSecurtiyNumber) {
        this.socialSecurtiyNumber = socialSecurtiyNumber;
    }

    public String getBancAccountNumber() {
        return bancAccountNumber;
    }

    public void setBancAccountNumber(String bancAccountNumber) {
        this.bancAccountNumber = bancAccountNumber;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }

    public void setTelephonNumber(String telephonNumber) {
        this.telephonNumber = telephonNumber;
    }
}
