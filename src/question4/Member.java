package question4;

public class Member extends Person{
	private int memberId;
	private MembershipType membershipType;
	private Address address;
	
	public Member(String name, int phoneNumber, int memberId, MembershipType membershipType, Address address) {
		super(name, phoneNumber);
		this.memberId = memberId;
		this.address = address;
		this.membershipType = membershipType;
		
	}
	
	public int getMemberID() {
		return memberId;
	}
	
	public void showInfo() {
		System.out.println("Member ID: " + memberId);
		super.showInfo();
		address.showAddress();
		System.out.println("Type of membership "+ membershipType);
	}

}
