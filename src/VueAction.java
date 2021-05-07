import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class VueAction extends JPanel{
    private Train train;
    private int tours;
    public VueAction(Train train){
        this.train=train;
        tours= train.nbTours;
        JButton bas = new JButton("Depl v");
        this.add(bas);

        JButton haut = new JButton("Depl ^");
        this.add(haut);

        JButton avant = new JButton("Depl >");
        this.add(avant);

        JButton arriere = new JButton("< Depl");
        this.add(arriere);

        JButton faireAction = new JButton("ACTION");
        this.add(faireAction);

        /*for (int i =0; i < tours;i++){
            ArrayList<Action> action = new ArrayList<>(train.personnages.size() * tours);
            /*int j=0; //coordoné
            for (Personnages p : train.personnages){
                Action a = new Action(train,p);
                action.add(a);
            }
            Action a = new Action(train,train.personnages.get(1));
            action.add(a);
            ArrayList<ActionEvent> e =  new ArrayList<>();
            e.add(bas.addActionListener(a));
            if(bas.addActionListener(a)){
                e.add(bas);
            }
            for(Action a : action){

            }*/
        Action a = new Action(train,train.personnages.get(0));
        bas.addActionListener(a);
        haut.addActionListener(a);
        avant.addActionListener(a);
        arriere.addActionListener(a);
        //}
        //Action a = new Action(train);

    }
}
