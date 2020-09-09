package h06;

import java.awt.*;
import java.applet.*;

public class Main extends Applet {


    // Opdracht 6.1
    // Met z'n vieren (Jan, Ali, Jeannette en jij) hebben jullie een karwei verricht en daarmee 113 euro verdiend.
    // Schrijf een applet waarin je een berekening maakt om het geld zo eerlijk mogelijk te verdelen.
    // In het venster van de applet komen de vier namen onder elkaar te staan met daarachter het bedrag dat een ieder krijgt.
    int verdiendGeld = 113;
    String[] Namen = new String[]{"Jan", "Ali", "Jeannette", "Victor", "Willem"}; // Leuk he, je kan zelfs mensen toevoegen
    String verdeeldGeld =  Integer.toString(verdiendGeld / Namen.length);

    // Opdracht 6.2
    // Schrijf een applet, waarin berekend wordt hoeveel seconden er in een uur, dag en jaar gaan
    // en de uitkomst van de berekening in het venster van de applet toont.
    int seconde, minuut, uur, dag, jaar;

    // Opdracht 6.3 Schrijf een applet waarin je twee ints met positieve waarden bij elkaar optelt en er een negatieve int uit komt.
    int groot = 2147483647;
    int nietGroot = 5;
    int watNu = groot + nietGroot;

    // Praktijk opdracht, Bereken het gemiddelde
    Double[] Cijfers = new Double[]{5.9,6.3,6.9,7.1,8.9,2.6,1.8};
    double gemiddeld = 0.0;


    public void init(){
        setBackground(Color.white);

        // Opdracht 6.2
        seconde = 1;
        minuut = 60 * seconde;
        uur = 60 * minuut;
        dag = 24 * uur;
        jaar = 365 * dag;

        // Praktijk opdracht
        for (double cijfer:Cijfers) {
            gemiddeld += cijfer;
        }
        gemiddeld /= Cijfers.length;

        gemiddeld = Math.round(gemiddeld * 10) / 10.0;


    }
    public void paint (Graphics g){

        // Opdracht 6.1
        int i = 1;
        for (String naam:Namen) {
                g.drawString(naam + " " + verdeeldGeld,20,20 * i);
                i++;
            }

        // Opdracht 6.2
        g.drawString("Een uur heeft " + uur + " Seconden",120,20);
        g.drawString("Een dag heeft " + dag + " Seconden",120,40);
        g.drawString("Een jaar heeft " + jaar + " Seconden",120,60);

        // Opdracht 6.3
        g.drawString("" + watNu,60,150);

        // Praktijk Opdracht
        g.drawString("" + gemiddeld,20,180);

    }

}

/* 1. Waarom is initialiseren van variabelen noodzakelijk?

    Omdat het overzichterlijker wordt om code aan te passen, en Java vereist dat van te voren
    variabelen zijn toegekend aan een type


    2. Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?

    Omdat er informatie verloren kan gaan bij deze conversie, en Java een error geeft wanneer je dit niet doet


    3. Wat is de uitvoer van dit programma? Geef een verklaring.

    int a, b, c;
    double uitkomst;

    a = 8;
    b = 8;
    c = 3;
    uitkomst = (a + b) / c;

    g.drawString("De uitkomst is: " + uitkomst, 20, 20);

    De uitkomst zou zal zijn : 8 + 8 = 16, gedeeld door 3 = 5,333333333333333


    4. In de regel uitkomst = (a + b) / c; laat je de ronde haken weg. De regel ziet er dan als volgt uit:

    uitkomst = a + b / c;
    5. Wat is de uitvoer van dit programma? Geef een verklaring.

    Standaard wiskunde.. haakjes eerst, dan / en *, dan + en -, dus zal het antwoord 10,66666666666666..... en ergens een 7 zijn.



 */

