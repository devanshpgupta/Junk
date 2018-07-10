import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class KeyAdapter{
	JFrame f;
	 String xvalue="X";
	 String zerovalue="0";
	 JButton b1;
	 JLabel l1;
	 public void keyReleased(KeyEvent e)
		{
			f=new JFrame("Text Box Evaluation");
			f.setLayout(new FlowLayout());
			JTextField text=(JTextField) e.getSource();
	        String text1 = text.getText();
	         if(text1.equals(xvalue) || text1.equals(zerovalue))
	         {
	        	 l1=new JLabel("Text entered correctly");
	        	 f.add(l1);
	        	 f.setSize(200, 100);
	        	 f.setVisible(true);
	         }
	         else
	         { 
	        	 l1=new JLabel("Text not entered correctly");
	        	 f.add(l1);
	        	 f.setSize(100, 100);
	        	 f.setVisible(true);
	        	 }
			    	  }
	public void keyTyped(KeyEvent e) {
	}
	public void keyPressed(KeyEvent e) {
	}
	
}
