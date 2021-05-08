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


        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(1, 1, 0, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 3;


        JButton bas = new JButton("Depl v");
        gc.gridx = 1;
        gc.gridy = 2;
        gc.gridwidth = 1;

        this.add(bas,gc);

        JButton haut = new JButton("Depl ^");
        gc.gridx = 1;
        gc.gridy = 0;
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
        this.add(ButAction);

        /*for(Personnages p : train.personnages){

            for(int j=0; j < 3; j++){

            }
        }*/
        bas.addActionListener(e -> train.listeAction.add("bas"));
        haut.addActionListener(e -> train.listeAction.add("haut"));
        avant.addActionListener(e -> train.listeAction.add("avant"));
        arriere.addActionListener(e -> train.listeAction.add("arriere"));
        Action a = new Action(train);
        ButAction.addActionListener(a);
    }
}
