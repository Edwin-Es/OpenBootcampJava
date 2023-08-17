package BasicExamples;

import javax.swing.*;
import java.awt.*;

public class Jframe1 extends JFrame {
    public Jframe1() {
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Sera");
        this.setSize(500,500);
        ImageIcon logo=new ImageIcon("logo.png");
        this.setIconImage(logo.getImage());
        //this.setLayout(null); 1*
        //this.getContentPane().setBackground(new Color(0x2b2b2b));
        JLabel label =new JLabel();
        label.setText("Probando si sirve");
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.BOLD,32));
        //label.setBounds(0,0,250,250); 1*
        this.add(label);
        this.pack();




    }
}
