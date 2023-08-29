package week_04.assignment;

import java.util.Scanner;

public class Question_04_03 {
    public static void main(String[] args) {
        //Atlanta, Georgia y : -84.3879824
        //Atlanta, Georgia x : 33.7489954
        //Orlando, Florida y : -81.3792364999
        //Orlando, Florida x : 28.5383355
        //Savannah, Georgia y : -81.09983419999998
        //Savannah, Georgia x : 32.0835407
        //Charlotte, North Carolina y : -80.84312669999997
        //Charlotte, North Carolina x : 35.2270869

        double xOfAtlantaGeorgia = Math.toRadians(33.7489954);

        double yOfAtlantaGeorgia = Math.toRadians(-84.3879824);

        double xOfOrlandoFlorida = Math.toRadians(28.5383355);

        double yOfOrlandoFlorida = Math.toRadians(-81.3792364999);

        double xOfSavannahGeorgia = Math.toRadians(32.0835407);

        double yOfSavannahGeorgia = Math.toRadians(-81.09983419999998);

        double xOfCharlotteNorthCarolina = Math.toRadians(35.2270869);

        double yOfCharlotteNorthCarolina = Math.toRadians(-80.84312669999997);

        final double RADIUS = 6371.01;

        double distanceBetweenSavannahCharlotte = RADIUS * Math.acos(Math.sin(xOfSavannahGeorgia)
                * Math.sin(xOfCharlotteNorthCarolina)
                + Math.cos(xOfSavannahGeorgia)
                * Math.cos(xOfCharlotteNorthCarolina)
                * Math.cos(yOfSavannahGeorgia - yOfCharlotteNorthCarolina));

        double distanceBetweenCharlotteAtlanta = RADIUS * Math.acos(Math.sin(xOfCharlotteNorthCarolina)
                * Math.sin(xOfAtlantaGeorgia)
                + Math.cos(xOfCharlotteNorthCarolina)
                * Math.cos(xOfAtlantaGeorgia)
                * Math.cos(yOfCharlotteNorthCarolina - yOfAtlantaGeorgia));

        double distanceBetweenAtlantaOrlando = RADIUS * Math.acos(Math.sin(xOfAtlantaGeorgia)
                * Math.sin(xOfOrlandoFlorida)
                + Math.cos(xOfAtlantaGeorgia)
                * Math.cos(xOfOrlandoFlorida)
                * Math.cos(yOfAtlantaGeorgia - yOfOrlandoFlorida));

        double distanceBetweenOrlandoSavannah = RADIUS * Math.acos(Math.sin(xOfOrlandoFlorida)
                * Math.sin(xOfSavannahGeorgia)
                + Math.cos(xOfOrlandoFlorida)
                * Math.cos(xOfSavannahGeorgia)
                * Math.cos(yOfOrlandoFlorida - yOfSavannahGeorgia));

        double distanceBetweenSavannahAtlanta = RADIUS * Math.acos(Math.sin(xOfSavannahGeorgia)
                * Math.sin(xOfAtlantaGeorgia)
                + Math.cos(xOfSavannahGeorgia)
                * Math.cos(xOfAtlantaGeorgia)
                * Math.cos(yOfSavannahGeorgia - yOfAtlantaGeorgia));

        double sOfSavannahCharlotteAtlantaTriangle = (distanceBetweenSavannahCharlotte
                + distanceBetweenCharlotteAtlanta + distanceBetweenSavannahAtlanta) / 2;

        double sOfAtlantaOrlandoSavannahTriangle = (distanceBetweenAtlantaOrlando
                + distanceBetweenOrlandoSavannah + distanceBetweenSavannahAtlanta) / 2;

        double areaOfSavannahCharlotteAtlantaTriangle = Math.sqrt(sOfSavannahCharlotteAtlantaTriangle
                * (sOfSavannahCharlotteAtlantaTriangle - distanceBetweenSavannahCharlotte)
                * (sOfSavannahCharlotteAtlantaTriangle - distanceBetweenCharlotteAtlanta)
                * (sOfSavannahCharlotteAtlantaTriangle - distanceBetweenSavannahAtlanta));


        double areaOfAtlantaOrlandoSavannahTriangle = Math.sqrt(sOfAtlantaOrlandoSavannahTriangle
                * (sOfAtlantaOrlandoSavannahTriangle - distanceBetweenAtlantaOrlando)
                * (sOfAtlantaOrlandoSavannahTriangle - distanceBetweenOrlandoSavannah)
                * (sOfAtlantaOrlandoSavannahTriangle - distanceBetweenSavannahAtlanta));


        double total = areaOfSavannahCharlotteAtlantaTriangle + areaOfAtlantaOrlandoSavannahTriangle;

        System.out.println("Estimated area enclosed by these four cities : " + total);


    }
}
