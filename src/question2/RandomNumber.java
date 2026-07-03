package question2;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomNumber {
	
	public static void main(String[] args) {
		
		int min = Integer.parseInt(JOptionPane.showInputDialog("Enter minimum number:"));
		
		int max = Integer.parseInt(JOptionPane.showInputDialog("Enter maximun number:"));
		
		Random random = new Random();
		
		int range = max - min + 1;
		int number = random.nextInt(range) + min;
		
		JOptionPane.showMessageDialog(null, "Random Number: "+ number);
	}
	

}
