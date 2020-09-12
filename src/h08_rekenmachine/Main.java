package h08_rekenmachine;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet {

    Button plus = new Button("+");
    Button min = new Button("-");
    Button keer = new Button("x");
    Button deel = new Button(":");
    TextField input1 = new TextField("");
    TextField input2 = new TextField("");

    public void init(){
        this.setSize(1480,720);

        plus.addActionListener(new ButtonListener());
        min.addActionListener(new ButtonListener());
        keer.addActionListener(new ButtonListener());
        deel.addActionListener(new ButtonListener());

        input1.addActionListener(new TextFieldListener());
        input2.addActionListener(new TextFieldListener());

        add(input1);
        add(input2);
        add(plus);
        add(min);
        add(keer);
        add(deel);

    }
    public void paint(Graphics g){

    }



    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

        }
    }
    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            }
        }
    }

