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
public class ObjectIterator implements IObjectIterator {

    private final Object[] arrayObjects;
    private int iSaveInt;

    public ObjectIterator(Object[] newArray) {
        this.arrayObjects = newArray;
        this.iSaveInt = 0;
    }

    @Override
    public boolean hasNext() {
        return this.iSaveInt < this.arrayObjects.length;
    }

    @Override
    public Object next() {
        return this.arrayObjects[this.iSaveInt++];
    }
}
