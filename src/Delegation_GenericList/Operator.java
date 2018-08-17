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
import java.util.Arrays;
import java.util.TreeSet;

public class Operator {

    public static <ClassType extends Comparable<ClassType>> ClassType
            getLast(ClassType... inputObjects) {

        TreeSet<ClassType> myTreeSet = new TreeSet<>();
        myTreeSet.addAll(Arrays.asList(inputObjects));

        //  ".getLast(x,y,z)" works with String-objects alphabetically.
        return myTreeSet.last();

    }

    public static <T extends Comparable<T>> T getFirst(T alpha, T beta, T gamma) {

        TreeSet<T> myTreeSet = new TreeSet<>();

        myTreeSet.add(alpha);
        myTreeSet.add(beta);
        myTreeSet.add(gamma);

        //  ".first()" means ALPHABETICALLY first.
        return myTreeSet.first();

    }
}
