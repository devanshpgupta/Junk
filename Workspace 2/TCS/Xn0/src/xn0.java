import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.*;
public class xn0 {
String xvalue="X";
String zerovalue="0";
JButton b1;
JLabel l1;
static JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
JFrame f;
JFrame f1;
public xn0()
{
	Container pane = new Container();
	pane.setLayout(new BorderLayout());
	f=new JFrame();
	f1=new JFrame();
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();
	t9=new JTextField();
	b1=new JButton();
	f.setLayout(new GridLayout(3,3));
	f1.setLayout(new BorderLayout());
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(t5);
	f.add(t6);
	f.add(t7);
	f.add(t8);
	f.add(t9);
	f1.add(b1,BorderLayout.CENTER);
	t1.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	f.setLayout(new FlowLayout());
	JTextField text=(JTextField) e.getSource();
    String text1 = text.getText();
     if(text1.equals(xvalue) || text1.equals(zerovalue))
     {
    	 l1=new JLabel("Text entered correctly");
    	 f.add(l1);
    	 f.setSize(200, 200);
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
	});
	t2.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
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
	});
	t3.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	
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
	});
	t4.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	
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
	});
	t5.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	
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
	});
	t6.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
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
	});
	t7.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	
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
	});
	t8.addKeyListener(new KeyAdapter()
	{
public void keyReleased(KeyEvent e)
{
	
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
	});
	t9.addKeyListener(new KeyAdapter()
			{
		public void keyReleased(KeyEvent e)
		{
			
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
			});
	pane.add(f,BorderLayout.NORTH);
	pane.add(f1,BorderLayout.SOUTH);
	pane.setSize(500, 200);
	pane.setVisible(true);
}
public void win()
{

System.out.println("=============================");
//System.out.println("The value in t1.getText() is "+t1.);
//No of winning possibilities

	/*if(t1.getText()==xvalue && ==X && matrix[0][2]==X)
		System.out.println("X wins");
	else
	if(matrix[1][0]==X && matrix[1][1]==X && matrix[1][2]==X)
		System.out.println("X wins");
	else
	if(matrix[2][0]==X && matrix[2][1]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][0]==X && matrix[1][0]==X && matrix[2][0]==X)
		System.out.println("X wins");
	else
	if(matrix[0][1]==X && matrix[1][1]==X && matrix[2][1]==X)
		System.out.println("X wins");
	else
	if(matrix[0][2]==X && matrix[1][2]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][0]==X && matrix[1][1]==X && matrix[2][2]==X)
		System.out.println("X wins");
	else
	if(matrix[0][2]==X && matrix[1][1]==X && matrix[2][0]==X)
		System.out.println("X wins");*/
	System.out.println("=============================");
}
public static void main(String args[])
	{xn0 gui=new xn0();
	gui.win();
	}}
