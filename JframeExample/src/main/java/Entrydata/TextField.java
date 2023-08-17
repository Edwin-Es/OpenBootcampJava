package Entrydata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame implements ActionListener {

    public TextField(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JLabel label=new JLabel();
        JTextField field= new JTextField();
        field.setPreferredSize(new Dimension(250,40));
        field.setFont(new Font("Calibri",Font.PLAIN,25));
        field.setForeground(Color.CYAN);
        field.setBackground(Color.black);
        field.setCaretColor(Color.white);//caret
        JButton btn=new JButton("Submit");
        btn.addActionListener(e -> {
            if(e.getSource()==btn){
                label.setText("Su palabra es " +field.getText());

            }
        });

        this.add(btn);
        this.add(field);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
