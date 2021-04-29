public class Wagon extends Train {

    public final int num_wagon; // mit en final pour ne jamais changer le num du wagon
    public final String nom_wagon; // idem pour le nom du wagon
    public Wagon(int i){
       super(i);
        this.num_wagon = i;
        this.nom_wagon = "Wagon "+ num_wagon; // par ex "wagon 1"

    }



    public int getNum_wagon(){
        return num_wagon;
    } // etre sur de pouvoir recup le bon num de wagon
}
