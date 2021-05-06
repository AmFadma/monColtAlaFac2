<<<<<<< HEAD
import java.util.Scanner;
public abstract class Action {
    public Personnages perso;
    public Train train;
    Scanner userInput = new Scanner(System.in);
    public Action(Personnages perso, Train train){
        this.perso = perso;
        this.train = train;
    }
    public void deplacement(){
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Action implements ActionListener {
    Scanner userInput = new Scanner(System.in);
    Personnages perso;
    Train train;

    public Action(Train train){
        this.perso = train.p;
        this.train = train;


    }
    public void haut(){
        if (perso.pos_toît == 0){
            System.out.println("Wyatt est deja sur le toit.");
        } else {
            perso.pos_toît = 0;
            System.out.println("Wyatt grimpe sur le toit.");
        }
    }

    public void bas(){
        if (perso.pos_toît == 1){
            System.out.println("Wyatt est deja dans le wagon.");
        } else {
            perso.pos_toît = 1;
            System.out.println("Wyatt descend du toit.");
        }
    }

    public void avant(){
        if( perso.pos_wag == 0){
            System.out.println("Wyatt est deja dans le premier wagon.");
        } else {
            perso.pos_wag -= 1;
            System.out.println("Wyatt  avance.");
        }
    }

    public void arriere(){
        if(perso.pos_wag == train.taille){
            System.out.println("Wyatt est deja dans le dernier wagon.");
        } else {
            perso.pos_wag += 1;
            System.out.println("Wyatt recule.");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bas();
    }


    /*public void action(){
>>>>>>> origin/master
        String a;
        if(userInput.hasNextLine()){
            a = userInput.nextLine();
            Direction dir = Direction.valueOf(a);
            if( dir== Direction.AVANT ){
<<<<<<< HEAD
                if( perso.getPos_wag() == 0){
                    System.out.println("Wyatt est deja dans le premier wagon.");
                } else {
                    this.perso.modifie_Pos_Wag(perso.getPos_wag()-1);
                }
            }else if(dir== Direction.HAUT ){
                if (perso.getPos_toit() == 0){
                    System.out.println("Wyatt est deja sur le toit.");
                } else {

                    perso.modifie_Pos_Toit(0);
=======
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
>>>>>>> origin/master
                    System.out.println("Wyatt grimpe sur le toit.");

                }
            }else if(dir== Direction.ARRIERE ){
<<<<<<< HEAD
                if(perso.getPos_wag() == 4){
                    System.out.println("Wyatt est deja dans le dernier wagon.");
                } else {
                    perso.modifie_Pos_Wag(perso.getPos_wag()-1);

                }
            }else if(dir== Direction.BAS){
                if (perso.getPos_toit() == 1){
                    System.out.println("Wyatt est deja dans wagon.");
                } else {
                    perso.modifie_Pos_Toit(1);
=======
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
>>>>>>> origin/master
                    System.out.println("Wyatt descend du toit.");
                }
            }else{
                System.out.println("pas d'actions possibles");
            }
        }
<<<<<<< HEAD
    }

    //userInput
    public void update(){
        deplacement();
        //System.out.println(pos_wag+"  "+pos_toît );
    }



=======
    }*/
>>>>>>> origin/master
}
