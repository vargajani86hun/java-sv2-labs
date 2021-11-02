package stringbasic;

public class Student {
    private Person selfData;
    private String neptunCode;
    private String educationalIdentifier;
    private String entranceCard;

    public Student(Person selfData, String neptunCode, String educationalIdentifier) {
        this.selfData = selfData;
        this.neptunCode = neptunCode;
        this.educationalIdentifier = educationalIdentifier;
    }

    public Person getSelfData() {
        return selfData;
    }

    public void setSelfData(Person selfData) {
        this.selfData = selfData;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEducationalIdentifier() {
        return educationalIdentifier;
    }

    public void setEducationalIdentifier(String educationalIdentifier) {
        this.educationalIdentifier = educationalIdentifier;
    }

    public String getEntranceCard() {
        return entranceCard;
    }

    public void setEntranceCard(String entranceCard) {
        this.entranceCard = entranceCard;
    }
}
