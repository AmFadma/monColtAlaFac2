import java.util.Scanner;
//import java.util.*;
public class Personnages {
    public  String nom;
    public int pos_wag;
    public int pos_toît;
    Scanner userInput = new Scanner(System.in);
    public Butin butin;
    public int Nb_Balles = 6;

    public Personnages(String nom, int pos_wag, int pos_toît ) {
        this.nom = nom;
        this.pos_wag= pos_wag;
        this.pos_toît = pos_toît;
        this.butin = new Butin(0 ,0,0);
    }

    public int getThune(){
        return butin.bijoux* butin.getMoneyBijoux() + butin.bourses* butin.getMoneyBourses() + butin.magots* butin.getMoneyMagot();
    }
}
