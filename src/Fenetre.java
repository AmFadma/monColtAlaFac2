//package IG;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Fenetre {
    public JFrame frame;
    public VueTRAIN vt;

    public Fenetre(Train t){
        frame = new JFrame();
        frame.setTitle("Colt Express");

        frame.setLayout(new FlowLayout());

        vt= new VueTRAIN(t);
        /*grille = new VueGrille(modele);
        commandes = new VueCommandes(modele);
        frame.add(commandes);*/
        frame.add(vt);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}