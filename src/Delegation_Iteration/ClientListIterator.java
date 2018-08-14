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
import java.util.ArrayList;
import java.util.Iterator;

public class ClientListIterator {

    public static void main(String[] args) {

        ArrayList<Object> liste = new ArrayList<>();
        liste.add(123);
        liste.add("abc");
        liste.add(123.78);
        liste.add('x');

        Iterator<Object> objectIterator = liste.iterator();
        while (objectIterator.hasNext()) {
            System.out.println(objectIterator.next());
        }

        liste.forEach((objectInList) -> {
            System.out.println(objectInList);
        });

    }

}
