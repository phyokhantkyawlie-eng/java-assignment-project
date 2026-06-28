package gradecalculator;

public interface GradeService {

    double calculateTotal(StudentData studentData);

    String calculateGrade(double totalScore);
}