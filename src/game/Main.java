package game;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Main extends Applet {

    int endOfGame = 0;
    int playerWin;
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

    }

    class ButtonListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
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
        }

        public void ComputerTurn () {

            wait(1000);

            if (stones % 4 + 1 == 3){
                stones -= 1;
                currentPlayer = 1;
                repaint();
            }
            if (stones % 4 + 1 == 2){
                stones -= 3;
                currentPlayer = 1;
                repaint();
            }
            if (stones % 4 + 1 == 1){
                stones -= 3;
                currentPlayer = 1;
                repaint();
            }
            currentPlayer = 1;

        }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    }




