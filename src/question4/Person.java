package question4;

public class Person {
	private String name;
	private int phoneNumber;
	
	public Person(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showInfo() {
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phoneNumber);
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	

}
