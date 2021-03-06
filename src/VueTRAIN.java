import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    public Train train;
    private static final int taille = 90;
    public Personnages p;





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
        super.repaint();
        super.paintComponent(g);
        g.setPaintMode();

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
                g.fillRect(10+j*((8*taille)/train.taille),i*taille,(8*taille)/train.taille,1*taille);
                g.setColor(Color.black);


                g.drawRect(10+j*((8*taille)/train.taille),i*taille,(8*taille)/train.taille,1*taille);
                //tf.setBounds(50,50, 150,20);
                //tf.setText("Joueur 1.");




                //paint(g, modele.getCellule(i, j), (i - 1) * TAILLE, (j - 1) * TAILLE);
            }
        }

        for (int i = 0; i<train.personnages.size();i++) {


            g.drawString(train.personnages.get(i).nom, 100/train.taille+train.personnages.get(i).pos_wag*(8*taille)/train.taille, 40+(2*train.personnages.get(i).pos_toît*((taille/4 )+ (taille/2)))/(train.personnages.size())+i*20);
           

        }


        for (int i = 0; i<train.personnages.size();i++) {
            g.drawString(train.personnages.get(i).nom, 35+i*10*taille/train.personnages.size(), 210);
            g.drawString("Magots : " + train.personnages.get(i).butin.magots, 35+i*10*taille/train.personnages.size(), 235);
            g.drawString("Bijoux : " + train.personnages.get(i).butin.bijoux, 35+i*10*taille/train.personnages.size(), 250);
            g.drawString("Bourses : " + train.personnages.get(i).butin.bourses, 35+i*10*taille/train.personnages.size(), 265);

        }

        for (int j = 0; j<this.train.taille; j++){


                int bourses = train.getWagon(1,j).butin.bourses;

                int bijoux = train.getWagon(1,j).butin.bijoux;
                int magots =train.getWagon(1,j).butin.magots;
                int butin = bourses+bijoux+magots;

                if (bourses != 0){

                    for(int k = 0; k<bourses;k++){
                        g.drawString("Bourse",(taille+40+(j)*(8*taille)/train.taille), 130 + 50*k/butin);
                    }

                }
                if (bijoux != 0){
                    for(int k = 0; k<bijoux;k++){
                        g.drawString("Bijoux",(taille+40+(j)*(8*taille)/train.taille), 130+(15*bourses)+ 50*k/butin);

                    }

                }
                if (magots != 0){

                        g.drawString("Magot",(taille+40+(j)*(8*taille)/train.taille), 150/butin);

                }

        }

        g.drawString("Marshall",400/train.taille+train.marshall.pos_wag*(8*taille)/train.taille, 40+(2*train.marshall.pos_toît*((taille/4 )+ (taille/2)))/(train.personnages.size()));





    }
}
