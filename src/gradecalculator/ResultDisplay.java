package gradecalculator;

public class ResultDisplay {

    public void displayResult(StudentData studentData, double totalScore, String grade) {

        System.out.println("------------------------------");
        System.out.println("Student Name: " + studentData.getName());
        System.out.printf("Total Score: %.2f\n", totalScore);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------------");
    }
}