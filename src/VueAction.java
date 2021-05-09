import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class VueAction extends JPanel{

    private Train train;
    public  GridBagConstraints gc;
    int i=0 ;
    public VueAction(Train train){
        this.train=train;
        this.setLayout(new GridBagLayout());


       // this.setBorder(new LineBorder(Color.cyan,10 ));
        //this.setBackground(Color.PINK);

        gc = new GridBagConstraints();
        gc.weightx = 0.6;
        gc.weighty = 0;



        gc.fill = GridBagConstraints.BOTH;
        gc.insets = new Insets(1, 1, 1, 1);
        //gc.ipady =
        gc.anchor = GridBagConstraints.NORTH;

        gc.ipady = 0;
        gc.ipadx = 10;



        JButton bas = new JButton("Depl v");
        gc.gridx = 2;
        gc.gridy = 2;
        gc.weightx = 0.6;


        //gc.gridwidth = 3;

        this.add(bas,gc);

        JButton haut = new JButton("Depl ^");
        gc.gridx = 2;
        gc.gridy = 0;
        gc.weightx = 0.6;
        //gc.gridwidth = 2;
        this.add(haut,gc);

        JButton avant = new JButton("Depl >");
        gc.gridx = 3;
        gc.gridy = 1;
        gc.weightx = 0.1;

        this.add(avant,gc);

        JButton arriere = new JButton("< Depl");
        gc.gridx = 1;
        gc.gridy = 1;
        gc.weightx = 0.1;

        this.add(arriere,gc);

        JButton ButAction = new JButton("ACTION");
        gc.gridx = 7;
        gc.gridy = 2;
        gc.weightx = 0.1;

        this.add(ButAction,gc);
        Action a = new Action(train);



        JButton braquage = new JButton("Braquage");
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 0.1;
        this.add(braquage,gc);


        JButton tirArriere = new JButton("< Tir");
        gc.gridx = 4;
        gc.gridy = 1;
        gc.weightx = 0.1;
        this.add(tirArriere,gc);

        JButton tirAvant = new JButton("Tir >");
        gc.gridx = 6;
        gc.gridy = 1;
        gc.weightx = 0.1;
        this.add(tirAvant,gc);

        JButton tirBas = new JButton("Tir v");
        gc.gridx = 5;
        gc.gridy = 2;
        gc.weightx = 0.6;
        this.add(tirBas,gc);

        JButton tirHaut = new JButton("Tir ^");
        gc.gridx = 5;
        gc.gridy = 0;
        gc.weightx = 0.6;
        this.add(tirHaut, gc);





        bas.addActionListener(e -> train.listeAction.add("bas"));
        haut.addActionListener(e -> train.listeAction.add("haut"));
        avant.addActionListener(e -> train.listeAction.add("avant"));
        arriere.addActionListener(e -> train.listeAction.add("arriere"));
        braquage.addActionListener(e -> train.listeAction.add("braquage"));
        tirHaut.addActionListener(e -> train.listeAction.add("tirHaut"));
        tirBas.addActionListener(e -> train.listeAction.add("tirBas"));
        tirArriere.addActionListener(e -> train.listeAction.add("tirArriere"));
        tirAvant.addActionListener(e -> train.listeAction.add("tirAvant"));



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
