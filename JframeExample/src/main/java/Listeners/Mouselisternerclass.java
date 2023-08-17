package Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mouselisternerclass extends JFrame implements MouseListener {
     JLabel label;
     public Mouselisternerclass(){
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setSize(500,500);
          this.setLayout(null);
          label=new JLabel();
          label.setBounds(0,0,100,100);
          label.setBackground(Color.red);
          label.setOpaque(true);
          label.addMouseListener(this);
          this.add(label);
          this.setVisible(true);
     }
     @Override
     public void mouseClicked(MouseEvent e) {
          System.out.println("click");
     }

     @Override
     public void mousePressed(MouseEvent e) {}

     @Override
     public void mouseReleased(MouseEvent e) {}

     @Override
     public void mouseEntered(MouseEvent e) {
          label.setBackground(Color.black);
     }

     @Override
     public void mouseExited(MouseEvent e) {
          label.setBackground(Color.blue);
     }
}
