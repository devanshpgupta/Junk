package Wednesday30;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

class CatchIt extends Frame
{
  Panel p;
  Button b1;
  Random r;

  CatchIt()
  {
    super("Catch...");
    r = new Random();
    p = new Panel();
    p.setLayout(null);
    p.setBackground(Color.gray);
    b1 = new Button("Butterfly");
    b1.setBounds(20,20,100,30);// x, y, w, h
    p.add(b1);
    add(p);
    setSize(750,600);
    setVisible(true);
    b1.addMouseListener(new MouseAdapter()
    {
      public void mouseEntered(MouseEvent me)
      {
        int x = r.nextInt(600);
        int y = r.nextInt(500);
        b1.setLocation(x,y);
      }
    });
  }

  public static void main(String a[])
  {
    new CatchIt();
  }
}