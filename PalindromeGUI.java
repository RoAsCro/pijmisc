import java.awt.*;
import javax.swing.*;

public class PalindromeGUI {
	private JLabel label = new JLabel("Input a string of text");
	private JLabel returnLabel = new JLabel("");
	private JTextField text = new JTextField(20);
	private JButton button = new JButton("CHECK!");
	private JLabel timeTaken = new JLabel("");
	
	public PalindromeGUI() {
		JFrame frame = new JFrame("Palindrome Checker");
		frame.setLayout(new FlowLayout());
		frame.setSize(400,400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(label);
		frame.add(text);
		frame.add(button);
		frame.add(returnLabel);
		frame.add(timeTaken);
		
		//button.addActionListener(a -> returnLabel.setText(palindrome(text.getText())));
		
		button.addActionListener(a -> returnLabel.setText(iternacci(text.getText())));
	
		frame.setVisible(true);
		
	}
	
	public String palindrome(String input) {
		boolean isPalindrome = true;
		for (int i = 0; i < input.length() / 2; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) 
				isPalindrome = false;
		}
		if (isPalindrome) 
			return "This is a palindrome";
		return "This is not a palindrome";
	}

	public String iternacci(String n) {
		long startTime = System.nanoTime();
		System.out.println(n);
		int x = Integer.parseInt(text.getText());
		int m = 0,
				result = 0,
				store = 1;
		if (x == 0) {
			return "0";
		}
		while (m != x) {
			m++;
			result = result + store;
			store = result - store;
		}
		long endTime = System.nanoTime();
		timeTaken.setText("" + (endTime - startTime));
		return "" + result;
	}
	
	
	public static void main(String args[]) {
		PalindromeGUI p = new PalindromeGUI();
	}
	
}
