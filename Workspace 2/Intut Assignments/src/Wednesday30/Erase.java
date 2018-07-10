package Wednesday30;

import java.awt.*;
import java.awt.event.*;

class Erase extends Frame implements ItemListener
{  
  int x1,y1,x2,y2;
  MenuBar mb;
  Menu m1, m2;
  CheckboxMenuItem c1, c2, c3, c4, c5;
  boolean flag;
  int eraserSize;
  Button b1;
	
  Erase()
  {
    super("Eraser");
	setLayout(new FlowLayout());
    setBackground(Color.darkGray);
    mb =new MenuBar();
    m1 = new Menu("What");
    m2 = new Menu("Erase");
    c1 = new CheckboxMenuItem("4 Pix.");
    c2 = new CheckboxMenuItem("8 Pix.");
    c3 = new CheckboxMenuItem("12 Pix.");
    c4 = new CheckboxMenuItem("16 Pix.");
    c5 = new CheckboxMenuItem("20 Pix.");
	b1 = new Button("Change");
    m2.add(c1);
    m2.add(c2);
    m2.add(c3);
    m2.add(c4);
    m2.add(c5);
    m1.add(m2);
    mb.add(m1);
    setMenuBar(mb);
	add(b1);
    addMouseMotionListener(new A());
    addMouseListener(new MouseAdapter()
    {
      public void mousePressed(MouseEvent me)
      {
      	if(!flag)
      	{
          x1 = me.getX();
          y1 = me.getY();
      	}
      }

      public void mouseReleased(MouseEvent me)
      {
      	if(!flag)
      	{
          x2 = me.getX();
          y2 = me.getY();
          Graphics g = getGraphics();
          g.drawLine(x1,y1,x2,y2);
        }
      }
    });

/*    c1.addItemListener(new ItemListener()
    {
      public void itemStateChanged(ItemEvent ae)
      {
      	if(c1.getState())
      	{
      		flag = true;
      	}
      	else
      		flag = false;
      }
    }); */
    setSize(300,300);
    setVisible(true);

    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
    c5.addItemListener(this);
	b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			setBackground(Color.white);
		}
	});
  }

  public void itemStateChanged(ItemEvent ie)
  {
    if(ie.getSource() == c1 && c1.getState())
    {
      eraserSize = 4;
      flag = true;
    }

    else if(ie.getSource() == c2 && c2.getState())
    {
      eraserSize = 8;
      flag = true;
    }

    else if(ie.getSource() == c3 && c3.getState())
    {
      eraserSize = 12;
      flag = true;
    }

    else if(ie.getSource() == c4 && c4.getState())
    {
      eraserSize = 16;
      flag = true;
    }

    else if(ie.getSource() == c5 && c5.getState())
    {
      eraserSize = 20;
      flag = true;
    }
    else
      flag = false;
  }

  class A extends MouseMotionAdapter
  {        
    public void mouseDragged(MouseEvent me)
    {
    	if(flag)
    	{
        int x = me.getX();
        int y = me.getY();
        Graphics g = getGraphics();
        g.setColor(Color.darkGray);
        g.fillOval(x,y,eraserSize,eraserSize);
    	}
    }
  }

  public static void main(String a[])
  {
    new Erase();
  }
}