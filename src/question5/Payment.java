package question5;

public class Payment {
	
	
	private PaymentType paymentType;
	
	private  PaymentStatus paymentStatus;
	
	private double amount;

	public Payment(PaymentType paymentType, double amount)throws InvalidPaymentException {
	
		
		if(amount <= 0 ) {
			throw new InvalidPaymentException(" {Payment is less than zero amount please purchase it} ");
		}
		this.paymentType = paymentType;
		this.amount = amount;
		this.paymentStatus = PaymentStatus.PAID;
	}
	
	public void showPaymentInfo() {
		System.out.println("Payment Type "+paymentType);
		System.out.println("Payment Status "+paymentStatus);
		System.out.println("Amount "+amount);
	}
	
	
	

}