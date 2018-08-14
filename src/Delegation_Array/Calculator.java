/**
 * In this package you will learn how to create your own type of "Array"-class.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Array;

import java.util.Arrays;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Calculator implements InterfaceCalculator {

    private final int[] intArray;

    public Calculator(int[] newArray) {
        this.intArray = newArray;
    }

    @Override
    public void printSummary() {
        int iSummary = 0;
        for (int i = 0; i < this.intArray.length; i++) {
            iSummary += this.intArray[i];
        }
        System.out.println("Summary is: " + iSummary);
    }

}
