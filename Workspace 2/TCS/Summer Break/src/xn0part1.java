import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class xn0part1 implements ActionListener {

	public int i=0;
	public int j=0;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame f1=new JFrame("Welcome to X n 0");
		f1.getContentPane().setLayout(new GridLayout(3,3));
		JButton jb=new JButton("Evaluate the winner");
		
		
		JTextField tf1=new JTextField(),tf2=new JTextField(),tf3=new JTextField(),tf4=new JTextField(),tf5=new JTextField(),tf6=new JTextField(),tf7=new JTextField(),tf8=new JTextField(),tf9=new JTextField();
	
		JTextField[] tf=new JTextField[9];
		for (int i = 0; i < tf.length; i++) {
			tf[i]=new JTextField();
		}
		for(int i=0;i<9;i++)
		{
			f1.getContentPane().add(tf[i]);
		}
		f1.add(jb);
		
/*		f1.getContentPane().add(tf[0]);
		f1.getContentPane().add(tf[1]);
		f1.getContentPane().add(tf[2]);
		f1.getContentPane().add(tf[3]);
		f1.getContentPane().add(tf[4]);
		f1.getContentPane().add(tf[5]);
		f1.getContentPane().add(tf[6]);
		f1.getContentPane().add(tf[7]);
		f1.getContentPane().add(tf[8]);
	//	f1.getContentPane().add(tf9); */
		f1.setSize(200, 200);
		f1.setVisible(true);
	/*	tf1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	if(textField.getText()=='X')
				String str1= tf1.getText();
				
				for (int i = 0; i < 9; i++) {
				if(str1.equals("X") || str1.equals("x"))
					tf1.setText("Correct");
				else
					tf1.setText("Incorrect");
				}
			}
			
		});*/
	
	/*	String str=new String();
		
		for (i = 0; i < tf.length; i++) {
			tf[i].addActionListener(new ActionListener(){
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				//	str=tf[i].getText();
				
					
					if(tf[j].getText().equals("X") || tf[j].getText().equals("x"))
						tf[j].setText("Correct");
					j++;
				}
				
			});
		}
		*/
		
		
				
	}

	}
