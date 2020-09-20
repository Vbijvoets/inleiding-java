package h10_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class Main extends Applet {

    TextField input = new TextField();
    String defaultText = "De maand van dit maandnummer is : ";
    String otherDefaultText = "En heeft : ";
    String output = "";
    int dateNumberInt;
    String dateNumberString;
    String[] Dates = new String[]{"","Januari",
                                  "Februari",
                                  "Maart",
                                  "April",
                                  "Mei",
                                  "Juni",
                                  "Juli",
                                  "Augustus",
                                  "September",
                                  "Oktober",
                                  "November",
                                  "December"};


    public void init(){

        this.setSize(new Dimension(1200,800));
        input.addActionListener(new TextFieldListener());
        input.setPreferredSize(new Dimension(60,40));
        add(input);

    }

    public void paint(Graphics g){

        g.drawString( defaultText + output,70,70);
        g.drawString(defaultText,70,90);

    }

    class TextFieldListener implements ActionListener {
        public void actionPerformed (ActionEvent e){

            dateNumberString = input.getText().replaceAll("[^\\d]", "");
            dateNumberInt = Integer.parseInt(dateNumberString);

            if(e.getSource() == input){

                if(dateNumberInt <= 12 && dateNumberInt >= 1){
                    defaultText = "De maand van dit maandnummer is : ";
                     output = Dates[dateNumberInt];
                     repaint();
                     if(dateNumberInt == 2) {
                         defaultText = "En heeft 28 dagen";
                         repaint();
                     }
//                     else if (){
//
//                     }
                }else{
                    defaultText = "Dat is geen geldig maandnummer, probeer een getal tussen de 1 en 12";
                    output = "";
                    repaint();
                }


            }

        }
    }


}

