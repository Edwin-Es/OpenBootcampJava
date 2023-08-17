package Listeners;

import javax.swing.*;
import java.awt.*;

public class DragandDrop extends JFrame {
     DragPanel panel=new DragPanel();
     public DragandDrop(){

          this.setDefaultCloseOperation(EXIT_ON_CLOSE);
          this.setSize(500,500);
          this.getContentPane().setBackground(Color.BLACK);

          this.add(panel);
          this.setVisible(true);
     }
}
