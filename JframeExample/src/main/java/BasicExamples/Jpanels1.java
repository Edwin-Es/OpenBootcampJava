package BasicExamples;

import javax.swing.*;
import java.awt.*;

public class Jpanels1 extends JFrame {

    public Jpanels1(){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setBounds(0,0,250,250);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.black);
        panel2.setBounds(250,0,250,250);
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.green);
        panel3.setBounds(0,250,500,250);
        panel.setLayout(null);
        JLabel label = new JLabel("What up!");
        label.setFont(new Font("Verdana",Font.BOLD,16));
        label.setForeground(Color.white);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(62,62,125,125);
        panel.add(label);
        this.add(panel);
        this.add(panel2);
        this.add(panel3);
    }
}
