package question5;

public class User {
	
	
	private String username;
	private String password;
	
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	
	public boolean login(String loginUsr, String loginPassword ) {
		
		return username.equals(loginUsr) && password.equals(loginPassword);
	}
	
	public void showInfo() {
		
		System.out.println("Username: "+username);
	}
	
	
	

}