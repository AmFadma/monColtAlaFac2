import java.util.Scanner;
//import java.util.*;
public class Personnages {
    private  String nom;
    private int pos_wag;
    private boolean pos_toît=true;
    Scanner userInput = new Scanner(System.in);

    public Personnages(String nom) {
        this.nom = nom;
        this.pos_wag= 4;
    }

    /*
    on peut faire une classe action avec un joueur auteur de l'action et un receveur
    donc après un tableau d'action pour les faire dans l'ordre ?
    */
    public void action(){
        String a;
        if(userInput.hasNextLine()){
            a = userInput.nextLine();
            Direction dir = Direction.valueOf(a);
            if( dir== Direction.AVANT ){
                if( pos_wag == 0){
                    System.out.println("Wyatt est deja dans le premier wagon.");
                } else {
                    pos_wag -= 1;
                }
            }else if(dir== Direction.HAUT ){
                if (pos_toît == true){
                    System.out.println("Wyatt est deja sur le toit.");
                } else {

                    pos_toît = true;
                    System.out.println("Wyatt grimpe sur le toit.");

                }
            }else if(dir== Direction.ARRIERE ){
                if(pos_wag == 4){
                    System.out.println("Wyatt est deja dans le dernier wagon.");
                } else {
                    pos_wag += 1;

                }
            }else if(dir== Direction.BAS){
                if (pos_toît == false){
                    System.out.println("Wyatt est deja dans wagon.");
                } else {
                    pos_toît = false;
                    System.out.println("Wyatt descend du toit.");
                }
            }else{
                System.out.println("pas d'actions possibles");
            }
        }
    }


    public void tir(Direction dir){
        // a mettre dans action
    }
    //userInput
    public void update(){
        action();
        //System.out.println(pos_wag+"  "+pos_toît );
    }
}
