//package IG;
import javax.swing.*;
import java.awt.*;

public class Fenetre {
    public JFrame frame;
    public VueTRAIN vt;

    public VueAction va;

    public Fenetre(Train t){
        frame = new JFrame();
        frame.setTitle("Colt Express");
        frame.setLayout(new BorderLayout());

        va= new VueAction(t);
        frame.add(va,BorderLayout.NORTH);

        vt= new VueTRAIN(t);
        frame.add(vt);



        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}