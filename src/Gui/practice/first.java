package Gui.practice;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class first extends JFrame {
    public first() {
        setLayout(new BorderLayout(2,2));
        JPanel p = new JPanel();
        setVisible(true);
        setSize(600,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField res = new JTextField();

        res.setSize(10,20);
        add(res,BorderLayout.NORTH);
        JLabel l = new JLabel("niggerland");
        add(l,BorderLayout.NORTH);
        JButton b1 = new JButton("hi");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("you clicked b1");
                    res.setText("b1 was clicked");
            }

        });
        p.add(b1);

        JButton b2 = new JButton("hello");
        p.add(b2);
        JButton b3 = new JButton("Nigga");
        p.add(b3);
        JButton b4 = new JButton("Nigga");
        p.add(b4);
        JButton b5 = new JButton("Niggar");
        p.add(b5);

        add(p, BorderLayout.CENTER);

    }
    public static void main(String[] args){
        new first();
    }
}













