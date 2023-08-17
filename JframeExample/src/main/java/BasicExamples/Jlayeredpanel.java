package BasicExamples;

import javax.swing.*;
import java.awt.*;

public class Jlayeredpanel extends JFrame {

    public Jlayeredpanel(){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("Jlayered Panel");
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(null);
        JLayeredPane panel=new JLayeredPane();
        panel.setBounds(0,0,500,500);
        this.add(panel);
        JLabel label=new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.blue);
        label.setBounds(50,50,200,200);
        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.green);
        label2.setBounds(100,75,200,200);
        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.magenta);
        label3.setBounds(125,100,200,200);
        panel.add(label,JLayeredPane.DEFAULT_LAYER);
        panel.add(label2,Integer.valueOf(2));
        panel.add(label3,Integer.valueOf(1));



        this.setVisible(true);
    }
}
