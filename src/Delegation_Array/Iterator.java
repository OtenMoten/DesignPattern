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
class Iterator implements InterfaceIterator {

    private final int[] intArray;
    private int iSaveLocation;

    public Iterator(int[] newArray) {
        this.intArray = newArray;
        this.iSaveLocation = 0;
    }

    @Override
    public boolean hasNext() {
        return this.iSaveLocation < this.intArray.length;
    }

    @Override
    public int next() {
        return this.intArray[this.iSaveLocation++];
    }

    @Override
    public int getElement(int elementID) {
        return this.intArray[elementID];
    }

    @Override
    public int getCurrentElement() {
        return this.intArray[iSaveLocation];
    }

}
