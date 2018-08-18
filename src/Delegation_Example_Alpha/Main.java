/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Example_Alpha;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Main {

    public static void main(String[] args) {

        Copy myCopy = new Copy();
        myCopy.pipeline(new FromKeyBoard(), new ToConsole());
        myCopy.pipeline(new FromFile(), new ToConsole());
    }

}
