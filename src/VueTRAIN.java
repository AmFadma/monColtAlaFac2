import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    private Train train;
    private static final int taille = 90;
    public Personnages p;
   // public final TextField tf;
   JLabel joueur1  = new JLabel("perso");



    // public final static int  taille = 20;
    public VueTRAIN(Train train){
        this.train = train;
        //tf=new TextField();



        //JTextField joueur11 = new JTextField();




        this.train.addObserver(this);
        Dimension dim = new Dimension(8*taille+45, 4*taille+45);
        this.setPreferredSize(dim);



    }
    public void update(){
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setPaintMode();
        this.add(joueur1);
        this.joueur1.setAlignmentX(0);
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
                //tf.setBounds(50,50, 150,20);
                //tf.setText("Joueur 1.");




                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }

        g.drawString("Joueur 1",35,150);
        g.drawString("Bandit 1: ",35,320);
        g.drawString("Magots : ",35,335);
        g.drawString("Bijoux : ",35,350);
        g.drawString("Bourses : ",35,365);

        g.drawString("Bandit 2 : ",335,320);
        g.drawString("Magots : ",335,335);
        g.drawString("Bijoux : ",335,350);
        g.drawString("Bourses : ",335,365);

        g.drawString("Bandit 3 : ",635,320);
        g.drawString("Magots : ",635,335);
        g.drawString("Bijoux : ",635,350);
        g.drawString("Bourses : ",635,365);


    }
}
