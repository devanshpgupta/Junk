import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Experiment implements ActionListener {
 static JTextField t1;
 JFrame f;
 JButton b1;
int count=0;
public Experiment()
{
	f=new JFrame("X and 0 Game");
	t1=new JTextField();
	b1=new JButton("Press me");
	//b1.addActionListener(this);
	t1.addActionListener(this);
	t1.getSelectedText();
	f.setLayout(new GridLayout(3,4));
	f.add(t1);
	f.add(b1);
	f.setSize(400, 200);
	f.setVisible(true);
	
	
}
//For Button Click
/*
  public void actionPerformed(ActionEvent e) {
 
	
	String text=null;
	text=t1.getText();
	System.out.println("Text in textfield: "+text);
	
	count=count+1;
	t1.setText(" " +count);
	if(text==null)
	{
		System.out.println("Nothing present");
	}
	else
		System.out.println("Text Present is "+text);
	
	
	//System.out.println("Text entered is " +text);
	//System.out.println("Text in e.getActionCommand() is " +e.getActionCommand());
}

*/
// For Text Change
public void actionPerformed(ActionEvent e)
{
	//if(String.parseInt(t1.getText())=='X')
    if (Integer.parseInt(t1.getText())!=0 &&Integer.parseInt(t1.getText())!=1 ){
        JOptionPane.showMessageDialog(null,
                "Error: Please enter number 1 or 0", "Error Message",
                JOptionPane.ERROR_MESSAGE);
    }  
		
}




public static void main(String args[])
{
	Experiment gui=new Experiment();
	
}



}
