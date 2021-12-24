package schoolrecords;

public class StudyResultByName {
    private String studentName;
    private double studentAverage;

    public StudyResultByName(String studentName, double studentAverage) {
        this.studentName = studentName;
        this.studentAverage = studentAverage;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudyAverage() {
        return studentAverage;
    }
}
