package question4;

import java.util.Scanner;

public class LibrarySystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Library library = new Library(200, 200);
		
		int choice = 0;
		
		while (choice != 7) {
			
			try {
			System.out.println("====Library Menu====");
			System.out.println("1. Add Book");
			System.out.println("2. Add Member");
			System.out.println("3. Show All Books");
			System.out.println("4. Show All Members");
			System.out.println("5. Borrow Book");
			System.out.println("6. Return Book");
			System.out.println("7. Exit");
			System.out.println("Choose: ");
			
			choice = Integer.parseInt(input.nextLine());
			
			if (choice == 1) {
				System.out.println("Enter Book ID: ");
				int bookId = Integer.parseInt(input.nextLine());
				
				System.out.println("Enter Title: ");
				String title = input.nextLine();
				
				System.out.println("Enter Author: ");
				String author = input.nextLine();
				
				Book book = new Book(bookId, title, author);
				library.addBook(book);
				
			} else if (choice == 2) {
				System.out.println("Enter Member ID: ");
				int memberId = Integer.parseInt(input.nextLine());
				
				System.out.println("Enter Name: ");
				String name = input.nextLine();
				
				System.out.println("Enter Phone Number: ");
				int phone = Integer.parseInt(input.nextLine());
				
				System.out.println("Enter City: ");
				String city = input.nextLine();
				
				System.out.println("Enter Street: ");
				String street = input.nextLine();
				
				System.out.println("Enter Membership Type: ");
				String typeText = input.nextLine().toUpperCase();
				
				Address address = new Address(city, street);
				MembershipType type = MembershipType.valueOf(typeText);
				
				Member member = new Member(name, phone, memberId, type, address);
				library.addMember(member);
				
			
				
			} else if (choice == 3) {
				library.showAllBooks();
				
			} else if (choice == 4) {
				library.showAllMember();
				
			} else if (choice == 5) {
				System.out.println("Enter Book ID: ");
				int bookId = Integer.parseInt(input.nextLine());
				
				System.out.println("Enter Member ID: ");
				int memberId = Integer.parseInt(input.nextLine());
				
				library.borrowBook(bookId, memberId);
				
			} else if (choice == 6) {
				System.out.println("Enter Book ID: ");
				int bookId = Integer.parseInt(input.nextLine());
				
				library.returnBook(bookId);
				
			} else if (choice == 7) {
				System.out.println("Goodbye. ");
			} else {
				System.out.println("Wrong Choice");
			}
			
			} catch (BookNotFoundException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (BookNotAvaliableException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (IllegalArgumentException e) {
				System.out.println("Error: Membership type must be BASIC or PREMIUM" );
			} catch (Exception e) {
				System.out.println("Error: Invalid input.");
			}
		}
		
		input.close();

		}

}
