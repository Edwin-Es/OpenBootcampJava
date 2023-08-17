package BasicExamples;

import javax.swing.*;
import java.awt.*;

public class Jbuttons1 extends JFrame  { //implements ActionListener
    JButton button;

    public Jbuttons1(){
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
        this.setTitle("Buttons");
        this.getContentPane().setBackground(Color.gray);
        button = new JButton();
        button.setBounds(200,200,100,50);
        button.setText("Click");
        JLabel label=new JLabel("click");
        label.setVisible(false);
        label.setBounds(0,300,100,100);
        this.add(label);

        //button.addActionListener(this);
        button.addActionListener(e -> {
            System.out.println("clicl");
            label.setVisible(true);
        });
        button.setBackground(Color.pink);
        button.setBorder(BorderFactory.createMatteBorder(0,5,5,0,Color.BLUE));
        this.add(button);
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("click");
        }
    }*/
}
