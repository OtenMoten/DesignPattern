/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delegation_Objects;

/**
 *
 * @author Kevin
 */
public class MainBag {

    public static void main(String[] args) {

        double GOLD = 19.28;
        double TITAN = 4.54;
        double SILBER = 10.49;
        double BLEI = 11.34;

        Bag myBag = new Bag();
        myBag.add(new Pyramid(GOLD, 3.0, 12.0));
        myBag.add(new Cuboid(TITAN, 3.0, 4.0, 12.0));
        myBag.add(new Cuboid(BLEI, 3.0, 6.0, 12.0));
        myBag.add(new Pyramid(SILBER, 5, 12));

        myBag.toConsole();

        System.out.println();
        System.out.println("Volume sumary: \t" + myBag.calcSumVolume());
        System.out.printf("Weight sumary:  %5.3f", myBag.calcSumWeight());
        System.out.println();

    }

}
