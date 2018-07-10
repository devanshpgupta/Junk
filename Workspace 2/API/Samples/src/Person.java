import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextLayout;

public class Person extends JPanel implements ActionListener {
JFrame f;
JTextField nameField;
JTextField surnameField;
public String name;
public String surname;
private String next;
final static int BIG_BORDER = 75;
final static int SMALL_BORDER = 10;
final static int ELEMENTsLENGHT = 320;
final static int VERTICAL_SPACE = 10;
final static int VERTICAL_SPACE_PLUS = 25;
final static int HORIZONTAL_SPACE = 75;
final static int SPACEforELEMENT_LABEL = 50;
final static int SPACEforELEMENT_TEXT = 40;
final static int H_SPACEforBUTTON = 64;
final static int V_SPACEforBUTTON = 26; 

public Person() {
    init();
}

public void init() {

    JLabel nameLabel = new JLabel("Please enter your name:");
    JLabel surnameLabel = new JLabel("Please enter your surname:");

    nameField = new JTextField();
    nameField.addActionListener(this);
    surnameField = new JTextField();
    surnameField.addActionListener(this);

    JButton nextButton = new JButton("NEXT");
    nextButton.setActionCommand(next);
    nextButton.addActionListener(this);

    JPanel panelButton = new JPanel();
    panelButton.add(nextButton);        

    double size[][] = {
            { BIG_BORDER, ELEMENTsLENGHT, HORIZONTAL_SPACE,
                    H_SPACEforBUTTON, SMALL_BORDER }, // Columns
            { BIG_BORDER, SPACEforELEMENT_LABEL, VERTICAL_SPACE,
                    SPACEforELEMENT_TEXT, VERTICAL_SPACE_PLUS,
                    SPACEforELEMENT_LABEL, VERTICAL_SPACE,
                    SPACEforELEMENT_TEXT, VERTICAL_SPACE_PLUS,
                    SPACEforELEMENT_LABEL, VERTICAL_SPACE,
                    V_SPACEforBUTTON, SMALL_BORDER } }; // Rows

    f.setLayout(new FlowLayout());

    add(nameLabel, "1,1,1,1");
    add(nameField, "1,3,1,1");
    add(surnameLabel, "1,5,1,1");
    add(surnameField, "1,7,1,1");
    add(nextButton, "3,11,1,1");
}   

public static void createAndShowGUI() {
    JFrame frame = new JFrame("Identification");
    frame.getContentPane().add(new Person());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(550, 450);
    frame.setResizable(false);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {

    name = nameField.getText();
    surname = surnameField.getText();

	if (e.getActionCommand().equalsIgnoreCase(next)) {
        Person.showNextWindow();
    } 
}

public static void showNextWindow() {
    //cardLayout.next(this);
    System.out.println("go to the next window");
}

public static void main(String[] args) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            createAndShowGUI();
        }
    });
}
}