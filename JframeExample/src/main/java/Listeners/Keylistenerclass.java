package Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keylistenerclass extends JFrame implements KeyListener {
     JLabel label;
     public Keylistenerclass(){
          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setSize(500,500);
          this.setLayout(null);
          this.addKeyListener(this);
          ImageIcon logo=new ImageIcon("rocket-icon.png");
          this.setTitle("Rocket");
          this.getContentPane().setBackground(Color.black);
          this.setIconImage(logo.getImage());
          label=new JLabel();
          label.setBounds(0,0,150,150);
          //label.setBackground(Color.red);
          //label.setOpaque(true);
          ImageIcon logo1=new ImageIcon("rocket.png");
          label.setIcon(logo1);

          this.add(label);


          this.setVisible(true);
     }

     @Override
     public void keyTyped(KeyEvent e) {
          switch (e.getKeyChar()){
               case'a':label.setLocation(label.getX()-10,label.getY());
                    break;
               case'w':label.setLocation(label.getX(),label.getY()-10);
                    break;
               case's':label.setLocation(label.getX(),label.getY()+10);
                    break;
               case'd':label.setLocation(label.getX()+10,label.getY());
                    break;
          }
     }

     @Override
     public void keyPressed(KeyEvent e) {
          switch (e.getKeyCode()){
               case 37:label.setLocation(label.getX()-10,label.getY());
                    break;
               case 38:label.setLocation(label.getX(),label.getY()-10);
                    break;
               case 40:label.setLocation(label.getX(),label.getY()+10);
                    break;
               case 39:label.setLocation(label.getX()+10,label.getY());
                    break;
          }

     }

     @Override
     public void keyReleased(KeyEvent e) {
          //System.out.println("you release "+e.getKeyChar());
          //System.out.println(e.getKeyCode());
     }
}
