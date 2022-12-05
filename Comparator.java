import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Comparator implements ActionListener{

	
	
	public void actionPerformed(ActionEvent ae) {
		System.out.println("Fuck");
	}
	
	public static String compare(String first, String second) {
		if (first.equals("")) {
			return "First file name missing";
		}
		
		if (second.equals("")) {
			return "Second file name missing";
		}
		
		if (first.equals(second)) return "equal";
		
		return "Not equal";
	}
	
}
