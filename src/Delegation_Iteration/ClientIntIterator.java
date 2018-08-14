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
public class ClientIntIterator {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5};

        IntListe intListe = new IntListe(intArray);
        InterfaceIntIterable intIterator = intListe.iterator();
        while (intIterator.hasNext()) {
            int next = intIterator.nextInt();
            System.out.print(next + " ");
        }
        System.out.println();

    }

}
