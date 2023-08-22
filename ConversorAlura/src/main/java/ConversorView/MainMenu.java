package ConversorView;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.awt.*;

public class MainMenu extends JFrame {
     ImageIcon icon=new ImageIcon("logo.png");
     public MainMenu(){
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setLayout(null);
          this.setSize(350,200);
          this.setResizable(false);
          this.setTitle("Menu Principal");
          this.setIconImage(icon.getImage());
          JLabel label=new JLabel("Seleccione una opcion:");
          label.setBounds(75,20,200,15);
          String[] options={"Conversor de moneda","Conversor de temperatura"};
          JComboBox<String> selectOption=new JComboBox<>(options);
          selectOption.setBounds(75,45,200,35);
          JButton btn=new JButton("Empezar");
          btn.setBounds(100,95,150,35);
          btn.addActionListener(e -> {
               int option=selectOption.getSelectedIndex();
               if(option==0){
                    new ConversorMoneda();
                    this.dispose();
               }
               else{
                    new ConversorTemp();
                    this.dispose();
               }
          });
          this.add(label);
          this.add(selectOption);
          this.add(btn);
          this.setVisible(true);
     }
}
