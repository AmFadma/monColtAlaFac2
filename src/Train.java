import java.util.ArrayList;
import java.util.Random;

public class Train extends Observable{
    public final int taille;
    public ArrayList<ArrayList<Wagon>> train = new ArrayList<>();
    public ArrayList<Personnages> personnages = new ArrayList<>();
    public int nbTours = 5; //a mettre dans le main à l'avenir
    ArrayList<String> listeAction= new ArrayList<>();

    public Marshall marshall = new Marshall("marshall",0,1);

    public Train(int taille, String[] s){
        this.taille = taille;
        for (int i = 0; i < 2; i++) {
            train.add(new ArrayList<>());
            for (int j = 0; j < this.taille ; j++){
                if(i == this.taille-1){
                    train.get(i).add(new Wagon(i,j,0,0,1,1));
                }else{
                    //int nbItem = new Random().nextInt((4 - 1) + 1) + 1;
                    train.get(i).add(new Wagon(i,j,0,0,0,new Random().nextInt((4-1) +1) +1) );
                    if(i>0){
                        for(int x = 0; x < train.get(i).get(j).Nb_Butin; x++){
                            int type = new Random().nextInt((2-1)+1)+1;
                            if(type == 1){
                                train.get(i).get(j).butin.bourses +=1;
                            }else if(type == 2){
                                train.get(i).get(j).butin.bijoux +=1;
                            }
                        }
                    }
                }
            }


        }//tab de wagon cf cours


        for (String names : s){
            personnages.add(new Personnages(names,3,0));
        }
        /*System.out.println(train.get(1).get(3).Nb_Butin + " "+ train.get(1).get(3).butin.bijoux + " "+ train.get(1).get(3).butin.bourses);
        pour test la créations des butins dans les wagons
         */
    }
    public int getSize(){
        return this.taille;
    }

    public Wagon getWagon(int i, int j){
        return train.get(i).get(j);
    }

    public int winner(){
        int winnerId =-1;
        int winnerMoney=0 ;
        for (int i =0; i< personnages.size();i++){
            int money = personnages.get(i).getThune();
            if(money > winnerMoney){
                winnerMoney=money;//optionnel
                winnerId = i;
            }
        }
        return winnerId;
    }

}