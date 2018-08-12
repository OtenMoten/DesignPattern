package Decorator_Counter;

import java.util.Collection;

public abstract class DecoratorContainer<elementType> implements Container<elementType> {

    Container<elementType> myDecoContainer;

    public DecoratorContainer(Container<elementType> newContainer) {
        this.myDecoContainer = newContainer;
    }

    @Override
    public void add(elementType newElementObject) {
        this.myDecoContainer.add(newElementObject);
    }

    @Override
    public void addCollection(Collection<elementType> newCollectionObject) {
        this.myDecoContainer.addCollection(newCollectionObject);
    }

    @Override
    public void removeCollection(Collection<elementType> collectionObject) {
        this.myDecoContainer.removeCollection(collectionObject);
    }
    
    @Override
    public void remove(elementType elementObject) {
        this.myDecoContainer.remove(elementObject);
    }

    @Override
    public void print() {
        this.myDecoContainer.print();
    }
    
}