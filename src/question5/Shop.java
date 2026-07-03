package question5;

public class Shop {
	
	private Customer customer;
	
	private Product[] products;
	
	private Order[] orders;
	
	private int productCount = 0 ;
	
	private int orderCount = 0;
	
	public Shop(Customer customer , int productSize , int orderSize) {
		
		this.customer = customer;
		
		products = new Product[productSize];
		
		orders = new Order[orderSize];
	}
	
	
	public boolean login(String username , String password) {
		
		return customer.login(username, password);
	}
	
	public void addProduct(Product product) {
		if (productCount < products.length) {
			products[productCount] = product;
			productCount++;
			
			System.out.println("Product Add Success.");
			
		}else {
			System.out.println("Product Storage is full");
		}
	}
	
	public void showAllProduct() {
		
		for (Product product : products) {
			if(product != null ) {
				product.showProductInfo();
			}
		}
		
	}
	
	public Product searchProduct(String prodcutID) throws ProductNotFoundException{
		
		for (Product product : products) {
			if (product != null && product.getProductID().equals(prodcutID)) {
				return product;
			}
		}
		
		throw new ProductNotFoundException("Product is not found.");
		
		
	}
	
	public void placeOrder(String orderID , String productID , int quantity,PaymentType paymentType ) throws ProductNotFoundException , OutOfStockException, InvalidPaymentException{
		
		
		Product product = searchProduct(productID);
		
		product.reduceStock(quantity);
		
		double total = product.getPrice() * quantity;
		
		Payment payment = new Payment(paymentType, total);
		
		
		if (orderCount < orders.length) {
			orders[orderCount] = new Order(orderID, customer, product ,payment,quantity);
			
			orderCount++;
			
			System.out.println("Order Placed Successfully");
  		}else {
  			System.out.println("Order is Full.");
  		}
	}
	
	
	public void showOrderHistory() {
		for(Order order : orders) {
			if(order != null ) {
			order.showOrderInfo();
			}
		}
	}
	
	public void showCustomerInfo() {
		User user = customer;
		user.showInfo();
	}

}