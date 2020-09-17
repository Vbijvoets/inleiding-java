package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet{

    TextField input = new TextField();
    int number = 0;
    int lowest = Integer.MAX_VALUE;
    int highest = Integer.MIN_VALUE;
    String strNumber=  "";
    String strLowest = "";
    String strHighest = "";

    public void init(){

        input.addActionListener(new TextFieldListener());
        input.setPreferredSize(new Dimension(60,40));
        add(input);


    }
    public void paint(Graphics g){

        g.setColor(Color.BLACK);
        g.drawString("Het hoogste nummer is : "+strHighest,20,60);
        g.drawString("Het laagste nummer is : "+strLowest,20,80);

    }

    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if (e.getSource() == input){

                strNumber = input.getText().replaceAll("[^\\d^-]", "");
                number = Integer.parseInt(strNumber);

                if(number < lowest){

                    lowest = number;
                    strLowest = String.valueOf(lowest);
                    input.setText("");
                    input.requestFocus();
                    repaint();

                }
                if(number > highest){

                    highest = number;
                    strHighest = String.valueOf(highest);
                    input.setText("");
                    input.requestFocus();
                    repaint();

                }else if(number >= lowest && number <= highest){
                    input.setText("");
                    input.requestFocus();
                    repaint();
                }
            }
        }
    }


}
