import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    public Train train;
    public final static int  taille = 12;
    public VueTRAIN(Train train){
        this.train = train;

        this.train.addObserver(this);
        Dimension dim = new Dimension(taille * train.taille *10,taille * train.taille *10);
        this.setPreferredSize(dim);
    }
    public void update(){
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.repaint();

        for (int i = 0; i < this.train.getSize(); i++) {
            for (int j =0 ; j < this.train.taille; j++) {
                /**
                 * ... Appeler une fonction d'affichage auxiliaire.
                 * On lui fournit les informations de dessin [g] et les
                 * coordonnées du coin en haut à gauche.
                 */
                /*if(i == 1){
                    g.setColor(Color.GRAY);
                    g.drawRect(i*100,j*200,i*100,j*200);
                }else{
                    g.setColor(Color.pink);
                    g.drawRect(i*100,j*200,100,200);

                }
                //g.fillRect(i*200,j*100,200,100);
                g.setColor(Color.black);

                 */
                g.drawRect(i*100,j*200,100,200);


                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }
    }
}
