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
    public void action(){
        String a;
        if(userInput.hasNextLine()){
            a = userInput.nextLine();
            Direction dir = Direction.valueOf(a);
            if( dir== Direction.AVANT && pos_wag != 0){
                pos_wag -=1;
            }else if(dir== Direction.HAUT){
                pos_toît = true ;
            }else if(dir== Direction.ARRIERE && pos_wag != 4){
                pos_wag +=1;
            }else if(dir== Direction.BAS){
                pos_toît = false;
            }else{
                System.out.println("pas d'actions possibles");
            }
        }
    }
    //userInput
    public void update(){
        action();
        System.out.println(pos_wag+"  "+pos_toît );
    }
}
