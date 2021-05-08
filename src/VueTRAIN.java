import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    private Train train;
    private static final int taille = 90;
    public Personnages p;
    public final TextField tf;


    // public final static int  taille = 20;
    public VueTRAIN(Train train){
        this.train = train;
        tf=new TextField();


        //JLabel joueur1  = new JLabel(p.nom);
        //JTextField joueur11 = new JTextField();
       // this.add(joueur1);



        this.train.addObserver(this);
        Dimension dim = new Dimension(8*taille+45, 4*taille+45);
        this.setPreferredSize(dim);

    }
    public void update(){
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // for (int j =0 ; j < this.train.taille+1; j++) {

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
                g.fillRect(10+j*2*taille,120+i*taille,2*taille,1*taille);
                g.setColor(Color.black);


                g.drawRect(10+j*2*taille,120+i*taille,2*taille,1*taille);
                tf.setBounds(50,50, 150,20);
                tf.setText("Joueur 1.");


                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }
    }
}
