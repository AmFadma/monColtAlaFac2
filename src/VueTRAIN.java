import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    private Train train;
    private static final int taille = 50;

   // public final static int  taille = 20;
    public VueTRAIN(Train train){
        this.train = train;

        this.train.addObserver(this);
        Dimension dim = new Dimension(845, 445);
        this.setPreferredSize(dim);
    }
    public void update(){
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < 2; i++) {
            for (int j =0 ; j < this.train.taille; j++) {
                /**
                 * ... Appeler une fonction d'affichage auxiliaire.
                 * On lui fournit les informations de dessin [g] et les
                 * coordonnées du coin en haut à gauche.
                 */
                if(i == 1){
                    g.setColor(Color.LIGHT_GRAY);

                }else{
                    g.setColor(Color.WHITE);


                }
                //g.fillRect(i*200,j*100,200,100);
                g.fillRect(20+j*200,120+i*100,200,100);
                g.setColor(Color.black);


                g.drawRect(20+j*200,120+i*100,200,100);


                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }
    }
}
