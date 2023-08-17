package Entrydata;

import javax.swing.*;
import java.awt.*;

public class Progressbar extends JFrame {
    JProgressBar bar;
    public Progressbar(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        bar = new JProgressBar();
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setFont(new Font("Calibri",Font.BOLD,25));
        bar.setForeground(Color.GREEN);


        this.add(bar);

        this.setVisible(true);
        fill();
    }
    public void fill(){
        int counter=0;
        while(counter<=100){
            bar.setValue(counter);
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            counter++;
        }
        bar.setString("Done");
    }
}
