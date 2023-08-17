package openNewWindows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Menubar extends JFrame implements ActionListener {

    public Menubar(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        JMenuBar bar = new JMenuBar();

        JMenu file=new JMenu("File");
        JMenu edit=new JMenu("Edit");
        JMenu help=new JMenu("Help");

        JMenuItem load=new JMenuItem("Load");
        JMenuItem save=new JMenuItem("Save");
        JMenuItem exit=new JMenuItem("Exit");

        load.addActionListener(e -> System.out.println("Load"));
        save.addActionListener(e -> System.out.println("save"));
        exit.addActionListener(e -> System.exit(0));

        //ImageIcon loadicon= new ImageIcon("image.pgn");
        //load.setIcon(loadicon);

        help.setMnemonic(KeyEvent.VK_H);//ALT+letter

        load.setMnemonic(KeyEvent.VK_L);//load just letter
        save.setMnemonic(KeyEvent.VK_S);//save
        exit.setMnemonic(KeyEvent.VK_E);//load

        file.add(load);
        file.add(save);
        file.add(exit);

        bar.add(file);
        bar.add(edit);
        bar.add(help);


        this.setJMenuBar(bar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
