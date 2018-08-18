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
public class MainBody implements ISubstance {

    public static void main(String[] args) {

        BodyManagement myManager = new BodyManagement();
        myManager.addBody(new Pyramid(GOLD, 3.0, 12.0));
        myManager.addBody(new Cuboid(TITAN, 3.0, 4.0, 12.0));
        myManager.addBody(new Cuboid(BLEI, 3.0, 6.0, 12.0));
        myManager.addBody(new Pyramid(SILBER, 5, 12));
        myManager.addBody(new Pyramid(KUPFER, 5, 12));

        myManager.toConsole();

        System.out.println();
        System.out.println("Volume sumary: \t" + myManager.getSumaryVolume());
        System.out.printf("Weight sumary:  %5.3f", myManager.getSumaryWeight());
        System.out.println();

    }

}
