package Decorator_Counter;

import java.util.Collection;

public class ContainerWithRemoveCounter<elementType> extends DecoratorContainer<elementType> {

    private int removeCounter;

    public ContainerWithRemoveCounter(Container<elementType> newContainerWithRemoveCounter) {
        super(newContainerWithRemoveCounter);
    }

    @Override
    public void remove(elementType elementObject) {
        super.remove(elementObject);
        this.removeCounter++;
    }

    @Override
    public void removeCollection(Collection<elementType> collectionObject) {
        super.removeCollection((Collection<elementType>) collectionObject);
        this.removeCounter += collectionObject.size();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("remove: " + this.removeCounter);
    }

}