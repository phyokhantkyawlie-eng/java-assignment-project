package librarysystem;

public class Magazine extends LibraryItem {

    String issueNumber;

    public Magazine(String code, String title, String issueNumber) {
        super(code, title);
        this.issueNumber = issueNumber;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "\nIssue Number: " + issueNumber;
    }
}