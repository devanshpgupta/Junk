import javax.swing.*;
import java.awt.*;

public class Frame4 {
private JFrame f;
private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;

public Frame4()
{
	f=new JFrame("Grid Layout with Text Box");
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	t4=new JTextField();
	t5=new JTextField();
	t6=new JTextField();
	t7=new JTextField();
	t8=new JTextField();
	t9=new JTextField();
	}

public void launchFrame()
{
	f.setLayout(new GridLayout(3,3));
	f.add(t1);
	f.add(t2);
	f.add(t3);
	f.add(t4);
	f.add(t5);
	f.add(t6);
	f.add(t7);
	f.add(t8);
	f.add(t9);
	f.setSize(400, 200);
	f.setVisible(true);

}
public static void main(String args[])
{
	Frame4 gui=new Frame4();
	gui.launchFrame();
	
}

	
	
}
