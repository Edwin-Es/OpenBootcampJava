package ConversorView;

import ConversorController.ConvertorMonedaController;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class ConversorMoneda extends JFrame {
     ConvertorMonedaController convertor=new ConvertorMonedaController();
     ImageIcon icon=new ImageIcon("money-icon.png");
     ImageIcon regresar=new ImageIcon("boton_regresar.png");
     public ConversorMoneda(){
          this.setTitle("Conversor Monedas");
          this.setSize(400,275);
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setIconImage(icon.getImage());
          this.setLayout(null);
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

          JLabel label=new JLabel("Ingrese cantidad:");
          label.setBounds(25,30,200,50);
          label.setFont(new Font("Verdana",Font.PLAIN,20));

          JLabel warning=new JLabel("");
          warning.setBounds(25,60,200,30);
          warning.setFont(new Font("Verdana",Font.BOLD,11));
          warning.setForeground(Color.red);

          JTextField cantidad=new JTextField();
          cantidad.setBounds(25,90,80,40);
          cantidad.setFont(new Font(null,Font.BOLD,18));

          String[]monedas={"Dolar a Peso Mexicano","Dolar a Peso Colombiano","Dolar a Peso Argentino",
                  "Dolar a Real Brasileno","Dolar a Euro","Dolar a Libra Esterlina","Dolar a Yen",
                  "Peso Mexicano a Dolar","Peso Colombiano a Dolar","Peso Argentino a Dolar",
                  "Real Brasileno a Dolar","Euro a Dolar","Libra Esterlina a Dolar", "Yen a Dolar"};

          JComboBox<String> opciones=new JComboBox<>(monedas);
          opciones.setBounds(125,90,210,40);

          JLabel resultadoLabel=new JLabel("Resultado: ");
          resultadoLabel.setBounds(25,130,150,50);
          resultadoLabel.setFont(new Font("Verdana",Font.PLAIN,  18));
          JLabel resultado=new JLabel("");
          resultado.setBounds(125,130,200,50);
          resultado.setFont(new Font("Verdana",Font.BOLD,16));
          resultado.setForeground(new Color(0x1B9E2D));

          JButton btn=new JButton("Convertir");
          btn.setBounds(125,180,150,40);
          btn.addActionListener(e -> {
               warning.setText("");
               if(cantidad.getText().equals("")){
                    warning.setText("Ingrese algun valor");
               }
               else {
                    try {
                         double moneda = Double.parseDouble(cantidad.getText());
                         if(opciones.getSelectedIndex()<=6){
                              resultado.setText(
                                      String.format("%.2f",convertor.convertir(moneda, opciones.getSelectedIndex()))+" "+opciones.getSelectedItem().toString().replaceAll("Dolar a ","")
                              );
                         }
                         else{
                              resultado.setText(
                                      String.format("%.2f",convertor.convertir(moneda, opciones.getSelectedIndex()))+" Dolares"
                              );
                         }


                    } catch (Exception ex) {
                         warning.setText("Ingrese solo numeros");
                    }
               }
          });

          this.add(btn);
          this.add(resultado);
          this.add(opciones);
          this.add(cantidad);
          this.add(label);
          this.add(btnRegresar);
          this.add(resultadoLabel);
          this.add(warning);
          this.setVisible(true);
     }
}
