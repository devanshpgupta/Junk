import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class Xn0Part2 implements ActionListener
{
	public JFrame frame;
	public int j=0;
	public int count=0;
	/**
	 * @wbp.parser.entryPoint
	 */
	public void actionPerformed(ActionEvent e) 
	{
		frame=new JFrame("Welcome to the game of X n 0");
		frame.setSize(300, 300);
		frame.setVisible(true);
		
	//	frame.getContentPane().setLayout(new FlowLayout());
		
		JPanel jp1=new JPanel();
		JPanel jp2=new JPanel();
		
		jp1.setLayout(new GridLayout(3,3));
		
		JTextField[] tf=new JTextField[9];
		for (int i = 0; i < tf.length; i++)
			{
			tf[i]=new JTextField();
		//	tf[i].setFont();
			}
		for(int i=0;i<tf.length;i++)
			jp1.add(tf[i]);

		
		jp2.setLayout(new FlowLayout());
		JButton jb1=new JButton("Evaluate the winner");
		jp2.add(jb1,BorderLayout.CENTER);
		JEditorPane je1 = new JEditorPane();
		jp2.add(je1);
		
		
		JSplitPane jsp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jp1,jp2);
		frame.add(jsp);
		jsp.setResizeWeight(0.5);
		jsp.setOneTouchExpandable(true);
		jsp.setContinuousLayout(true);
		
		jsp.setVisible(true);
		jp1.setVisible(true);
		jp2.setVisible(true);
		
		String str1="X Wins";
		String str2="0 Wins";
		jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				for (int i = 0; i < tf.length; i++)
				{
					if(tf[j].getText().equals("X") || tf[j].getText().equals("x") || tf[j].getText().equals("0"))
					{
			//			tf[j].setText("Correct");
						count++;
//**********************Applying Rules and finding Winner
						
						if(count==9)
						{
							int temp=0,temp1=0;
							int j,k=0;
							for(i=0;i<tf.length;i++)
								{
									for(k=i+1;k<3+i;k++)
									{
										if(tf[k-1].getText().equals("X") && tf[k].getText().equals("X"))
										{
											temp++;
											if(temp==2)
											{
												je1.setText("X Wins");
												break;
											}
										}
										else
											if(tf[k-1].getText().equals("0") && tf[k].getText().equals("0"))
											{
												temp1++;
												if(temp1==2)
												{
													je1.setText("0 Wins");
													break;
												}
											}
											else
												k=3+i;
									}
									i=i+2;
									temp=0;
								}
							for(i=0;i<tf.length;i++)
							{
								for(j=i;j<i+6;j=j+3)
								{
									if(tf[j].getText().equals("X") && tf[j+3].getText().equals("X"))
									{
									temp++;
									if(temp==2)
									{
										je1.setText("X Wins");
										break;
									}
								}
								else
									if(tf[j].getText().equals("0") && tf[j+3].getText().equals("0"))
									{
										temp1++;
										if(temp1==2)
										{
											je1.setText("0 Wins");
											break;
										}
									}
									else
										j=i+6;
							}
							temp=0;
							if(i==2)
								i=tf.length;
							}
						}
					}
				else
					tf[j].setText("Please renter");
				j++;
				}
				
			}
		});
		
		
	}

}
