package Entrydata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox extends JFrame implements ActionListener{
    public Combobox(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals={"Cat","DOg","Cow"}; //Reference Integer,String Boolean, Double ETC
        JComboBox box=new JComboBox(animals);
        box.addActionListener(e -> {
            System.out.println(box.getSelectedItem());
        });
        /*
            box.addItem("Horse");
            box.setEditable(true):
            box.getItemCount();
            box.setItemAt("Pig",0);
            box.setSelectedindex(0);
            box.removeItem("cat")
            box.removeItemAt(0)
            box.removeAllItems();
        */

        this.add(box);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
