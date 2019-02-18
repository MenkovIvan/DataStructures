
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Window extends JFrame {
    private JButton btn1 = new JButton("Bust search");
    private JButton btn2 = new JButton("Burrier search");
    private JButton btn3 = new JButton("Evaluate the effectiveness of Bust search and Barrier search");
    private JButton btn4 = new JButton("Binary search");
    private JButton btn5 = new JButton("Binary search according to the golden section rule");
    private JButton btn6 = new JButton("Evaluate the effectiveness of Binary search and Binary search according to the golden section rule");
    private JTextField searchId = new JTextField("");
    private JPanel panel = new JPanel();

    Window(){
        setTitle("Practice1");
        setSize(320,324);
        setLocation(200,130);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font BigFont = new Font("TimesRoman", Font.BOLD, 25);
        GridLayout layout = new GridLayout(7, 1, 5, 12);
        panel.setLayout(layout);

        searchId.setFont(BigFont);
        btn1.setFont(BigFont);
        btn2.setFont(BigFont);
        btn3.setFont(BigFont);
        btn4.setFont(BigFont);
        btn5.setFont(BigFont);
        btn6.setFont(BigFont);

        btn1.addActionListener(new Button1Listener());
        btn2.addActionListener(new Button2Listener());
        //btn3.addActionListener(new Button3Listener());
        //btn4.addActionListener(new Button4Listener());
        //btn5.addActionListener(new Button5Listener());
        //btn6.addActionListener(new Button6Listener());

        panel.add(searchId);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }


    private class Button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());
            array.chooseVariant(1,id);
        }
    }

    private class Button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());
            array.chooseVariant(2,id);
        }
    }
}
