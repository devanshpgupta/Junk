package Wednesday30;

import java.awt.*;
import java.applet.*;

/* <applet code=DiffRun width=800 height=600> </applet> */

public class DiffRun extends Applet implements Runnable
{
  int x1, y1, x2, y2;
  int x3, y3, x4, y4;
  int x5, y5, x6, y6;

  Thread t1, t2, t3;

  public void init() 
  {
    setBackground(Color.gray);
    setForeground(Color.cyan);
    t1 = new Thread(this,"One");
    t2 = new Thread(new A(), "Two");
    t3 = new Thread(new B(), "Three");
	t1.setPriority(9);
    x1 = 5;
    y1 = 200;
    x2 = 105;
    y2 = 200;

    x3 = 500;
    y3 = 200;
    x4 = 600;
    y4 = 200;

    x5 = 300;
    y5 = 400;
    x6 = 300;
    y6 = 500;    
    
    t1.start();
    t2.start();
    t3.start();
  }

  public void run()
  {
    try
    {
      for(;;)
      {
        if(x1 == 200)
			t1.stop();
        x1++;
        x2++;
        repaint();
        Thread.sleep(10);
      }
    } catch(InterruptedException ie)
      {
	  System.out.println(ie);
}
  }

  class A implements Runnable
  {
    public void run()
    {
      try
      {
        for(;;)
        {
          if(x3 == 300)
		t2.stop();
          x3--;
          x4--;
          repaint();
          Thread.sleep(10);
        }
      } catch(InterruptedException ie)
        {
		System.out.println(ie);
}
    }
  }

  class B implements Runnable
  {
    public void run()
    {
      try
      {
        for(;;)
        {
          if(y5 == 150)
			t3.stop();
          y5--;
          y6--;
          repaint();
          Thread.sleep(10);
        }
      } catch(InterruptedException ie)
        {
		System.out.println(ie);
}
    }
  }

  public void paint(Graphics g)
  {
    g.drawLine(x1,y1,x2,y2);
    g.drawLine(x3,y3,x4,y4);
    g.drawLine(x5,y5,x6,y6);
	if(y5 == 150) {
		g.setColor(Color.green);
		g.fillOval(275, 175, 50, 50);
		g.setColor(Color.black);
		g.fillOval(296, 196, 10, 10);
	}
  }
}  