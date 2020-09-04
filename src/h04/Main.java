package h04;

import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    @Override
    public void init() {
        setBackground(Color.white);


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




        //Opdracht 4.4 Drie kinderen hebben het volgende gewicht:
        //
        //Valerie: 40 kg
        //Jeroen: 100 kg
        //Hans: 80 kg
        //Maak van deze gegevens een staafdiagram, waarbij elke kolom een eigen kleur heeft.
        // De namen van de kinderen staan onder het staafdiagram en de verdeling van de schaal
        // staat naast de diagram met daarbij om de 20 de verdeling.

        //Opdracht 4.5 Teken met fillArc() op een blauwe achtergrond een ellips die met geel is gevuld.

        //Opdracht 4.6 Teken een stoplicht

        //Opdracht 4.7 Teken de zijde waarop de vier van een dobbelsteen staat




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