import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import xn0;


public class TextHandler implements ActionListener{

	private JButton b1;
	private JFrame f;
	public void actionPerformed(ActionEvent e) {
		/*b1=new JButton("Either enter X or 0");
		f=new JFrame("Pop Up Window");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.setSize(400, 200);
		f.setVisible(true);		*/
		String text=e.getActionCommand();
		
		
	//	System.out.println("Text entered is " +text);
		System.out.println("Text in e.getActionCommand() is " +text);
	/*	String x;
		String zero;
		if(comp=='X'||comp=='0')
		{
			System.out.println("Text entered correctly");
		}
		*/
	}
	
}
