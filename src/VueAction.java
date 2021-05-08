import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class VueAction extends JPanel{

    private Train train;
    public  GridBagConstraints gc;
    public static JPanel panel;


    public VueAction(Train train){
        this.train=train;

        panel = new JPanel();
        panel.setLayout(new GridBagLayout());



        //buttonProp();


    //}
    //public void buttonProp (){
        gc = new GridBagConstraints();

        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.insets = new Insets(1, 1, 0, 1);
        gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        gc.weightx = 3;
        //gc.weighty = 3;
       // gc.gridheight = 1;

        JButton bas = new JButton("Depl v");
        //bas.setBounds (100,100,100,20);
        gc.gridx = 1;
        gc.gridy = 2;
        gc.gridwidth = 2;
        //gc.ipadx =3;
        //gc.insets = new Insets(1,1,1,1);
        panel.add(bas,gc);


        JButton haut = new JButton("Depl ^");
        gc.gridx = 1;
        gc.gridy = 0;
        panel.add(haut,gc);


        JButton avant = new JButton("Depl >");
        gc.gridx = 2;
        gc.gridy = 1;
        panel.add(avant,gc);

        JButton arriere = new JButton("< Depl");
        gc.gridx = 0;
        gc.gridy = 1;
        panel.add(arriere,gc);


        Action a = new Action(train);
        bas.addActionListener(a);
        haut.addActionListener(a);
        avant.addActionListener(a);
        arriere.addActionListener(a);

    }
}
