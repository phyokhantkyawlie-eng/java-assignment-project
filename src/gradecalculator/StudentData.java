package gradecalculator;

public class StudentData {

    private String name;
    private double assignmentScore;
    private double midtermScore;
    private double finalScore;

    public StudentData(String name, double assignmentScore, double midtermScore, double finalScore) {
        this.name = name;
        this.assignmentScore = assignmentScore;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public double getAssignmentScore() {
        return assignmentScore;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }
}