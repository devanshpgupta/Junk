import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;

public class xn0 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xn0 window = new xn0();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xn0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("X and 0");
	//	frame.setIconImage();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		JTextField j1=new JTextField("Welcome to the game of Master X / 0");
		
		j1.setHorizontalAlignment(JTextField.CENTER);
		frame.getContentPane().add(j1,BorderLayout.NORTH);
		JLabel l1=new JLabel("Play New Game");
		l1.setHorizontalAlignment(JLabel.CENTER);
		JButton b1= new JButton("Start");
		frame.getContentPane().add(l1,BorderLayout.CENTER);
		frame.getContentPane().add(b1,BorderLayout.SOUTH);
		b1.addActionListener(new Xn0Part2());
		frame.setVisible(false);

}
}
