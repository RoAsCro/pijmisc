import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo implements ActionListener {
	
	JLabel jlab = new JLabel(" GUI programming with Swing.");
	JTextField text = new JTextField(10);

	
	SwingDemo() {
		JFrame jfrm = new JFrame("A Simple Swing Application");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(400, 250);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton but = new JButton("CLICK ME");
		JButton butt = new JButton("No, CLICK ME!");
		
		but.addActionListener(this);
		butt.addActionListener(this);
		
		//JLabel jlab = new JLabel(" GUI programming with Swing.");
		jfrm.add(jlab);
		jfrm.add(but);
		jfrm.add(butt);
		
		
		jfrm.setVisible(true);
		
		
		jfrm.add(text);
		text.setActionCommand("g");
		text.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		//System.out.print("g");
		if (ae.getActionCommand().equals("CLICK ME")) 
			jlab.setText("You went and clicked it");
		else if (ae.getActionCommand().equals("No, CLICK ME!"))
			jlab.setText("Ohhh, you went and clicked that");
		else if (ae.getActionCommand().equals("g"))
			jlab.setText(text.getText());
			
	}
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new SwingDemo();
			}
		});
	}
}
