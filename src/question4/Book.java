package question4;

public class Book {
	private int bookId;
	private String title;
	private String author;
	private BookStatus status;
	
	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.status = BookStatus.AVALIABLE;
	}
	
	public int getBookId() {
		return bookId;
	}
	
	public BookStatus getStatus() {
		return status;
	}
	
	public void setStatus(BookStatus status) {
		this.status = status;
	}
	
	public void showBook() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: "+ title);
		System.out.println("Author: "+ author);
		System.out.println("Status: "+ status);
	}
	
	

}
