import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonHandler implements ActionListener {
	private JFrame f;
	private JButton b1;

	public void actionPerformed(ActionEvent e) {
	/*	f=new JFrame("Key Pressed");
		f.setLayout(new BorderLayout());
		b1=new JButton("HI");
		f.add(b1);
		f.setSize(400, 200);
		f.setVisible(true);*/
		System.out.println("Buttons command is:" +e.getActionCommand());
		
	}

}
