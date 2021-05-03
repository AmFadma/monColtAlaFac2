import java.util.ArrayList;

public class Train {
    public final int taille;
    public ArrayList<Wagon> train = new ArrayList<>();

    public Train(int taille){
        this.taille = taille;
        for (int i = 0; i < this.taille; i++) {
            for (int j = 0; j< this.taille ; j++){
                this.train.add(new Wagon(i,j));
            }


        }//tab de wagon cf cours
    }
    public int getTaille(){
        return this.taille;
    }
}
