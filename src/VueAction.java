import javax.swing.*;

public class VueAction extends JPanel{
    private Train train;

    public VueAction(Train train){
        this.train=train;

        JButton bas = new JButton("Depl v");
        this.add(bas);
        JButton haut = new JButton("Depl ^");
        this.add(haut);
        JButton avant = new JButton("Depl >");
        this.add(avant);
        JButton arriere = new JButton("< Depl");
        this.add(arriere);

        Action a = new Action(train);
        bas.addActionListener(a);
        haut.addActionListener(a);
        avant.addActionListener(a);
        arriere.addActionListener(a);
    }
}
