package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main extends Applet{
    Button button;
    String screentext;

    public void init(){
        screentext = "Doet deze knop wel iets?";
        button = new Button("Klik op mij");
        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);
        add(button);

    }

    public void paint(Graphics g){
        g.drawString(screentext,50,50);
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            screentext = "Ja hij doet het";
            repaint();
        }
    }

}
