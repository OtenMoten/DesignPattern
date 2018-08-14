/**
 * In this package you will learn how to create your own type of "Array"-class.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Array;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        int[] arrayNativeInt = {11, 12, 13, 14, 15};

        Array intArray = new Array(arrayNativeInt);

        intArray.printAll();
        intArray.printSummary();

    }

}
