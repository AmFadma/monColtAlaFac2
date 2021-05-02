import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VueTRAIN extends JPanel implements Observer{
    private Terrain terrain;

    public VueTRAIN(Terrain terrain){
        this.terrain = terrain;
        terrain.addObserver(this);
        Dimension dim = new Dimension(400,200);
        this.setPreferredSize(dim);
    }
    public void update(){
        repaint();
    }
}
