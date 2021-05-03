import java.util.ArrayList;

public class Train extends Observable{
    public final int taille;
    public ArrayList<ArrayList<Wagon>> train = new ArrayList<>();

    public Train(int taille){
        this.taille = taille;
        for (int i = 0; i < 2; i++) {
            train.add(new ArrayList<>());
            for (int j = 0; j< this.taille ; j++){
                train.get(i).add(new Wagon(i,j));
            }
        }//tab de wagon cf cours
    }
    public int getSize(){
        return this.taille;
    }

    public Wagon getWagon(int i, int j){
        return train.get(i).get(j);
    }
}
