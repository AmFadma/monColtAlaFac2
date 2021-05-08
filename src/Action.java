import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Action implements ActionListener  {

    Train train;

    public Action(Train train){
        this.train = train;
    }
    public void haut(int i){
        Personnages perso = train.personnages.get(i);
        if (perso.pos_toît == 0){
            System.out.println(perso.nom+" est deja sur le toit.");
        } else {
            perso.pos_toît = 0;
            System.out.println(perso.nom+" grimpe sur le toit.");
        }
    }

    public void bas(int i){
        Personnages perso = train.personnages.get(i);
        if (perso.pos_toît == 1){
            System.out.println(perso.nom+" est deja dans le wagon.");
        } else {
            perso.pos_toît = 1;
            System.out.println(perso.nom+" descend du toit.");
        }
    }

    public void avant(int i){
        Personnages perso = train.personnages.get(i);
        if( perso.pos_wag == 0){
            System.out.println(perso.nom+" est deja dans le premier wagon.");
        } else {
            perso.pos_wag -= 1;
            System.out.println(perso.nom+"  avance.");
        }
    }

    public void arriere(int i){
        Personnages perso = train.personnages.get(i);
        if(perso.pos_wag == train.taille-1){
            System.out.println(perso.nom+" est deja dans le dernier wagon.");
        } else {
            perso.pos_wag += 1;
            System.out.println(perso.nom+" recule.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       for(int i = 0; i < 3; i++){
           for(int j = i, n=0 ; n < train.personnages.size(); n++,j+=3){
               if(train.listeAction.get(j) == "bas"){
                   bas(n); // ou bas(j/3)
               }else if (train.listeAction.get(j) == "haut"){
                   haut(n); // ou haut(j/3)
               }
               else if (train.listeAction.get(j) == "avant"){
                   avant(n); // ou avant(j/3)
               }
               else if (train.listeAction.get(j) == "arriere"){
                   arriere(n); // ou arriere(j/3)
               }
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