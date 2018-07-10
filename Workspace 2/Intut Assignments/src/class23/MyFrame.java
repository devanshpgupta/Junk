package class23;
import java.awt.Container;
import javax.swing.*;
public class MyFrame extends JFrame {
Container c;
MyFrame()
{
	c = getContentPane();
	setSize(500,500);
	setVisible(true);
}

public static void main(String a[])
{
	new MyFrame();
	
}
}
