package question4;

public class Address {
	private String city;
	private String street;
	
	public Address(String city, String street) {
		this.city = city;
		this.street = street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getStreet() {
		return street;
	}
	
	public void showAddress() {
		System.out.println("City: " + city);
		System.out.println("Street: "+ street);
	}
	

}
