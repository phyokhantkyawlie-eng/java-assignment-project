package librarysystem;

public class DVD extends LibraryItem {

    String duration;

    public DVD(String code, String title, String duration) {
        super(code, title);
        this.duration = duration;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "\nDuration: " + duration + " minutes";
    }
}