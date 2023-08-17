package Entrydata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radioimput extends JFrame implements ActionListener {

    public Radioimput(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JRadioButton pizzabtn=new JRadioButton("Pizza");
        JRadioButton hamburgerbtn=new JRadioButton("Hamburguer");
        JRadioButton hotdogbtn=new JRadioButton("Hot dog");

        pizzabtn.addActionListener(e -> System.out.println("Pizza Selected"));
        hamburgerbtn.addActionListener(e -> System.out.println("hamburger Selected"));
        hotdogbtn.addActionListener(e -> System.out.println("hot dog Selected"));

        ButtonGroup group=new ButtonGroup();
        group.add(pizzabtn);
        group.add(hamburgerbtn);
        group.add(hotdogbtn);
        this.add(pizzabtn);
        this.add(hamburgerbtn);
        this.add(hotdogbtn);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
