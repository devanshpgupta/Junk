package Wednesday30;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*  <applet code="MouseClick" width=600 height=600>
     </applet>  */

public class MouseClick extends Applet implements MouseListener
{
  Thread t;
   int x,y,w,h;

  public void init()
  {
    t = new Thread(new A());
    setBackground(Color.darkGray);
    setForeground(Color.yellow);
    x = 0;
    y=0;
    w=0;
    h=0;
    addMouseListener(this);
    t.start();
  }

  class A extends Thread {
	public void run() {
		for(;;) {
			w += 8;
			h += 8;
			repaint();
			try {
			   Thread.sleep(100);
			} catch(Exception e)
				{}
		}
	}	
  }

public void update(Graphics g)
  {
    paint(g);
  }

  public void paint(Graphics g)
  {
     g.drawOval(x,y,w,h);
  }

  public void  mouseClicked(MouseEvent me)
  {
	x = me.getX();
	y = me.getY();
	w=0;
	h=0;
	repaint();
  }

  public void mouseExited(MouseEvent me)
  {
	try
	{	
		t.suspend();
	} catch(Exception e2)
	  {}
  }     
        
  public void mouseEntered(MouseEvent me)
  {
	try
	{
  	  t.resume();		
	} catch(Exception e1)
	  {}
  }

  public void mousePressed(MouseEvent me)
  {}     
     
  public void mouseReleased(MouseEvent me)
  {}
}