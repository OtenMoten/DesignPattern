/**
 * In this package you will learn how to create a list for generic objects.
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_GenericList;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
public class Person extends AHuman implements Comparable {

    public Person(String newName, int newDate, double newLoan) {
        super(newName, newDate, newLoan);
    }

    @Override
    public int compareTo(Object otherHuman) {
        return this.getName().compareTo(((Person) otherHuman).getName());
    }

}
