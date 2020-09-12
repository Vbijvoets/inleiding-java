package h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main extends Applet{

    // Opdracht 8.1
    TextField textField = new TextField("Hier staat wat tekst");
    Button btnOK = new Button("OK");
    String textfield;
    Button btnReset = new Button ("Reset");


    // Opdracht 8.2
    Button btnMan = new Button("Man");
    Button btnVrouw = new Button("Vrouw");
    Button btnStudentMan = new Button("Man Student");
    Button btnStudentVrouw = new Button("Vrouw Student");

    int manCount,vrouwCount,mStudentCount,vStudentCount,totalCount = 0;

    // Opdracht 8.3
    TextField btwCalc = new TextField("BTW Berekenen");
    Button btnBtw = new Button("Ok");
    double btw;

    public void init(){
        this.setSize(1480,720);
        // Opdracht 8.1
        btnOK.addActionListener (new ButtonListener());
        textField.addActionListener(new TextFieldListener());
        btnReset.addActionListener(new ButtonListener());
        add(btnOK);
        add(btnReset);
        add(textField);
        textfield = "";


        // Opdracht 8.2
        btnMan.addActionListener(new ButtonListener());
        btnVrouw.addActionListener(new ButtonListener());
        btnStudentMan.addActionListener(new ButtonListener());
        btnStudentVrouw.addActionListener(new ButtonListener());

        add(btnMan);
        add(btnVrouw);
        add(btnStudentMan);
        add(btnStudentVrouw);

        // Opdracht 8.3
        btwCalc.addActionListener(new TextFieldListener());
        btnBtw.addActionListener(new ButtonListener());

        add(btwCalc);
        add(btnBtw);


    }

    public void paint(Graphics g){
        // Opdracht 8.1
        g.drawString(textfield,50,50);

        // Opdracht 8.2
        g.drawString("Totaal aantal mensen = " + totalCount,120,120);
        g.drawString("Waarvan : " + manCount + " Mannen",120,140);
        g.drawString("" + vrouwCount + " Vrouwen",120,160);
        g.drawString("" + mStudentCount + " Mannelijke Studenten",120,180);
        g.drawString("" + vStudentCount + " Vrouwelijke Studenten",120,200);


    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            // Opdracht 8.1
            if(e.getSource() == btnOK){
                textfield = textField.getText();
                textField.setText("");
                textField.requestFocus();
                repaint();
            }
            if (e.getSource() == btnReset) {
                textfield = "";
                textField.setText("");
                textField.requestFocus();
                repaint();

            }
                // Opdracht 8.2
            if(e.getSource() == btnMan){
                totalCount++;
                manCount++;

                repaint();
            }
            if(e.getSource() == btnVrouw){
                totalCount++;
                vrouwCount++;

                repaint();
            }
            if(e.getSource() == btnStudentMan){
                totalCount++;
                mStudentCount++;

                repaint();
            }
            if(e.getSource() == btnStudentVrouw){
                totalCount++;
                vStudentCount++;

                repaint();
            }

            // Opdracht 8.3
            if(e.getSource() == btnBtw){
                btw = Double.parseDouble(btwCalc.getText());
                btw *= 1.21;
                btwCalc.setText(String.valueOf(round(btw,2)));
                repaint();
            }

        }
    }
    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){

            // Opdracht 8.1
            if(e.getSource() == textField) {
                textfield = textField.getText();
                textField.setText("");
                textField.requestFocus();
                repaint();
            }

            // Opdracht 8.3
                if(e.getSource() == btwCalc){
                    btw = Double.parseDouble(btwCalc.getText());
                    btw *= 1.21;
                    btwCalc.setText(String.valueOf(round(btw,2)));
                    repaint();


            }
        }
    }

    // Deze heb ik gewoon van internet maar dat bespaart gewoon tijd, #waaromzouikhetzelfdoenalshetalgedaanis
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
