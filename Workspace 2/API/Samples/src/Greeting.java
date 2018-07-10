import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

public class Greeting extends JPanel implements ActionListener {

Person person = new Person();   

String name = person.name;
String surname = person.surname;

private JButton nextButton;

private String next;

public Greeting() {
    super(new BorderLayout());
    init();
}

public void init() {

    nextButton = new JButton("NEXT");
    nextButton.setActionCommand(next);      
    nextButton.addActionListener(this);     
    //nextButton.setMnemonic('rightArrow');     

    String q = "How are you today, "+name+" "+surname+"?";          

    JTextArea textArea = new JTextArea(q); 
    textArea.setLineWrap(true);
    textArea.setWrapStyleWord(true);
    textArea.setEditable(false);
    add(textArea, BorderLayout.NORTH);      

    JPanel btnPanel = new JPanel();     
    btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.LINE_AXIS));
    btnPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
    btnPanel.add(Box.createHorizontalGlue());                       
    btnPanel.add(nextButton);
        btnPanel.setAlignmentX(RIGHT_ALIGNMENT);
    add(btnPanel, BorderLayout.SOUTH);      

} // end init

public static void showNextWindow() {
    //cardLayout.next(this);
    System.out.println("go to the next window");
}

public void actionPerformed(ActionEvent e) {

}

public static void createAndShowGUI() {

    JFrame frame = new JFrame("How are you");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new Greeting());     
    frame.setSize(550, 450);
    frame.setResizable(false);
    //frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

public static void main(String[] args) {
    // Schedule a job for the event-dispatching thread:
    // creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });
}
}