package Wednesday23;

import javax.swing.*;
import javax.swing.JScrollBar;
import java.awt.*;
import java.awt.event.*;
import java.awt.Adjustable;

public class question1 extends JFrame implements AdjustmentListener {
Container c;
JScrollBar j1=new JScrollBar(Adjustable.VERTICAL,127,1,0,255);
JScrollBar j2=new JScrollBar(Adjustable.VERTICAL,127,1,0,255);
JScrollBar j3=new JScrollBar(Adjustable.VERTICAL,127,1,0,255);
JPanel j=new JPanel();
question1()
{
	c=getContentPane();
	c.setLayout(null);
	j1.setBounds(10, 20, 10, 200);
	j1.setBackground(Color.red);
	c.add(j1);
	j2.setBounds(30, 20, 10, 200);
	j2.setBackground(Color.green);
	c.add(j2);
	j3.setBounds(50, 20, 10, 200);
	j3.setBackground(Color.blue);
	c.add(j3);
	j.setBounds(80,20,180,200);
	c.add(j);
	j1.addAdjustmentListener(this);
	j2.addAdjustmentListener(this);
	j3.addAdjustmentListener(this);
	setSize(300,300);
	setVisible(true);
}
public void adjustmentValueChanged(AdjustmentEvent e) {
	j.setBackground(new Color(j1.getValue(),j2.getValue(),j3.getValue()));
}
public static void main(String a[])
{
	new question1();
}


}
