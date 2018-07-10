package Wednesday23;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class question2 extends JFrame{
Container c;
Random r=new Random();
JButton j=new JButton("CATCH ME IF YOU CAN!!!!");
question2()
{
	c=getContentPane();
	c.setLayout(new FlowLayout());
	c.add(j);
	j.addMouseListener(new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			j.setLocation(r.nextInt(450) + 1,r.nextInt(450) + 1);
			}});
	setSize(500,500);
	setVisible(true);
}
public static void main(String args[])
{
	new question2();
}
}
