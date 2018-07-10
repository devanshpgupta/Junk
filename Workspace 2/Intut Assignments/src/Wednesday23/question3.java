package Wednesday23;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;
public class question3 extends JFrame{
Container c;
Calendar cal;
JLabel lab1=new JLabel("Enter Month:");
JLabel lab2=new JLabel("Eneter Year:");
JTextField mon=new JTextField();
JTextField year=new JTextField();
JButton sub=new JButton();

question3()
{
	c=getContentPane();
	c.setLayout(new BoxLayout(c,BoxLayout.PAGE_AXIS));
	//mon.setLocation(100, 100);
	c.add(lab1);
	c.add(mon);
	c.add(lab2);
	c.add(year);
	c.add(sub);
	sub.addActionListener(new ActionListener()
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					update(mon.getText(),year.getText());
				}});
	setSize(500,500);
	setVisible(true);
}
private void update(String text, String text2) {
	System.out.println("Hello"+text+" " +text2);
}
	public static void main(String[] args) {
		new question3();
	}

}
