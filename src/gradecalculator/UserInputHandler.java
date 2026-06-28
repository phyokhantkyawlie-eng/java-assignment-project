package gradecalculator;

import java.util.Scanner;

public class UserInputHandler {

    private Scanner scanner;

    public UserInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public StudentData gatherStudentData() {

        System.out.println("Simple Grade Calculator");

        String name = getValidNameInput();

        double assignmentScore = getValidScoreInput("Enter Assignment Score (0 - 30): ", 30);

        double midtermScore = getValidScoreInput("Enter Midterm Score (0 - 30): ", 30);

        double finalScore = getValidScoreInput("Enter Final Score (0 - 40): ", 40);

        return new StudentData(name, assignmentScore, midtermScore, finalScore);
    }

    private String getValidNameInput() {

        String name;

        while (true) {
            System.out.println("Enter Student Name: ");
            name = scanner.nextLine().trim();

            if (!name.isEmpty()) {
                break;
            }

            System.out.println("Invalid name. Name cannot be empty.");
        }

        return name;
    }

    private double getValidScoreInput(String prompt, double maxScore) {

        double score;

        while (true) {
            System.out.println(prompt);

            if (scanner.hasNextDouble()) {
                score = scanner.nextDouble();
                scanner.nextLine();

                if (score >= 0 && score <= maxScore) {
                    break;
                } else {
                    System.out.println("Invalid score. Please enter score between 0 and " + maxScore);
                }

            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        return score;
    }

    public void closeScanner() {
        scanner.close();
    }
}