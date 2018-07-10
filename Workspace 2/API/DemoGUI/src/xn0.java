import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class xn0 {
 static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
 JFrame f;
 JButton b1;
 String xvalue="X";
 String zerovalue="0";

public xn0()
{
	f=new JFrame("X and 0 Game");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();
	t9=new JTextField();
	t1.addKeyListener(new KeyAdapter()
			{
		public void KeyReleased(KeyEvent e)
		{
			 JTextField text=(JTextField) e.getSource();
	         String text1 = text.getText();
	         if(text1.equals(xvalue) || text1.equals(zerovalue))
	         {
	        	 System.out.println("Text entered correctly");
	         }
	         else
	        	 System.out.println("Text is not proper");
	    	  
		}
		
			}
	);
}
public void FrameLaunch()
{
	
	f.setLayout(new GridLayout(3,4));
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(t5);
	f.add(t6);
	f.add(t7);
	f.add(t8);
	f.add(t9);
	f.add(b1);
	f.setSize(400, 200);
	f.setVisible(true);
}
public static void main(String args[])
{
	xn0 gui=new xn0();
	gui.FrameLaunch();
	
}



}
