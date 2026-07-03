package question4;

public class Library {
	private Book[] books;
	private Member[] members;
	
	private int bookCount = 0;
	private int memberCount = 0;
	
	public Library(int bookSize, int memberSize) {
		books = new Book[bookSize];
		members = new Member[memberSize];
	}
	
	public void addBook(Book book) {
		if(bookCount < books.length) {
			books[bookCount] = book;
			bookCount++;
			System.out.println("Book added.");
		} else 
			System.out.println("Book Storage is full. ");
		
	}
	
	public void addMember(Member member) {
		if(memberCount < members.length) {
			members[memberCount] = member;
			memberCount++;
			System.out.println("Member added. ");
		} else
			System.out.println("Member Storage is full");
		
		members[memberCount] = member;
		memberCount++;
		System.out.println("Member added.");
	}
	
	public void showAllBooks() {
		for (int i = 0; i < bookCount; i++) {
			books[i].showBook();
		}
	}
	
	public void showAllMember() {
		for (int i = 0; i < memberCount; i++) {
			members[i].showInfo();
		}
	}
	
	public void borrowBook(int bookId) throws BookNotFoundException, BookNotAvaliableException {
	    for (int i = 0; i < bookCount; i++) {
	        if (books[i].getBookId() == bookId) {

	            if (books[i].getStatus() == BookStatus.BORROWED) {
	                throw new BookNotAvaliableException("Book is already borrowed.");
	            }

	            books[i].setStatus(BookStatus.BORROWED);
	            System.out.println("Book borrowed.");
	            return;
	        }
	    }

	    throw new BookNotFoundException("Book not found.");
	}
	
	public void borrowBook(int bookId, int memberId) throws BookNotFoundException, BookNotAvaliableException {
	    borrowBook(bookId);
	    System.out.println("Member ID: " + memberId);
	}
	
	public void returnBook(int bookId) throws BookNotFoundException {
	    for (int i = 0; i < bookCount; i++) {
	        if (books[i].getBookId() == bookId) {
	            books[i].setStatus(BookStatus.AVALIABLE);
	            System.out.println("Book returned.");
	            return;
	        }
	    }

	    throw new BookNotFoundException("Book not found.");
	}
		
}


