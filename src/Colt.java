

public class Colt {



    public static void main(String[] args) {
        int NB_WAGONS = 4;
        int NB_PERS = 1;
        Train train = new Train(NB_WAGONS);
        //plateforme avec 1 train n joueurs et fixed nb pnj
        Personnages personnages = new Personnages("Wyatt");
        Terrain t = new Terrain(train);
        Fenetre f = new Fenetre(t);
        personnages.update();

        personnages.update();
    }
}