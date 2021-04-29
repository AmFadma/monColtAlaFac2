import java.util.ArrayList;

public class Train {
    private final int taille;
    static int compteur = 0;
    private ArrayList<Wagon> train = new ArrayList<>();

    public Train(int taille){
        this.taille = taille;
        for (int i = 0; i < this.taille; i++) {
            this.train.add(new Wagon()); // retiré le i du wagon (i) psk pas utile et plus d'erreur dans wagon mntn
            compteur ++; // ajouté un compteur pour avoir le nom du wagon ex : "Wagon 4"
        }
    }
    public int getTaille(){
        return this.taille;
    }
}
