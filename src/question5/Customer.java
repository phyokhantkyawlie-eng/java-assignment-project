package question5;

public class Customer extends User{

	private String customerID;
	
	private String name;
	
	private String phone;
	
	private Address address;

	public Customer(String username, String password, String customerID, String name, String phone, Address address) {
		super(username, password);
		this.customerID = customerID;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getCustomerID() {
		return customerID;
	}

	
	@Override
	public void showInfo() {
		System.out.println("Customer ID: "+customerID);
		System.out.println("Name "+name);

		System.out.println("Phone "+phone);
		System.out.println("City "+ address.getCity());
		
		System.out.println("Country : "+address.getCountry());
	}
	
	
	

	

}