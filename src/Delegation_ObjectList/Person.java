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
public class Person {

    private String myName;
    private int myDate;
    private double myLoan;

    public Person(String newName, int newDate, double newLoan) {
        this.myName = newName;
        this.myDate = newDate;
        this.myLoan = newLoan;
    }

    public String getName() {
        return this.myName;
    }

    public Integer getJahr() {
        return this.myDate;
    }

    public Double getGehalt() {
        return this.myLoan;
    }

    @Override
    public String toString() {
        return this.myName;
    }

}
