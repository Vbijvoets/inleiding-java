package game;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet {



    int currentPlayer = 1;
    double stonesCalc;

    Button sub1 = new Button("-1");
    Button sub2 = new Button("-2");
    Button sub3 = new Button("-3");

    int stones = 23;
    String message = "";

    Color background = Color.white;

    public void init(){

        sub1.addActionListener(new ButtonListener());
        sub2.addActionListener(new ButtonListener());
        sub3.addActionListener(new ButtonListener());

        add(sub1);
        add(sub2);
        add(sub3);

        setBackground(background);
        setSize(1200,800);




    }

    public void paint ( Graphics g ){

        for (int i = 0; i < stones; i++){
            g.fillRect(15 + (i * 10),10,5,30);
        }
        if (stones <= 1 && currentPlayer == 1){
            g.drawString("Helaas je hebt verloren",70,70);
        }
        if (stones <= 1 && currentPlayer == 2){
            g.drawString("Je hebt gewonnen!",70,70);
        }
        g.drawString(message, 70, 70);





    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            if  (stones >= 2){
                if (e.getSource() == sub1){
                    if (currentPlayer == 1){
                        stones -= 1;
                        currentPlayer = 2;
                        repaint();
                        ComputerTurn();
                    }

                }
                if (e.getSource() == sub2){
                    if (currentPlayer == 1){
                        stones -= 2;
                        currentPlayer = 2;
                        repaint();
                        ComputerTurn();
                    }

                }
                if (e.getSource() == sub3){
                    if (currentPlayer == 1){
                        stones -= 3;
                        currentPlayer = 2;
                        repaint();
                        ComputerTurn();
                    }
                }
            }
            if (stones <= 1 && currentPlayer == 1){
                message = "Helaas je hebt verloren";
            }
        }
    }


        // The computers turn.
        public void ComputerTurn () {
            if (stones >= 1) {
                    if (stones % 3 == 1){
                        stones -= 3;
                        repaint();
                        currentPlayer = 1;

                    } else if (stones % 3 == 2) {
                        stones -= 1;
                        repaint();
                        currentPlayer = 1;
                    }
//                     else if (stones % 3 == 3){
//                        stones -= 3;
//                        repaint();
//                        currentPlayer = 1;
//
//                    }
                    else {
                        stones -= 2;
                        repaint();
                        currentPlayer = 1;
                    }
            }
    }
}





