/**
 * In this package you will learn how to create a list for objects.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_ObjectList;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class MainGamma {

    public static void main(String[] args) {

        MySet<Integer> mySetAlpha = new MySet<>();
        mySetAlpha.add(12);
        mySetAlpha.add(13);
        mySetAlpha.add(14);
        mySetAlpha.add(15);
        mySetAlpha.add(16);
        System.out.println(mySetAlpha);

        MySet<Integer> mySetBeta = new MySet<>();
        mySetBeta.add(15);
        mySetBeta.add(16);
        mySetBeta.add(17);
        mySetBeta.add(18);
        mySetBeta.add(19);
        System.out.println(mySetBeta);

        System.out.println(mySetAlpha.isIn(13));
        System.out.println(mySetBeta.isIn(20));

        mySetAlpha.intersect(mySetBeta);
        System.out.println(mySetAlpha);

    }

}
