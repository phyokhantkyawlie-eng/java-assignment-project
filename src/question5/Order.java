package question5;

import javax.swing.plaf.metal.MetalBorders.ToolBarBorder;

public class Order {
	
	private String orderId;
	
	private Customer customer;
	
	private Product product;
	
	private Payment payment;
	
	private int quantity;
	
	private OrderStatus orderStatus;
	
	private double totalPrice;

	public Order(String orderId, Customer customer, Product product, Payment payment, int quantity) {
		this.orderId = orderId;
		this.customer = customer;
		this.product = product;
		this.payment = payment;
		this.quantity = quantity;
		this.orderStatus = OrderStatus.COMPLETE;
		this.totalPrice = product.getPrice() * quantity;
	}

	
	public void showOrderInfo() {
		
		System.out.println("Order ID :"+orderId);
		System.out.println("Customer ID : "+customer.getCustomerID());
		System.out.println("Quantity :" + quantity);
		System.out.println("Total :" + totalPrice);
		System.out.println("Order Status: "+orderStatus);
		
		payment.showPaymentInfo();
		System.out.println("------------------------");
	}
	
	
	
	

}