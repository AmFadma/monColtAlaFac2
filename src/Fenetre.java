//package IG;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Fenetre {
    public JFrame frame;
    public VueTRAIN vt;

    public VueAction va;

    public Fenetre(Train t){
        frame = new JFrame();
        frame.setTitle("Colt Express");

        frame.setLayout(new FlowLayout());

        vt= new VueTRAIN(t);
        frame.add(vt);
        va= new VueAction(t);
        frame.add(va);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}