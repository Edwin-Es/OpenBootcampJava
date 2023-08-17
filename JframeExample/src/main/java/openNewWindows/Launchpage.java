package openNewWindows;

import javax.swing.*;

public class Launchpage {
    JFrame frame=new JFrame();
    JButton mybtn= new JButton("New Window");
    public Launchpage(){
        mybtn.setBounds(100,160,200,40);
        mybtn.setFocusable(false);
        mybtn.addActionListener(e -> {
            if(e.getSource()==mybtn){
                frame.dispose();
                NewWindow myWindow=new NewWindow();

            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(mybtn);
        frame.setVisible(true);
    }
}
