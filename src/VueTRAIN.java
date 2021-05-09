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


            g.drawString(train.personnages.get(i).nom, 820/train.taille+(train.personnages.size()-train.personnages.get(i).pos_wag)*(8*taille)/train.taille, 40+(2*train.personnages.get(i).pos_toît*((taille/4 )+ (taille/2)))/(train.personnages.size())+i*20);
        }


        for (int i = 0; i<train.personnages.size();i++) {
            g.drawString(train.personnages.get(i).nom, 35+i*10*taille/train.personnages.size(), 210);
            g.drawString("Magots : " + train.personnages.get(i).butin.magots, 35+i*10*taille/train.personnages.size(), 235);
            g.drawString("Bijoux : " + train.personnages.get(i).butin.bijoux, 35+i*10*taille/train.personnages.size(), 250);
            g.drawString("Bourses : " + train.personnages.get(i).butin.bourses, 35+i*10*taille/train.personnages.size(), 265);

        }
        for (int j = 0; j<this.train.taille; j++){
            ArrayList<String>b = new ArrayList<>();
            b.add("bourses");
            b.add("bijoux");
            b.add("magots");
                int bourses = train.getWagon(1,j).butin.bourses;
                System.out.println(j);
                System.out.println(bourses);
                int bijoux = train.getWagon(1,j).butin.bijoux;
                int magots =train.getWagon(1,j).butin.magots;
                int butin = bourses+bijoux+magots;
            //g.drawString("coucou",(taille+150+j*2*(8*taille)/train.taille)/butin, 145);
                if (bourses != 0){

                    for(int k = 0; k<bourses;k++){
                        g.drawString("Bourse",(taille+150+(j-1)*2*(8*taille)/train.taille)/butin, 145 + 30*k/butin);
                    }

                }
                if (bijoux != 0){
                    for(int k = 0; k<bijoux;k++){
                        g.drawString("Bijoux",(taille+150+(j-1)*2*(8*taille)/train.taille)/butin, 145+(10*bourses)+ 30*k/butin);

                    }

                }



        }

        /*g.drawString(train.personnages.get(1).nom,335,320);
        g.drawString("Magots : "+ train.personnages.get(1).butin.magots,335,335);
        g.drawString("Bijoux : "+ train.personnages.get(1).butin.bijoux,335,350);
        g.drawString("Bourses : "+ train.personnages.get(1).butin.bourses,335,365);

        g.drawString(train.personnages.get(i).nom, 35+i*100, 310+i*10);
            g.drawString("Magots : " + train.personnages.get(i).butin.magots, 35+i*100, 330+i*10);
            g.drawString("Bijoux : " + train.personnages.get(i).butin.bijoux, 35+i*100, 340+i*10);
            g.drawString("Bourses : " + train.personnages.get(i).butin.bourses, 35+i*100, 350+i*10);
        }

         */

        /*g.drawString(train.personnages.get(2).nom,635,320);
        g.drawString("Magots : "+ train.personnages.get(2).butin.magots,635,335);
        g.drawString("Bijoux : "+ train.personnages.get(2).butin.bijoux,635,350);
        g.drawString("Bourses : "+ train.personnages.get(2).butin.bourses,635,365);

         */


    }
}
