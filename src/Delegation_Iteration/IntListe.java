/**
 * In this package you will learn how to create your own type of a "Iterator".
 *
 * Enjoy the course and feel free to contribute.
 */
package Delegation_Iteration;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
class IntListe {

    private final int[] intArray;

    public IntListe(int[] newIntArray) {
        this.intArray = newIntArray;
    }

    public InterfaceIntIterable iterator() {

        return new InterfaceIntIterable() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < intArray.length;
            }

            @Override
            public int nextInt() {
                return intArray[this.index++];
            }

        };

    }
}
