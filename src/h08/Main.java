package h08;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Main extends Applet{
    TextField textField = new TextField("Hier staat wat tekst");
    Button btnOK = new Button("OK");
    String textfield;
    Button btnReset = new Button ("Reset");

    public void init(){
        btnOK.addActionListener (new ButtonListener());
        textField.addActionListener(new TextFieldListener());
        btnReset.addActionListener(new ButtonListener());
        add(btnOK);
        add(btnReset);
        add(textField);
        textfield = "";
    }

    public void paint(Graphics g){
        g.drawString(textfield,50,50);
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if(e.getSource() == btnOK){
                textfield = textField.getText();
                textField.setText("");
                textField.requestFocus();
                repaint();
            }
            if (e.getSource() == btnReset){
                textfield = "";
                textField.setText("");
                textField.requestFocus();
                repaint();
            }
        }
    }
    class TextFieldListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if(e.getSource() == textField){
                textfield = textField.getText();
                textField.setText("");
                textField.requestFocus();
                repaint();
            }
        }
    }

}
