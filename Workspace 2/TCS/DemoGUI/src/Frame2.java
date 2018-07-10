import java.awt.*;
import javax.swing.*;

public class Frame2 {

	private JFrame f;
	private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	
	public Frame2(){
		f=new JFrame("Flow Layout");
		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("Button 4");
		b5=new JButton("Button 5");
		b6=new JButton("Button 6");
		b7=new JButton("Button 7");
		b8=new JButton("Button 8");
		b9=new JButton("Button 9");
	}
	public void launchFrame(){
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.setSize(300,200);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Frame2 gui1=new Frame2();
		gui1.launchFrame();
		
	}

}
