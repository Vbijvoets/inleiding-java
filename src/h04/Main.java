package h04;

import java.applet.Applet;
import java.awt.*;
import java.lang.reflect.Array;

public class Main extends Applet {
    @Override
    public void init() {
        setBackground(Color.white);
        setSize(500, 500);


    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        //Opdracht 4.1, Teken een gelijkbenige driehoek

        int x1[]={15,0,30};
        int y1[]={0,30,30};
        g.drawPolygon(x1,y1,3);
        g.setColor(Color.red);
        g.drawString("4.1",5,45);

        //Opdracht 4.2, Teken een huis met daarin tenminste één raam en een deur

        g.setColor(Color.black);
        int x2[] = {95,65,35,95,95,35,35};
        int y2[] = {30,0,30,30,60,60,30};
        g.drawPolygon(x2,y2,7);

        g.drawRect(75,40,10,20);
        g.drawOval(77,50,2,2);

        g.drawRect(40,40,10,10);
        g.drawLine(45,40,45,50);
        g.drawLine(40,45,50,45);

        g.drawRect(55,40,10,10);
        g.drawLine(60,40,60,50);
        g.drawLine(55,45,65,45);

        g.setColor(Color.red);
        g.drawString("4.2",55,29);

        //Opdracht 4.3, Teken de Nederlandse vlag aan een vlaggenstok

        g.setColor(Color.yellow);
        g.fillOval(105,0,10,10);
        g.setColor(Color.BLACK);
        g.drawOval(105,0,10,10);
        g.drawRect(108,10,3,50);

        g.setColor(Color.red);
        g.fillRect(111,12,50,10);
        g.setColor(Color.BLACK);
        g.drawRect(111,12,50,10);
        g.setColor(Color.BLACK);
        g.drawRect(111,22,50,10);
        g.setColor(Color.blue);
        g.fillRect(111,32,50,10);
        g.setColor(Color.BLACK);
        g.drawRect(111,32,50,10);


        //Opdracht 4.4 Drie kinderen hebben het volgende gewicht:
        //
        //Valerie: 40 kg
        //Jeroen: 100 kg
        //Hans: 80 kg
        //Maak van deze gegevens een staafdiagram, waarbij elke kolom een eigen kleur heeft.
        // De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal
        // staat naast de diagram met daarbij om de 20 de verdeling.

        int j = 20;
        String[] namen = {"Valerie","Jeroen","Hans"};
        for (int i = 0;i < 7; i++){
            String str1 = Integer.toString(j*i);
            g.drawString(str1,10,240-(j*i));
            g.drawLine(35,240-(j*i),200,240-(j*i));
        }
        for (int m = 0; m < namen.length; m++){
            String naam = namen[m];
            switch (naam){
                case "Valerie":
                    g.setColor(Color.red);
                    g.fillRect(40,200,30,40);
                    g.drawString("Valerie",40,250);

                    break;
                case "Jeroen":
                    g.setColor(Color.blue);
                    g.fillRect(71,140,30,100);
                    g.drawString("Jeroen",71,260);

                    break;
                case "Hans":
                    g.setColor(Color.orange);
                    g.fillRect(102,160,30,80);
                    g.drawString("Hans",102,270);

                    break;
            }
        }

        //Opdracht 4.5 Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.

        g.setColor(Color.blue);
        g.fillRect(210,0,100,100);
        g.setColor(Color.yellow);
        g.fillArc(210,0,100,100,0,360);

        //Opdracht 4.6 Teken een stoplicht

        g.setColor(Color.black);
        g.drawRect(320,0,15,57);
        g.setColor(Color.red);
        g.fillArc(321,1,13,18,0,360);
        g.setColor(Color.orange);
        g.fillArc(321,19,13,18,0,360);
        g.setColor(Color.green);
        g.fillArc(321,38,13,18,0,360);


        //Opdracht 4.7 Teken de zijde waarop de vier van een dobbelsteen staat

        g.setColor(Color.black);
        g.drawRect(320,320,80,80);
        for (int i = 0; i < 4; i++){
            if(i % 2 == 0){
                g.fillArc((330+(i*20)),330,20,20,0,360);
            }else{
                g.fillArc((330+((i-1)*20)),370,20,20,0,360);
            }
        }




    }
}

/*

    Vragen :

    Vraag 1, Wat is een platform?
        Een Java platform is een verzameling van programmas om Java applicaties snel en efficient uit te voeren

    Vraag 2, Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?
        Omdat een programma compatible is voor meerdere platforms?

    Vraag 3, Wat is bytecode?
        Bytecode is gedeeltelijke machine taal, onstaan uit compilatie van codetaal.

    Vraag 4, Wat doet JVM
        JVM, ook wel Java Virtual Machine, runned Java code, en zet het om in bytecode

    Vraag 5, Met welke methode kun je een vierkant tekenen?
        met g.drawRect(x-start,y-start,x-einde,y-einde);

    Vraag 6, Noem 3 methodes om een cirkel te tekenen
        met .drawRoundRect, .drawOval en .drawArc

    Vraag 7, Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?
        omdat de paint() functie bestemd is voor het doorvoeren van tekeningen.



 */