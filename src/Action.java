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
        String a;
        if(userInput.hasNextLine()){
            a = userInput.nextLine();
            Direction dir = Direction.valueOf(a);
            if( dir== Direction.AVANT ){
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
                    System.out.println("Wyatt grimpe sur le toit.");

                }
            }else if(dir== Direction.ARRIERE ){
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
                    System.out.println("Wyatt descend du toit.");
                }
            }else{
                System.out.println("pas d'actions possibles");
            }
        }
    }

    //userInput
    public void update(){
        deplacement();
        //System.out.println(pos_wag+"  "+pos_toît );
    }



}
