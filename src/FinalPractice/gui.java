package FinalPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {
     public gui(){


        BorderLayout  bl=(new BorderLayout(2,2));
        setVisible(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(0,0,600,400);
        setTitle("Final");

        JPanel jp = new JPanel();
        jp.setVisible(true);

        JTextField res = new JTextField();
        res.setSize(10,10);
        add(res,BorderLayout.NORTH);

        JButton b1 = new JButton("1");
        b1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent ae){
                res.setText("1");
            }
        });
        jp.add(b1);
         JButton b2 = new JButton("2");
         b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae){
                 res.setText("2");
             }
         });

         jp.add(b2);
        add(jp,BorderLayout.CENTER);

        JButton calcbtn = new JButton();
        calcbtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

         }
         });
    }
    public static void main(String[] args){
         new gui();
    }

}






