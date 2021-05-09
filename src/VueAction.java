import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class VueAction extends JPanel{

    private Train train;
    public  GridBagConstraints gc;
    int i=0 ;
    public VueAction(Train train){
        this.train=train;
        this.setLayout(new GridBagLayout());

        gc = new GridBagConstraints();
        gc.weightx = 4;
        //gc.weighty = 3;


        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(0, 1, 0, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;



        JButton bas = new JButton("Depl v");
        gc.gridx = 1;
        gc.gridy = 2;
        gc.gridwidth = 2;

        this.add(bas,gc);

        JButton haut = new JButton("Depl ^");
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 2;
        this.add(haut,gc);

        JButton avant = new JButton("Depl >");
        gc.gridx = 2;
        gc.gridy = 1;

        this.add(avant,gc);

        JButton arriere = new JButton("< Depl");
        gc.gridx = 0;
        gc.gridy = 1;
        this.add(arriere,gc);

        JButton ButAction = new JButton("ACTION");
        gc.gridx = 3;
        gc.gridy = 1;

        this.add(ButAction,gc);
        Action a = new Action(train);


        JButton braquage = new JButton("Braquage");
        gc.gridx = 3;
        gc.gridy = 2;
        this.add(braquage,gc);

        JButton tir = new JButton("TIR");
        gc.gridx = 3;
        gc.gridy = 0;
        this.add(tir,gc);

        bas.addActionListener(e -> train.listeAction.add("bas"));
        haut.addActionListener(e -> train.listeAction.add("haut"));
        avant.addActionListener(e -> train.listeAction.add("avant"));
        arriere.addActionListener(e -> train.listeAction.add("arriere"));
        braquage.addActionListener(e -> train.listeAction.add("braquage"));
        tir.addActionListener(e -> train.listeAction.add("tir"));

        ButAction.addActionListener(a);
        /*for(Personnages p : train.personnages){

            for(int j=0; j < 3; j++){

            }
        }*/
        //if a faire pour lock les boutons si tab < train.personnages.size() * 3 ca:
        /*if(train.listeAction.size()  < train.personnages.size() * 3){
            bas.addActionListener(e -> train.listeAction.add("bas"));
            haut.addActionListener(e -> train.listeAction.add("haut"));
            avant.addActionListener(e -> train.listeAction.add("avant"));
            arriere.addActionListener(e -> train.listeAction.add("arriere"));
        }
        if(train.listeAction.size() < 0) {
            ButAction.addActionListener(a);
        }*/
        //sinon ca
    }
}
