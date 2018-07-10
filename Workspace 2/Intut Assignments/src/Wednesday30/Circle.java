package Wednesday30;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Java Applet for moving a circle from left to right

/*
	<applet code="Circle" width="900" height="700">		
	</applet>	
*/

public class Circle extends Applet implements Runnable {

	Thread t;
	int x, y, w, h;

	public void init() {
		setBackground(Color.gray);
		x = 20;
		y = 40;
		w = 75;
		h = 75;
		t = new Thread(this); // Reference to Runnable interface
		t.start();

		addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent me) {
				t.suspend();
			}

			public void mouseExited(MouseEvent me) {
				t.resume();
			}

		});
	}

	public void run() {
		for(int i=21;i<=800;i++) {
			x = i;
			repaint();
			if(x == 800) {
				i = 21;
				y += 50;
			}
			try{
				Thread.sleep(5);
			} catch(Exception e) {}
		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawOval(x, y, w, h);
	}




}