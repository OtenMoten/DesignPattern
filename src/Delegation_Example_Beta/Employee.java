/**
 * In this package you will learn how to deal with delegation.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Example_Beta;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Employee {

    private final String myName;

    public Employee(String newName) {
        this.myName = newName;
    }

    @Override
    public String toString() {
        return myName;
    }

}
