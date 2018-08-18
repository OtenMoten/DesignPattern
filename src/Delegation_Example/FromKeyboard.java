/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Example;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.Scanner;

class FromKeyBoard implements IInput {

    @Override
    public char read() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please type in character: ");
        String myString = myScanner.next();
        return myString.charAt(0);
    }

}
