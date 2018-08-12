package Decorator_Counter;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetContainer<elementType> implements Container<elementType> {

    private TreeSet<elementType> myTreeSet = new TreeSet<>();

    @Override
    public void add(elementType newElementObject) {
        this.myTreeSet.add(newElementObject);
    }

    @Override
    public void addCollection(Collection<elementType> newCollectionObject) {
        this.myTreeSet.addAll((Collection<? extends elementType>) newCollectionObject);
    }

    @Override
    public void remove(Object elementObject) {
        this.myTreeSet.remove(elementObject);
    }

    @Override
    public void removeCollection(Collection<elementType> collectionObject) {
        this.myTreeSet.removeAll((Collection<?>) collectionObject);
    }

    @Override
    public void print() {
        this.myTreeSet.forEach((elementObject) -> {
            System.out.println(elementObject);
        });
        System.out.println(this.myTreeSet);
    }

}