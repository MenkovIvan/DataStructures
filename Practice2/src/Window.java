import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame {
    private JButton btn1 = new JButton("Метод Кнута, Мориса и Пратта");
    private JButton btn2 = new JButton("Метод Боуэра и Мура");
    private JButton btn4 = new JButton("Сравнение перебора с методом КМП");
    private JButton btn5 = new JButton("Сравнение перебора с методом БМ");
    private JButton btn6 = new JButton("Метод КМП и БМ");
    private JTextField txtString = new JTextField("write string");
    private JTextField txtObraz = new JTextField("write obraz");
    private JPanel panel = new JPanel();
    private JPanel text = new JPanel();
    private JPanel buttons = new JPanel();
    eHandler handler = new eHandler();

    Window(){
        setTitle("Practice2");
        setSize(200,324);
        setLocation(200,130);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font SuperBigFont = new Font("TimesRoman", Font.BOLD, 30);
        Font BigFont = new Font("TimesRoman", Font.BOLD, 15);//25
        panel.setLayout(new BorderLayout());
        panel.add(text,BorderLayout.NORTH);
        panel.add(buttons,BorderLayout.SOUTH);
        text.setLayout(new GridLayout(2, 1, 2, 2));
        buttons.setLayout(new GridLayout(5, 1, 0, 0));

        txtObraz.setFont(SuperBigFont);
        txtString.setFont(SuperBigFont);
        btn1.setFont(BigFont);
        btn2.setFont(BigFont);
        btn4.setFont(BigFont);
        btn5.setFont(BigFont);
        btn6.setFont(BigFont);

        text.add(txtObraz);
        text.add(txtString);
        buttons.add(btn1);
        buttons.add(btn2);

        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);

        btn1.addActionListener(handler);
        btn2.addActionListener(handler);
        btn4.addActionListener(handler);
        btn5.addActionListener(handler);
        btn6.addActionListener(handler);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public class eHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if ((e.getSource() == btn1)){
                MethodKMP kmp = new MethodKMP();
                int f = kmp.methodKMP(txtString.getText(), txtObraz.getText());
                if (f != 0) {
                    System.out.println("Yes - " + f);
                }
                else
                    System.out.println("No");
            }

            if ((e.getSource() == btn2)){
                MethodBM bm = new MethodBM();
                int f = bm.methodBM(txtString.getText(), txtObraz.getText());
                if (f != 0) {
                    System.out.println("Yes - " + f);
                }
                else
                    System.out.println("No");
            }

            if ((e.getSource() == btn4)){
                MethodPerebor perebor = new MethodPerebor();
                MethodKMP kpm = new MethodKMP();
                int fPerebor = perebor.methodPerebor(txtString.getText(), txtObraz.getText());
                int fKMP = kpm.methodKMP(txtString.getText(), txtObraz.getText());
                if (fPerebor != 0) {
                    System.out.println("Yes - " + fPerebor + " vs " + fKMP);
                }
                else
                    System.out.println("No");
            }

            if ((e.getSource() == btn5)){
                MethodPerebor perebor = new MethodPerebor();
                MethodBM bm = new MethodBM();
                int fPerebor = perebor.methodPerebor(txtString.getText(), txtObraz.getText());
                int fKMP = bm.methodBM(txtString.getText(), txtObraz.getText());
                if (fPerebor != 0) {
                    System.out.println("Yes - " + fPerebor + " vs " + fKMP);
                }
                else
                    System.out.println("No");
            }

            if ((e.getSource() == btn6)){
                MethodKMP kpm = new MethodKMP();
                MethodBM bm = new MethodBM();
                int fPerebor = kpm.methodKMP(txtString.getText(), txtObraz.getText());
                int fKMP = bm.methodBM(txtString.getText(), txtObraz.getText());
                if (fPerebor != 0) {
                    System.out.println("Yes - " + fPerebor + " vs " + fKMP);
                }
                else
                    System.out.println("No");
            }
        }

    }

}

