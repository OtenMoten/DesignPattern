package Decorator_Counter;

import java.util.Collection;

public interface Container<elementType> {

    void add(elementType newElementObject);

    void addCollection(Collection<elementType> newCollectionObject);

    void remove(elementType elementType);

    void removeCollection(Collection<elementType> collectionObjects);

    void print();

}