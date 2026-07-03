package question5;

import java.util.Scanner;

public class OnlineShopSystem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Address address = new Address("Bangkok", "Thailand");
		Customer customer = new Customer("phyo", "1234", "C001", "Phyo", "0999999999", address);

		Shop shop = new Shop(customer, 100, 100);

		System.out.println("===== Online Shop Management System =====");

		boolean loggedIn = false;

		while (!loggedIn) {
			try {
				System.out.print("Enter username: ");
				String username = input.nextLine();

				System.out.print("Enter password: ");
				String password = input.nextLine();

				if (shop.login(username, password)) {
					System.out.println("Login successful.");
					loggedIn = true;
				} else {
					throw new InvalidLoginException("Invalid username or password.");
				}

			} catch (InvalidLoginException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}

		int choice = 0;

		while (choice != 8) {

			try {
				System.out.println();
				System.out.println("===== Shop Menu =====");
				System.out.println("1. Show Customer Info");
				System.out.println("2. Add Product");
				System.out.println("3. Show All Products");
				System.out.println("4. Search Product");
				System.out.println("5. Place Order");
				System.out.println("6. Update Product Stock");
				System.out.println("7. Show Order History");
				System.out.println("8. Exit");
				System.out.print("Choose: ");

				choice = Integer.parseInt(input.nextLine());

				if (choice == 1) {

					shop.showCustomerInfo();

				} else if (choice == 2) {

					System.out.print("Enter Product ID: ");
					String productID = input.nextLine();

					System.out.print("Enter Product Name: ");
					String productName = input.nextLine();

					System.out.print("Enter Product Category: ");
					String category = input.nextLine();

					System.out.print("Enter Price: ");
					double price = Double.parseDouble(input.nextLine());

					System.out.print("Enter Stock: ");
					int stock = Integer.parseInt(input.nextLine());

					Product product = new Product(productID, productName, category, price, stock);
					shop.addProduct(product);

				} else if (choice == 3) {

					shop.showAllProduct();

				} else if (choice == 4) {

					System.out.print("Enter Product ID to search: ");
					String productID = input.nextLine();

					Product product = shop.searchProduct(productID);
					product.showProductInfo();

				} else if (choice == 5) {

					System.out.print("Enter Order ID: ");
					String orderID = input.nextLine();

					System.out.print("Enter Product ID: ");
					String productID = input.nextLine();

					System.out.print("Enter Quantity: ");
					int quantity = Integer.parseInt(input.nextLine());

					System.out.println("Choose Payment Type:");
					System.out.println("1. CASH");
					System.out.println("2. BANKING");
					System.out.println("3. SCAN_MOBILE");
					System.out.print("Choose: ");
					int paymentChoice = Integer.parseInt(input.nextLine());

					PaymentType paymentType;

					if (paymentChoice == 1) {
						paymentType = PaymentType.CASH;
					} else if (paymentChoice == 2) {
						paymentType = PaymentType.BANKING;
					} else if (paymentChoice == 3) {
						paymentType = PaymentType.SCAN_MOBILE;
					} else {
						throw new InvalidPaymentException("Invalid payment type.");
					}

					shop.placeOrder(orderID, productID, quantity, paymentType);

				} else if (choice == 6) {

					System.out.print("Enter Product ID: ");
					String productID = input.nextLine();

					Product product = shop.searchProduct(productID);

					System.out.print("Enter stock quantity to add: ");
					int quantity = Integer.parseInt(input.nextLine());

					product.addStock(quantity);

					System.out.println("Stock updated successfully.");

				} else if (choice == 7) {

					shop.showOrderHistory();

				} else if (choice == 8) {

					System.out.println("Exit system. Thank you.");

				} else {

					System.out.println("Invalid choice. Please choose again.");

				}

			} catch (ProductNotFoundException e) {
				System.out.println("Error: " + e.getMessage());

			} catch (OutOfStockException e) {
				System.out.println("Error: " + e.getMessage());

			} catch (InvalidPaymentException e) {
				System.out.println("Error: " + e.getMessage());

			} catch (NumberFormatException e) {
				System.out.println("Error: Please enter number only.");
			}
		}

		input.close();
	}
}