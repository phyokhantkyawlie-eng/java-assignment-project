package gradecalculator;

public class MainApp {

    public static void main(String[] args) {

        UserInputHandler inputHandler = new UserInputHandler();

        GradeService gradeService = new GradeServiceImpl();

        ResultDisplay resultDisplay = new ResultDisplay();

        StudentData studentData = inputHandler.gatherStudentData();

        double totalScore = gradeService.calculateTotal(studentData);

        String grade = gradeService.calculateGrade(totalScore);

        resultDisplay.displayResult(studentData, totalScore, grade);

        inputHandler.closeScanner();
    }
}