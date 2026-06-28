package gradecalculator;

public class GradeServiceImpl implements GradeService {

    @Override
    public double calculateTotal(StudentData studentData) {

        double totalScore;

        totalScore = studentData.getAssignmentScore()
                + studentData.getMidtermScore()
                + studentData.getFinalScore();

        return totalScore;
    }

    @Override
    public String calculateGrade(double totalScore) {

        String grade;

        if (totalScore >= 80) {
            grade = "A";
        } else if (totalScore >= 70) {
            grade = "B";
        } else if (totalScore >= 60) {
            grade = "C";
        } else if (totalScore >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        return grade;
    }
}