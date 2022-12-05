import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;


public class SwingFC {
	
	JTextField jtfFirst;
	JTextField jtfSecond;

	JButton jbtnComp;
	
	JLabel jlabFirst;
	JLabel jlabSecond;
	JLabel jlabResult;
	
	public SwingFC() {
		JFrame jfrm = new JFrame("Compare Files");
		
		jfrm.setLayout(new FlowLayout());
		
		jfrm.setSize(200,190);
		
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jtfFirst = new JTextField(14);
		jtfSecond = new JTextField(14);
		
		jtfFirst.setActionCommand("fileA");
		jtfSecond.setActionCommand("fileB");
		
		jbtnComp = new JButton("Compare");
		
		jbtnComp.addActionListener(a -> jlabResult.setText(Comparator.compare(jtfFirst.getText(), jtfSecond.getText())));
		
		jlabFirst = new JLabel("First File: ");
		jlabSecond = new JLabel("Second File: ");
		jlabResult = new JLabel("");
		
		jfrm.add(jlabFirst);
		jfrm.add(jlabSecond);
		jfrm.add(jtfFirst);
		jfrm.add(jtfSecond);
		jfrm.add(jlabResult);
		jfrm.add(jbtnComp);
		
		jfrm.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingFC swing = new SwingFC();
		
	}

	
	
}
