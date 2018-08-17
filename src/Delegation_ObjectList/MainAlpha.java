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
public class MainAlpha {

    public static void main(String[] args) {

        Person personAlpha = new Person("Konrad", 1990, 2000.0);
        Person personBeta = new Person("Conrad", 1993, 2077.0);
        Person personGamma = new Person("Alfred", 1996, 2120.0);

        MySet<Object> mySetAlpha = new MySet<>();
        mySetAlpha.add(personAlpha);
        mySetAlpha.add(personBeta);
        mySetAlpha.add(123);

        System.out.println(mySetAlpha);

        MySet mySetBeta = new MySet();
        mySetBeta.add(personBeta);
        mySetBeta.add(personGamma);
        mySetBeta.add(123);
        System.out.println(mySetBeta);

        System.out.println(mySetBeta.isIn(personAlpha));
        //  Works not. => false
        System.out.println(mySetBeta.isIn(new Person("Alfred", 1996, 2120.0)));
        //  Works. => true
        System.out.println(mySetBeta.isIn(personGamma));

        mySetBeta.intersect(mySetAlpha);
        System.out.println(mySetBeta);

    }

}
