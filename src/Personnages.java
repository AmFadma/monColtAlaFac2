import java.util.Scanner;
//import java.util.*;
public class Personnages {
    private  String nom;
    private int position;
    Scanner userInput = new Scanner(System.in);
    public Personnages(String nom) {
        this.nom = nom;
        this.position = 0;
    }
    public void action(String a){
        if(userInput.hasNextLine)
        if(a == 0){

        }else if(a ==1){

        }else if(a ==2){

        }else if(a ==3){

        }else{
            System.out.println("pas d'actions possibles");
        }
    }
}
