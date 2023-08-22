package ConversorView;


import ConversorController.ConvertorTempController;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class ConversorTemp extends JFrame {
     ConvertorTempController controller=new ConvertorTempController();
     ImageIcon icon=new ImageIcon("temp-icon.png");
     ImageIcon regresar=new ImageIcon("regresar.png");
     public ConversorTemp(){
          JLabel inicio=new JLabel("");
          inicio.setBounds(0,0,200,50);
          inicio.setIcon(regresar);
          this.setTitle("Conversor Temperatura");
          this.setSize(450,275);
          this.setLayout(null);
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setIconImage(icon.getImage());
          this.setResizable(false);

          JButton btnRegresar=new JButton("<- Regresar");
          btnRegresar.setFont(new Font("Verdana",Font.BOLD,14));
          btnRegresar.setBackground(new Color(0x050A40));
          btnRegresar.setForeground(Color.white);
          btnRegresar.setBounds(0,0,125,30);
          btnRegresar.setFocusable(false);
          btnRegresar.setBorder(new BevelBorder(BevelBorder.LOWERED,Color.black,Color.gray));
          btnRegresar.addActionListener(e -> {
               new MainMenu();
               this.dispose();
          });

          JLabel label=new JLabel("Ingrese temperatura a convertir: ");
          label.setFont((new Font("Verdana", Font.PLAIN,18)));
          label.setBounds(25,30,350,50);

          JLabel tempLabel=new JLabel("Temperatura :");
          tempLabel.setFont((new Font("Verdana", Font.PLAIN,18)));
          tempLabel.setBounds(25,80,200,50);

          JLabel warning=new JLabel("");
          warning.setFont((new Font("Verdana", Font.PLAIN,15)));
          warning.setForeground(Color.red);
          warning.setBounds(75,55,350,50);

          JTextField temp=new JTextField();
          temp.setBounds(175,95,50,30);
          temp.setFont((new Font("Verdana", Font.PLAIN,18)));

          JLabel label1=new JLabel("Convertir a :");
          label1.setFont((new Font("Verdana", Font.BOLD,10)));
          label1.setBounds(230,85,100,50);

          String[] opciones={"Celcius","Fahrenheit"};
          JComboBox<String> opcion=new JComboBox<>(opciones);
          opcion.setBounds(320,95,100,30);

          JLabel resultadoLabel=new JLabel("Resultado : ");
          resultadoLabel.setBounds(25,140,125,30);
          resultadoLabel.setFont((new Font("Verdana", Font.PLAIN,18)));
          JLabel resultado=new JLabel("");
          resultado.setBounds(175,140,100,30);
          resultado.setForeground(new Color(0x1B9E2D));
          resultado.setFont((new Font("Verdana", Font.BOLD,18)));

          JButton btn=new JButton("Convertir");
          btn.setBounds(100,180,250,35);
          btn.setBorder(new MetalBorders.PaletteBorder());
          btn.setFocusable(false);
          btn.addActionListener(e -> {
               warning.setText("");
               if(temp.getText().equals("")){
                    warning.setText("Ingrese algun valor");
               }
               else {
                    try{
                         double temperatura = Double.parseDouble(temp.getText());
                         if(opcion.getSelectedIndex()==0){
                              resultado.setText(String.format("%.2f",controller.celciusToF(temperatura))+"ºC");
                         }
                         else{
                              //resultado.setText(String.valueOf(controller.fahrenheitToC(temperatura))+"ºF");
                              resultado.setText(String.format("%.2f",controller.fahrenheitToC(temperatura) )+"ºF");
                         }

                    } catch (Exception ex){ warning.setText("Ingrese solo numeros");}
               }
          });


          this.add(tempLabel);
          this.add(warning);
          this.add(label);
          this.add(btn);
          this.add(temp);
          this.add(opcion);
          this.add(resultadoLabel);
          this.add(resultado);
          this.add(label1);
          this.add(inicio);
          this.add(btnRegresar);

          this.setVisible(true);
     }

}
