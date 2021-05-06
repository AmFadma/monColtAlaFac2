import java.util.Scanner;
//import java.util.*;
public class Personnages {
    public  String nom;
    public int pos_wag;
    public int pos_toît=0;
    Scanner userInput = new Scanner(System.in);
    public Butin butin;

    public Personnages(String nom) {
        this.nom = nom;
        this.pos_wag= 4;
        this.butin = new Butin(0 ,0,0);
    }

    public int getThune(){
        return butin.bijoux* butin.getMoneyBijoux() + butin.bourses* butin.getMoneyBourses() + butin.magots* butin.getMoneyMagot();
    }

    /*
    on peut faire une classe action avec un joueur auteur de l'action et un receveur
    donc après un tableau d'action pour les faire dans l'ordre ?
    */


    public void tir(Direction dir){
        // a mettre dans action
    }
    //userInput
    public void update(){
        //action();
        //System.out.println(pos_wag+"  "+pos_toît );
    }
}
