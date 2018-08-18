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
public class ToConsole implements IOutput {

    @Override
    public void write(char myCharacter) {
        System.out.println(myCharacter);
    }

}
