import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Terrain extends Observable {
    //private int NB_WAGONS = 4,NB_PERS = 1;

    //Train train = new Train(NB_WAGONS);

    //plateforme avec 1 train n joueurs et fixed nb pnj
    //Personnages personnages = new Personnages("Wyatt");
    //tab avec nb pers et tab avec leur nom pour faire des personngaes ca correctement
    private ArrayList<Train> tr = new ArrayList<>();
    public Terrain(Train train){

        for (int i = 0; i <= 1; i++) {
            this.tr.add(train);
        }

    }
    public int getSize(){
        return this.tr.size();
    }
    public Train getContent(int i){
        return this.tr.get(i);
    }



}
