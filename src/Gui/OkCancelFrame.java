package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkCancelFrame  extends JFrame {
    private JTextField t1;
    public OkCancelFrame(){
        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("cancel");
        t1 = new JTextField();

        this.setSize(720,100);
        this.setLayout(new GridLayout(2,1));
        this.setBounds(0,0,100,100);
//        button2.setBounds(0,100,100,100);
        this.add(button1);
        this.add(button2);
        this.setVisible(true);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        code1  okbtn = new code1();
        button1.addActionListener(okbtn);

        code2  canbtn = new code2();
        button2.addActionListener(canbtn);

    }
    class code1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ok Button Clicked");
            t1.setText("Ok Clicked");
        }
    }
    class code2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Cancel Button Clicked");
            t1.setText("Ok Clicked");

        }
    }
}
