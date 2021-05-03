import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    public Terrain terrain;

    public VueTRAIN(Terrain terrain){
        this.terrain = terrain;
        terrain.addObserver(this);
        Dimension dim = new Dimension(400,200);
        this.setPreferredSize(dim);
    }
    public void update(){
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.repaint();
        /** Pour chaque cellule... */
        for (int i = 1; i <= this.terrain.getSize(); i++) {
            for (int j = 1; j <= this.terrain.getContent(i).getTaille(); j++) {
                /**
                 * ... Appeler une fonction d'affichage auxiliaire.
                 * On lui fournit les informations de dessin [g] et les
                 * coordonnées du coin en haut à gauche.
                 */
                if(i == 0){
                    g.setColor(Color.MAGENTA);
                }else{
                    g.setColor(Color.WHITE);
                }
                g.fillRect(i,j,200,100);
                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }
    }
}
