import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Color {

	private JFrame frame;
	public JFrame f1;
	
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Color window = new Color();
					window.frame.setVisible(true);
					window.f1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Color() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		frame.setBounds(100, 100,500, 500);
		JButton b1=new JButton("Blue");
		JButton b2=new JButton("Green");
		JButton b3=new JButton("Red");
		
	//	frame.setSize(100, 100);
		frame.getContentPane().add(b1,BorderLayout.CENTER );
		frame.getContentPane().add(b2, BorderLayout.EAST);
		frame.getContentPane().add(b3, BorderLayout.WEST);
		f1=new JFrame();
		
		JLabel j1=new JLabel();
		f1.getContentPane().add(j1,null);
		
		b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
					//	Scanner s1=new Scanner("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\Blue Eyes.jpg");
					//	System.out.println(s1);	
					
					ImageIcon img=new ImageIcon("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\Blue Eyes.jpg");
					j1.setIcon(img);	
					}
			
				});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	Scanner s1=new Scanner("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\Blue Eyes.jpg");
			//	System.out.println(s1);	
			
			ImageIcon img=new ImageIcon("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\green-lantern.jpg");
			j1.setIcon(img);	
			}
	
		});
		
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			//	Scanner s1=new Scanner("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\Blue Eyes.jpg");
			//	System.out.println(s1);	
			
			ImageIcon img=new ImageIcon("C:\\Users\\PAUSVIDE\\Desktop\\Java\\Images\\Red Bull.png");
			j1.setIcon(img);	
			}
	
		});
		
		
		
		
	/*	JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		JButton b1=new JButton("Blue");
		JButton b2=new JButton("Green");
		JButton b3=new JButton("Red");
	//	frame.getContentPane().add(b1,null );
	//	frame.getContentPane().add(b2,null );
	//	frame.getContentPane().add(b3,null );
		*/
	
		
		
			
	//	frame.setBounds(100, 100, 450, 300);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	frame.setLayout(new BorderLayout());
	//	frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
	}
}
