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
interface InterfaceIterator<elemenType> {

    boolean hasNext();

    int next();

    int getElement(int elementID);

    int getCurrentElement();

}
