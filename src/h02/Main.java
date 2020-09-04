package h02;

import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    @Override
    public void init() {
        setBackground(Color.blue);


    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.drawString("Victor",50,60);
        g.setColor(Color.red);
        g.drawString("Bijvoets",50,80);
    }
}
