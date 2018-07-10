import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Frame6{
 static JTextField t1;
 JFrame f;

public Frame6()
{
	String xvalue="X";
	String zerovalue="0";
	
	f=new JFrame("Text Evaluation");
	t1=new JTextField();
	f.setLayout(new GridLayout());
	f.add(t1);
	t1.addKeyListener(new KeyAdapter() {
	      public void keyReleased(KeyEvent e) {
	         JTextField text=(JTextField) e.getSource();
	         String text1 = text.getText();
	         if(text1.equals(xvalue) || text1.equals(zerovalue))
	         {
	        	 System.out.println("Text entered correctly");
	         }
	         else
	        	 System.out.println("Text is not proper");
	    	  
	    	  
	        }
	      });
	    
	
	
	f.setSize(400, 200);
	f.setVisible(true);
		
}






public static void main(String args[])
{
	Frame6 gui=new Frame6();
	
}



}

