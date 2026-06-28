package age_exception;

public class Student {
	private String name;
	private int age;
	private String address;
	private String subject;
	public Student(String name, int age, String address, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.subject = subject;
	}
	
	public void showData() {
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Subject: " + subject);
	}

}
