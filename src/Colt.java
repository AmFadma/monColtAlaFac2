import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colt {



    public static void main(String[] args) {
        int NB_WAGONS = 4;
        int NB_PERS = 1;
        Personnages personnages = new Personnages("Wyatt");
        Train train = new Train(NB_WAGONS,personnages);
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