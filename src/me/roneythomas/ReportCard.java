package me.roneythomas;

public class ReportCard {
    private final String studentName;
    private String englishGrade;
    private String scienceGrade;
    private String mathGrade;

    public ReportCard(String studentName, String englishGrade, String scienceGrade, String mathGrade) {
        this.studentName = studentName;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        this.mathGrade = mathGrade;
    }

    public String getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        this.englishGrade = englishGrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(String scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public String getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(String mathGrade) {
        this.mathGrade = mathGrade;
    }

    @Override
    public String toString() {
        return getStudentName() + "\n" +
                "English Grade  " + getEnglishGrade() + "\n" +
                "Science Grade  " + getScienceGrade() + "\n" +
                "Math Grade     " + getMathGrade() + "\n";
    }
}
