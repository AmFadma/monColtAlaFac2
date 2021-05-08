//package IG;
import javax.swing.*;
import java.awt.*;

public class Fenetre {
    public JFrame frame;

    public VueTRAIN vt;
    public JPanel p;

    public VueAction va;

    public Fenetre(Train t){

        frame = new JFrame();
        p = new JPanel(new GridBagLayout());

        frame.setTitle("Colt Express");


       frame.setLayout(new GridLayout(2,1,0,0));

      GridBagConstraints gc;
       gc = new GridBagConstraints();
        //gc.fill = GridBagConstraints.HORIZONTAL;
        //gc.insets = new Insets(1, 1, 1, 1);
       // gc.ipady = gc.anchor = GridBagConstraints.CENTER;
        //gc.weightx = 1;
        //gc.weighty = 1;




        //JButton bas = new JButton("Depl v");
       // bas.setBounds (100,100,100,20);
       // frame.add(bas,gc);

        //gc.gridx = 1;
       // gc.gridy = 0;



        va= new VueAction(t);


        va.gc.gridx = 0;
        va.gc.gridy = 0;
        va.gc.gridheight = 1;
        p.add(va,gc);
        //frame.add(va,gc);

        frame.add(va.panel);
        vt= new VueTRAIN(t);
       frame.add(vt);






        //va.buttonProp();
        /*final TextField tf;
        tf=new TextField();
        tf.setBounds(50,50, 150,20);
        tf.setText("Joueur 1.");
        frame.add(tf);*/




        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}