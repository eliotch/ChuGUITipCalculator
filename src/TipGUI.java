import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class TipGUI extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JTextField textField1;
    private JButton button4;
    private JTextField textField2;
    private JTextArea textArea1;
    private JTextArea textArea2;

    public TipGUI(){
        createUIComponents();
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
        setContentPane(mainPanel);
        setSize(500, 500);
        setLocation(0, 0);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        textField1.addKeyListener(this);
        textArea2.addKeyListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }

}
