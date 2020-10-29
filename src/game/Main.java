package game;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends Applet {

    int currentPlayer = 1;

    Button sub1 = new Button("-1");
    Button sub2 = new Button("-2");
    Button sub3 = new Button("-3");

    int stones = 23;

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

        g.drawString(Integer.toString(stones),50,90);

        if (stones <= 1){
            if(currentPlayer == 1){
                g.drawString("Helaas je hebt verloren",30,70);
            }
            if (currentPlayer == 2){
                g.drawString("Woohoo! je hebt gewonnen",30,70);
            }
        }

    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
                if (e.getSource() == sub1){
                    if (currentPlayer == 1){
                        stones -= 1;
                        repaint();
                        currentPlayer = 2;
                        ComputerTurn();
                    }

                }
                if (e.getSource() == sub2){
                    if (currentPlayer == 1){
                        stones -= 2;
                        repaint();
                        currentPlayer = 2;
                        ComputerTurn();
                    }

                }
                if (e.getSource() == sub3){
                    if (currentPlayer == 1){
                        stones -= 3;
                        repaint();
                        currentPlayer = 2;
                        ComputerTurn();
                    }
                }
            }
        }


        // The computers turn.
        public void ComputerTurn () {

            if (stones >= 1) {
                switch (stones) {
                    case 1:
                    case 2:
                    case 5:
                    case 9:
                    case 15:
                    case 17:
                    case 18:
                    case 21:
                        stones -= 1;
                        currentPlayer = 1;
                        repaint();
                        break;
                    case 3:
                    case 6:
                    case 8:
                    case 10:
                    case 12:
                    case 14:
                    case 16:
                    case 19:
                    case 22:
                        stones -= 2;
                        currentPlayer = 1;
                        repaint();
                        break;
                    case 4:
                    case 7:
                    case 11:
                    case 13:
                    case 20:
                        stones -= 3;
                        currentPlayer = 1;
                        repaint();
                        break;
                    default:
                        break;
                }
            }
    }
}




