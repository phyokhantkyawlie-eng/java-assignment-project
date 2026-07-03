package question3;

public class FermatNumbers {
	
	public static void main(String[] args) {
		int power = 1;
		
		for (int n = 0; n < 5; n++) {
			
			int fermat = 1;
			for (int i = 0; i < power; i++) {
				fermat = fermat * 2;
			}
			
			fermat = fermat + 1;
			
			System.out.println(fermat);
			
			power = power * 2;
			
		}
	}

}
