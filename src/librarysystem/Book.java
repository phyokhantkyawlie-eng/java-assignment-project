package librarysystem;

public class Book extends LibraryItem {

    String author;

    public Book(String code, String title, String author) {
        super(code, title);
        this.author = author;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + "\nAuthor: " + author;
    }
}