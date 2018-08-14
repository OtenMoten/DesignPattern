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
class Array {

    //  Our Array-class uses other objects to delegate the work.
    public InterfaceIterator myIterator;
    public InterfaceCalculator myCalculator;

    //  This is a "has-a"-relationship between 
    //  the classes "Iterator" and "Array".
    //  The array delegates the work to another object.
    public Array(int[] newArray) {
        this.myIterator = new Iterator(newArray);
        this.myCalculator = new Calculator(newArray);
    }

    public void printSummary() {
        this.myCalculator.printSummary();
    }

    public int getElement(int elementID) {
        return this.myIterator.getElement(0);
    }

    public int getCurrentElement() {
        return this.myIterator.getCurrentElement();
    }

    public void printAll() {
        while (this.myIterator.hasNext()) {
            System.out.print(this.myIterator.next() + " ");
        }
    }

}
