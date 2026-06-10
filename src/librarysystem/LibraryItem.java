package librarysystem;

public class LibraryItem {

    String code;
    String title;

    public LibraryItem() {

    }

    public LibraryItem(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String showInfo() {
        return "Code: " + code + "\nTitle: " + title;
    }
}