import java.util.Random;

public class Butin {
    public int bourses,magots,bijoux;
    //int argent pour les personanges
    public Butin(int bourses,int bijoux,int magots){
        this.bijoux = bijoux;
        this.bourses = bourses;
        this.magots = magots;
    }

    public int getMoneyMagot(){
        return 1000;
    }
    public int getMoneyBijoux(){
        return bijoux*500;
    }
    public int getMoneyBourses(){
        int v = 0;
        for(int i = 0; i < bourses; i++){
            v += new Random().nextInt(501);
        }
        return v;
    }
}
