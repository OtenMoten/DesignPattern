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
public class Copy {

    private IInput in;
    private IOutput out;

    void pipeline(IInput in, IOutput out) {

        this.in = in;
        this.out = out;

        char myCharacter = in.read();
        out.write(myCharacter);

    }
}
