package openNewWindows;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
    
    public NewWindow(){
        JLabel label= new JLabel("New window");
        label.setBounds(50,50, 200,50);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Calibri",Font.PLAIN,32));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.add(label);
        this.setVisible(true);
    }
}
