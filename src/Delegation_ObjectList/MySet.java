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
import java.util.ArrayList;

public class MySet<ClassType> extends ArrayList<ClassType> {

    @Override
    public boolean add(ClassType object) {
        return super.add(object);
    }

    public boolean isIn(ClassType object) {
        return this.contains(object);
    }

    public boolean intersect(MySet inputSet) {
        return this.retainAll(inputSet);

    }
}
