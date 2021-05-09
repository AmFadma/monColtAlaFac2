import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Random;
import java.util.Scanner;

public class Action implements ActionListener  {

    Train train;
    int counter = 3; // variable pour les actions, les faires dans l'ordre et reset la liste
    public Action(Train train){
        this.train = train;
    }


    public void haut(Personnages perso){
        //Personnages perso = train.personnages.get(i);
        if (perso.pos_toît == 0){
            System.out.println(perso.nom+" est deja sur le toit.");
        } else {
            perso.pos_toît = 0;
            System.out.println(perso.nom+" grimpe sur le toit.");
        }
    }

    public void bas(Personnages perso){
        //Personnages perso = train.personnages.get(i);
        if (perso.pos_toît == 1){
            System.out.println(perso.nom+" est deja dans le wagon.");
        } else {
            perso.pos_toît = 1;
            System.out.println(perso.nom+" descend du toit.");
        }
    }

    public void avant(Personnages perso){
        //Personnages perso = train.personnages.get(i);
        if( perso.pos_wag == train.taille-1){
            System.out.println(perso.nom+" est deja dans le premier wagon.");
        } else {
            perso.pos_wag += 1;
            System.out.println(perso.nom+"  avance.");
        }
    }

    public void arriere(Personnages perso){ // avant on fait int i et on prenait le perso ici
        //Personnages perso = train.personnages.get(i);
        if(perso.pos_wag == 0){
            System.out.println(perso.nom+" est deja dans le dernier wagon.");
        } else {
            perso.pos_wag -=1;
            System.out.println(perso.nom+" recule.");
        }
    }

    public void déplacementM(Marshall m){
        int direction = new Random().nextInt((2-1)+1)+1;
        if(direction == 1 && m.pos_wag == train.taille-1){ //1 avance et 2 recule
            direction = 2;
        }else if(direction == 2 && m.pos_wag == 0){
            direction =1;
        }
        boolean b = 0+(10-0)*new Random().nextDouble() <=m.Nervosité*10;
        if(b){
            if(direction == 1){
                avant(m);
            }else if(direction == 2){
                arriere(m);
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //for (String s : train.listeAction){System.out.println(s);} pour tester
        //pour faire le if faire un variable globale count qui compte 3 par 3 les actions cf vocal
        /*System.out.println(train.marshall.pos_toît + " "+train.marshall.pos_wag); test pour vérifier
        les déplacements du marshall
         */
        déplacementM(train.marshall);
        System.out.println(train.marshall.pos_toît + " "+train.marshall.pos_wag);
        for(int j = 0, n=0 ; n < 2; n++,j+=counter){
            if(train.listeAction.get(j) == "bas"){
                bas(train.personnages.get(n)); // ou bas(j/3)
            }else if (train.listeAction.get(j) == "haut"){
                haut(train.personnages.get(n)); // ou haut(j/3)
            }
            else if (train.listeAction.get(j) == "avant"){
                avant(train.personnages.get(n)); // ou avant(j/3)
            }
            else if (train.listeAction.get(j) == "arriere"){
                arriere(train.personnages.get(n)); // ou arriere(j/3)
            }
            else if (train.listeAction.get(j) == "braquage"){
                braquage(train.personnages.get(n)); // ou arriere(j/3)
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
                System.out.println("le gagnant est "+ train.personnages.get(winner).nom);
            }
            System.exit(0);
        }
    }
    public void braquage(Personnages perso){
        if(train.getWagon(perso.pos_toît,perso.pos_wag).Nb_Butin !=0 && perso.pos_toît == 1){
            int bij=train.getWagon(perso.pos_toît,perso.pos_wag).butin.bijoux;
            int brs =train.getWagon(perso.pos_toît,perso.pos_wag).butin.bourses;
            int mag =train.getWagon(perso.pos_toît,perso.pos_wag).butin.magots;


            if(bij !=0 && brs !=0 && mag!=0){ //cas1 1 de chaque mini
                int type = new Random().nextInt((3-1)+1)+1;
                if(type == 1){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bourses -=1;
                    perso.butin.bourses +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole une bourse");

                }else if(type == 2){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bijoux -=1;
                    perso.butin.bijoux +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un bijoux");
                }else if(type == 3){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.magots -=1;
                    perso.butin.magots +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un magot");
                }
            }
            else if(bij ==0 && brs !=0 && mag==0){ //cas 2 que bourses
                train.getWagon(perso.pos_toît,perso.pos_wag).butin.bourses -=1;
                perso.butin.bourses +=1;
                System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole une bourse");
            }
            else if(bij !=0 && brs ==0 && mag==0){//cas 3 que bij
                train.getWagon(perso.pos_toît,perso.pos_wag).butin.bijoux -=1;
                perso.butin.bijoux +=1;
                System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un bijoux");
            }
            else if(bij ==0 && brs ==0 && mag!=0){ //cas 4 que mag
                train.getWagon(perso.pos_toît,perso.pos_wag).butin.magots -=1;
                perso.butin.magots +=1;
                System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un magot");
            }
            else if(brs ==0){ // cas 5  sans bourses
                int type = new Random().nextInt((2-1)+1)+1;
                if(type == 1){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bijoux -=1;
                    perso.butin.bijoux +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un bijoux");
                }else if(type == 2){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.magots -=1;
                    perso.butin.magots +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un magot");
                }
            }
            else if(bij ==0){// cas 6  sans bij
                int type = new Random().nextInt((2-1)+1)+1;
                if(type == 1){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bourses -=1;
                    perso.butin.bourses +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole une bourse");
                }else if(type == 2){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.magots -=1;
                    perso.butin.magots +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un magot");
                }
            }
            else if(mag == 0){// cas 7  sans mag
                int type = new Random().nextInt((2-1)+1)+1;
                if(type == 1){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bijoux -=1;
                    perso.butin.bijoux +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole un bijoux");
                }else if(type == 2){
                    train.getWagon(perso.pos_toît,perso.pos_wag).butin.bourses -=1;
                    perso.butin.bourses +=1;
                    System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+" et vole une bourse");
                }
            }

            //System.out.println(perso.nom+" braque le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon);
        }else{
            System.out.println("le wagon numéro " + train.getWagon(perso.pos_toît,perso.pos_wag).num_wagon+ " est vide");
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