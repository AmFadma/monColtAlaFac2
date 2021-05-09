public class Wagon  {

    public final int num_wagon; // mit en final pour ne jamais changer le num du wagon
    public final int etage_wagon;
    public final String nom_wagon; // idem pour le nom du wagon

    public Butin butin;
    public int Nb_Butin;
    public Wagon(int etage_wagon, int num_wagon, int a , int b, int c, int Nb_Butin){
        this.etage_wagon= etage_wagon;
        this.num_wagon = num_wagon;
        this.nom_wagon = "Wagon "+ num_wagon; // par ex "wagon 1"
        this.butin = new Butin(a,b,c);
        this.Nb_Butin = Nb_Butin;
    }



    public int getNum_wagon(){
        return num_wagon;
    } // etre sur de pouvoir recup le bon num de wagon
}