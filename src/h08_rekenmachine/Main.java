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
    TextField input1 = new TextField();
    TextField input2 = new TextField();
    int number1;
    int number2;
    String string1,string2;

    public void init(){

        this.setSize(1480,720);

        plus.addActionListener(new ButtonListener());
        min.addActionListener(new ButtonListener());
        keer.addActionListener(new ButtonListener());
        deel.addActionListener(new ButtonListener());

        input1.addActionListener(new TextFieldListener());
        input1.setPreferredSize(new Dimension(80,20));
        input2.addActionListener(new TextFieldListener());
        input2.setPreferredSize(new Dimension(80,20));


        add(input1);
        add(input2);
        add(plus);
        add(min);
        add(keer);
        add(deel);

        input1.requestFocus();

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

            if (e.getSource() == plus){

                if(!input1.getText().equals("") && !input2.getText().equals("")) {

                    string1 = input1.getText().replaceAll("[^\\d.]", "");
                    string2 = input2.getText().replaceAll("[^\\d.]", "");

                    number1 = Integer.parseInt(string1);
                    number2 = Integer.parseInt(string2);

                    number1 += number2;

                    input1.setText(String.valueOf(number1));
                    input2.setText("");
                    input1.requestFocus();


                }

            }
            if (e.getSource() == min){

                if(!input1.getText().equals("") && !input2.getText().equals("")) {

                    string1 = input1.getText().replaceAll("[^\\d.]", "");
                    string2 = input2.getText().replaceAll("[^\\d.]", "");

                    number1 = Integer.parseInt(string1);
                    number2 = Integer.parseInt(string2);

                    number1 -= number2;

                    input1.setText(String.valueOf(number1));
                    input2.setText("");
                    input1.requestFocus();


                }

            }
            if (e.getSource() == keer){
                if(!input1.getText().equals("") && !input2.getText().equals("")) {

                    string1 = input1.getText().replaceAll("[^\\d.]", "");
                    string2 = input2.getText().replaceAll("[^\\d.]", "");

                    number1 = Integer.parseInt(string1);
                    number2 = Integer.parseInt(string2);

                    number1 *= number2;

                    input1.setText(String.valueOf(number1));
                    input2.setText("");
                    input1.requestFocus();


                }

            }
            if (e.getSource() == deel){
                if(!input1.getText().equals("") && !input2.getText().equals("")) {

                    string1 = input1.getText().replaceAll("[^\\d.]", "");
                    string2 = input2.getText().replaceAll("[^\\d.]", "");

                    number1 = Integer.parseInt(string1);
                    number2 = Integer.parseInt(string2);

                    number1 /= number2;

                    input1.setText(String.valueOf(number1));
                    input2.setText("");
                    input1.requestFocus();


                }

            }

        }
    }
    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            }
        }
    }

