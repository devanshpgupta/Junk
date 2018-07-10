//Event Handling
import javax.swing.*;
import java.awt.*;

public class Frame5 {
private JFrame f;
private JButton b1;

public Frame5()
{
	f=new JFrame("Event Handling");
	b1=new JButton("Please Press Me");
	//b1.setActionCommand("Button Pressed");
	b1.setActionCommand(b1.getText());
}

public void framelaunch()
{
	b1.addActionListener(new ButtonHandler());
	f.setLayout(new BorderLayout());
	f.add(b1,BorderLayout.CENTER);
	f.setSize(400, 200);
	f.setVisible(true);
}
	public static void main(String args[])
	{
		Frame5 gui=new Frame5();
		gui.framelaunch();
	}
	
}
