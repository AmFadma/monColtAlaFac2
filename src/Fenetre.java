//package IG;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Fenetre {
    private JFrame frame;


    public Fenetre(){
        frame = new JFrame();
        frame.setTitle("Colt Express");

        frame.setLayout(new FlowLayout());

        /*grille = new VueGrille(modele);
        frame.add(grille);
        commandes = new VueCommandes(modele);
        frame.add(commandes);*/

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
