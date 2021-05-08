import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colt {



    public static void main(String[] args) {
        int NB_WAGONS = 4;

        //Personnages personnages = new Personnages("Wyatt");
        String[] names = {"joueur1"};
        Train train = new Train(NB_WAGONS,names);
        //plateforme avec 1 train n joueurs et fixed nb pnj
        //Personnages personnages = new Personnages("Wyatt");
        //Terrain t = new Terrain(train);

        Fenetre f = new Fenetre(train);
        VueTRAIN vueTRAIN = new VueTRAIN(train);
        VueAction vueAction = new VueAction(train);
        /*personnages.update();
        personnages.update();*/
        //System.out.println(personnages.getThune());
        //Action action = new Action(personnages,train);
        //action.action();
        // EventQueue.invokeLater(() -> {
        /** Voici le contenu qui nous intéresse. */
        // Terrain terrain = new Terrain(train);
        //VueTRAIN vue = new VueTRAIN(terrain);
        //});
    }
}