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
public class MainBeta {

    public static void main(String[] args) {

        Person personAlpha = new Person("Konrad", 1990, 2000.0);
        Person personBeta = new Person("Conrad", 1993, 2077.0);
        Person personGamma = new Person("Alfred", 1996, 2120.0);

        MySet<Person> mySetAlpha = new MySet<>();
        mySetAlpha.add(personAlpha);
        mySetAlpha.add(personBeta);

        System.out.println(mySetAlpha);

        MySet<Person> mySetBeta = new MySet<>();
        mySetBeta.add(personBeta);
        mySetBeta.add(personGamma);
        System.out.println(mySetBeta);

        System.out.println(mySetAlpha.isIn(personAlpha));
        //  Works not. => false
        //  It's not the values it's all about the internal object handling
        //  of Java. To get it working, you need to override the "isIn"-function.
        System.out.println(mySetAlpha.isIn(new Person("Alfred", 1996, 2120.0)));
        System.out.println(mySetAlpha.isIn(personBeta));

        mySetAlpha.intersect(mySetBeta);
        System.out.println(mySetAlpha);

    }

}
