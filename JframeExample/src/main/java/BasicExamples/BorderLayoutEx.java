package BasicExamples;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
        public BorderLayoutEx(){
            this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
            this.setVisible(true);
            this.setSize(500,500);
            this.setLayout(new BorderLayout(10,20)); //margin
            this.setTitle("Layout");
            this.getContentPane().setBackground(Color.gray);

            JPanel jpanel1=new JPanel();
            JPanel jpanel2=new JPanel();
            JPanel jpanel3=new JPanel();
            JPanel jpanel4=new JPanel();
            JPanel jpanel5=new JPanel();

            jpanel1.setBackground(Color.red);
            jpanel2.setBackground(Color.green);
            jpanel3.setBackground(Color.yellow);
            jpanel4.setBackground(Color.magenta);
            jpanel5.setBackground(Color.blue);

            jpanel1.setPreferredSize(new Dimension(100,100));
            jpanel2.setPreferredSize(new Dimension(100,100));
            jpanel3.setPreferredSize(new Dimension(100,100));
            jpanel4.setPreferredSize(new Dimension(100,100));
            jpanel5.setPreferredSize(new Dimension(100,100));

            this.add(jpanel1,BorderLayout.NORTH);
            this.add(jpanel2,BorderLayout.WEST);
            this.add(jpanel3,BorderLayout.EAST);
            this.add(jpanel4,BorderLayout.SOUTH);
            this.add(jpanel5,BorderLayout.CENTER);

        }

}
