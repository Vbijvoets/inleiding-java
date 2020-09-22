package h10_3;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.YearMonth;


public class Main extends Applet {

    TextField maandInput = new TextField();
    TextField jaarInput = new TextField();

    String defaultText = "De maand van dit maandnummer is : ";
    String otherDefaultText = "En heeft : ";
    String output = "";
    int dateMonthInt;
    int dateYearInt;
    String dateMonthString;
    String dateYearString;
    YearMonth date = YearMonth.of(1970,1);


    public void init(){

        this.setSize(new Dimension(1200,800));
        maandInput.addActionListener(new TextFieldListener());
        maandInput.setPreferredSize(new Dimension(60,40));
        add(maandInput);
        jaarInput.addActionListener(new TextFieldListener());
        jaarInput.setPreferredSize(new Dimension(60,40));
        add(jaarInput);

    }

    public void paint(Graphics g){

        g.drawString( defaultText + output,70,70);
        g.drawString(otherDefaultText,70,90);

    }

    class TextFieldListener implements ActionListener {
        public void actionPerformed (ActionEvent e){

            if(e.getSource() == maandInput){

                dateMonthString = maandInput.getText().replaceAll("[^\\d]", "");
                dateMonthInt = Integer.parseInt(dateMonthString);

                if(dateMonthInt <= 0 || dateMonthInt >= 13){

                    defaultText = "Dit is geen geldige maand";
                    otherDefaultText = "";
                    repaint();

                }
                if(dateMonthInt >= 1 && dateMonthInt <= 12){

                    date = YearMonth.of(2020,dateMonthInt);
                    defaultText = "De maand van dit maandnummer is : " + date.getMonth();
                    otherDefaultText = "En heeft : " + date.lengthOfMonth() + " Dagen";
                    repaint();

                }
                jaarInput.requestFocus();
            }
            if(e.getSource() == jaarInput){

                dateYearString = jaarInput.getText().replaceAll("[^\\d]", "");
                dateYearInt = Integer.parseInt(dateYearString);
                dateMonthString = maandInput.getText().replaceAll("[^\\d]", "");
                dateMonthInt = Integer.parseInt(dateMonthString);

                if(dateYearInt < 1970){
                    defaultText = "Dit is geen geldig jaar";
                    otherDefaultText = "Probeer een jaar na/of 1970";
                    repaint();
                }
                if (dateYearInt >= 1970){
                    date = YearMonth.of(dateYearInt,dateMonthInt);
                    defaultText = "De maand van dit maandnummer is : " + date.getMonth();
                    otherDefaultText = "En heeft : " + date.lengthOfMonth() + " Dagen";
                    repaint();
                }

            }

        }
    }


}

