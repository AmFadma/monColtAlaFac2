import java.util.ArrayList;

public class Train {
    private int taille;
    private ArrayList<Wagon> tr = new ArrayList<>();

    public Train(int taille){
        this.taille = taille;
        for (int i = 0; i < this.taille; i++) {
            this.tr.add(new Wagon(i));
        }
    }
}
