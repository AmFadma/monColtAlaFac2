import java.util.ArrayList;

public class Train {
    private final int taille;
    private ArrayList<Wagon> train = new ArrayList<>();

    public Train(int taille){
        this.taille = taille;
        for (int i = 0; i < this.taille; i++) {
            this.train.add(new Wagon(i));

        }//tab de wagon cf cours
    }
    public int getTaille(){
        return this.taille;
    }
}
