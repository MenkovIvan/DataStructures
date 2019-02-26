import java.io.IOException;

import static java.lang.System.currentTimeMillis;

public class Window extends JFrame {
    private JButton btn1 = new JButton("Bust search");
    private JButton btn2 = new JButton("Burrier search");
    private JButton btn3 = new JButton("Evaluate the effectiveness of Bust search and Barrier search");
    private JButton btn4 = new JButton("Binary search");
    private JButton btn5 = new JButton("Binary search according to the golden section rule");
    private JButton btn6 = new JButton("Evaluate the effectiveness of Binary, Bust, Burrier searches");
    private JTextField searchId = new JTextField("write id of student");
    private JPanel panel = new JPanel();
    private JPanel text = new JPanel();
    private JPanel buttons = new JPanel();

    Window(){
        setTitle("Practice1");
        setSize(200,324);
        setLocation(200,130);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Font SuperBigFont = new Font("TimesRoman", Font.BOLD, 30);
        Font BigFont = new Font("TimesRoman", Font.BOLD, 15);//25
        panel.setLayout(new BorderLayout());
        panel.add(text,BorderLayout.NORTH);
        panel.add(buttons,BorderLayout.SOUTH);
        text.setLayout(new GridLayout(1, 1, 2, 2));
        buttons.setLayout(new GridLayout(6, 1, 0, 0));

        searchId.setFont(SuperBigFont);
        btn1.setFont(BigFont);
        btn2.setFont(BigFont);
        btn3.setFont(BigFont);
        btn4.setFont(BigFont);
        btn5.setFont(BigFont);
        btn6.setFont(BigFont);

        btn1.addActionListener(new Button1Listener());
        btn2.addActionListener(new Button2Listener());
        btn3.addActionListener(new Button3Listener());
        btn4.addActionListener(new Button4Listener());
        btn5.addActionListener(new Button5Listener());
        btn6.addActionListener(new Button6Listener());

        text.add(searchId);
        buttons.add(btn1);
        buttons.add(btn2);
        buttons.add(btn3);
        buttons.add(btn4);
        buttons.add(btn5);
        buttons.add(btn6);

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

    private class Button3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());


            long startTime = currentTimeMillis();
            array.chooseVariant(1,id);
            long timeSpent = currentTimeMillis() - startTime;
            System.out.println("программа выполнялась " + timeSpent + " миллисекунд");

            long start = currentTimeMillis();
            array.chooseVariant(2,id);
            long Spent = currentTimeMillis() - start;
            System.out.println("программа выполнялась " + Spent + " миллисекунд");
            System.exit(0);
        }
    }

    private class Button4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());
            array.chooseVariant(4,id);
        }
    }

    private class Button5Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());
            array.chooseVariant(5,id);
        }
    }

    private class Button6Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            ReadFile rf = new ReadFile();
            Array array = new Array();
            try {
                rf.read(array);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            int id= Integer.parseInt(searchId.getText());

            long startTime = currentTimeMillis();
            array.chooseVariant(1,id);
            long timeSpent = currentTimeMillis() - startTime;
            System.out.println("При поиске перебором программа выполнялась " + timeSpent + " миллисекунд");

            long start = currentTimeMillis();
            array.chooseVariant(2,id);
            long Spent = currentTimeMillis() - start;
            System.out.println("При поиске с барьером программа выполнялась " + Spent + " миллисекунд");

            long start3 = currentTimeMillis();
            array.chooseVariant(4,id);
            long Spent3 = currentTimeMillis() - start3;
            System.out.println("При бинарном поиске программа выполнялась " + Spent3 + " миллисекунд");
            System.exit(0);
        }
    }
}
