/**
 * In this package you will learn how to create your own type of a "Iterator".
 *
 * Enjoy the course and feel free to contribute.
 */
package Iterator_Objects;

/**
 * @author Kevin Ossenbrück
 * @date August 2018
 * @github https://github.com/OtenMoten
 */
import java.util.List;
import java.awt.Point;
import java.util.ArrayList;

public class ClientObjectIterator {

    public static void main(String[] args) {

        Object[] myIntList = new Object[]{1, 2, 3};
        IObjectIterator intIterator = new ObjectIterator(myIntList);
        while (intIterator.hasNext()) {
            System.out.println(intIterator.next());
        }

        System.out.println();

        Object[] myList = new Object[]{'a', 666,
            12345, "bla BLA",
            new Point(123, 456)};
        IObjectIterator iterator = new ObjectIterator(myList);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(11.11);
        doubleList.add(22.22);
        doubleList.add(33.33);
        java.util.Iterator iter = doubleList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }

}
