/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_GenericFunction;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Class {

    public static void main(String[] args) {

        Person myPersonAlpha = new Person("Alfredo", 1996, 2120.0);
        Person myPersonBeta = new Person("Konrad", 1990, 2000.0);

        System.out.println(NotNull.printIgnoreNull("abc", "dfg", null, "xyz"));
        System.out.println(NotNull.printIgnoreNull(null, 123, null));
        System.out.println(NotNull.printIgnoreNull(null, 'm', 345));
        System.out.println(NotNull.printIgnoreNull(myPersonBeta, null, myPersonAlpha, 123));

    }

}
