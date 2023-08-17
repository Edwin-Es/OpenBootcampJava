package Entrydata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkbox extends JFrame implements ActionListener {
    public Checkbox(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JCheckBox box =new JCheckBox();
        //box.setIcon(pmg); Icon when normal
        //box.setSelectedIcon(png); ICON WHen selected
        box.setText("I am not a robot");
        box.setFocusable(false);
        box.setFont(new Font("Consolas",Font.PLAIN,25));

        JButton btn= new JButton("Submit");
        btn.addActionListener(e -> {
            if(e.getSource()==btn){
                btn.setText(String.valueOf(box.isSelected()));
            }
        });
        this.add(box);
        this.add(btn);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
