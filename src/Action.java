import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Scanner;

public class Action implements ActionListener  {

    Train train;
    int counter = 3; // variable pour les actions, les faires dans l'ordre et reset la liste
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
        //for (String s : train.listeAction){System.out.println(s);} pour tester
        //pour faire le if faire un variable globale count qui compte 3 par 3 les actions cf vocal
           for(int j = 0, n=0 ; n < 2; n++,j+=counter){
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
           counter-=1;
       //reset du tabeau d'actions
        train.listeAction.remove( 0);
        train.listeAction.remove( counter);
        //for (String s : train.listeAction){System.out.println(s);} pour tester

       //décompte des tours de jeux
       if (train.listeAction.size() == 0){
           train.nbTours-=1;
           train.listeAction = new ArrayList<>();
           counter = 3;
       }

       //winner
        if(train.nbTours == 0) {
            int winner = train.winner();
            if (winner == -1){
                System.out.println("wow égalité");
            }else{
                System.out.println("le gagnant est "+ train.personnages.get(winner));
            }
            System.exit(0);
        }


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