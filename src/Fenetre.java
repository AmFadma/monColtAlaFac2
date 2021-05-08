//package IG;
import javax.swing.*;
import java.awt.*;

public class Fenetre {
    public JFrame frame;
    public VueTRAIN vt;
    //public JPanel p;
    public VueAction va;

    public Fenetre(Train t){

        frame = new JFrame();
        //p = new JPanel(new GridBagLayout());
        frame.setTitle("Colt Express");
       frame.setLayout(new GridLayout(2,1,0,0));
        va= new VueAction(t);
        //p.add(va,va.gc);

        frame.add(va);




        vt= new VueTRAIN(t);
       frame.add(vt);
        //JLabel label1 = new JLabel("Perso 1" );

        //frame.add(label1);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}