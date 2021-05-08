import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Action implements ActionListener  {
    Personnages perso;
    Train train;
    ArrayList<String> listeAction;
    public Action(Train train, Personnages pers){
       // this.perso = train.personnages.get(0);
        this.perso = pers;
        this.train = train;
        this.listeAction = new ArrayList<>(train.personnages.size());

    }
    public void haut(){
        if (perso.pos_toît == 0){
            System.out.println(perso.nom+" est deja sur le toit.");
        } else {
            perso.pos_toît = 0;
            System.out.println(perso.nom+" grimpe sur le toit.");
        }
    }

    public void bas(){
        if (perso.pos_toît == 1){
            System.out.println(perso.nom+" est deja dans le wagon.");
        } else {
            perso.pos_toît = 1;
            System.out.println(perso.nom+" descend du toit.");
        }
    }

    public void avant(){
        if( perso.pos_wag == 0){
            System.out.println(perso.nom+" est deja dans le premier wagon.");
        } else {
            perso.pos_wag -= 1;
            System.out.println(perso.nom+"  avance.");
        }
    }

    public void arriere(){
        if(perso.pos_wag == train.taille-1){
            System.out.println(perso.nom+" est deja dans le dernier wagon.");
        } else {
            perso.pos_wag += 1;
            System.out.println(perso.nom+" recule.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       for(String s : listeAction){
           if(s == "bas"){
               bas();
           }else if (s == "haut"){
               haut();
           }
           else if (s == "avant"){
               avant();
           }
           else if (s == "arriere"){
               arriere();
           }
       }
       //tours -=1;
    }


    /* premier test
    public void action(){
        String a;
        if(userInput.hasNextLine()){
            a = userInput.nextLine();
            Direction dir = Direction.valueOf(a);
            if( dir== Direction.AVANT ){
                if( perso.pos_wag == 0){
                    System.out.println("Wyatt est deja dans le premier wagon.");
                } else {
                    perso.pos_wag -= 1;
                }
            }else if(dir== Direction.HAUT ){
                if (perso.pos_toît == 0){
                    System.out.println("Wyatt est deja sur le toit.");
                } else {
                    perso.pos_toît = 0;
                    System.out.println("Wyatt grimpe sur le toit.");
                }
            }else if(dir== Direction.ARRIERE ){
                if(perso.pos_wag == 4){
                    System.out.println("Wyatt est deja dans le dernier wagon.");
                } else {
                    perso.pos_wag += 1;
                }
            }else if(dir== Direction.BAS){
                if (perso.pos_toît == 1){
                    System.out.println("Wyatt est deja dans wagon.");
                } else {
                    perso.pos_toît = 1;
                    System.out.println("Wyatt descend du toit.");
                }
            }else{
                System.out.println("pas d'actions possibles");
            }
        }
    }*/
}