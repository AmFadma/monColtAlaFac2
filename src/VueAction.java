import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class VueAction extends JPanel{

    private Train train;
    public  GridBagConstraints gc;




    public VueAction(Train train){
        this.train=train;
        this.setLayout(new GridBagLayout());

        gc = new GridBagConstraints();


        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(0, 1, 0, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 1;


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


        Action a = new Action(train, train.personnages.get(0));
        bas.addActionListener(a);
        haut.addActionListener(a);
        avant.addActionListener(a);
        arriere.addActionListener(a);

    }
}
