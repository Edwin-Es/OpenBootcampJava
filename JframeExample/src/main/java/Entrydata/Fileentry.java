package Entrydata;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Fileentry extends JFrame {

    public Fileentry(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JButton btn=new JButton("Select File");
        btn.addActionListener(e -> {
            JFileChooser file=new JFileChooser();
            int response=file.showOpenDialog(null);//Select file
            if(response==JFileChooser.APPROVE_OPTION){
                File file1=new File(file.getSelectedFile().getAbsolutePath());
                System.out.println(file1);

            }
        });

        this.add(btn);
        this.setVisible(true);
    }
}
