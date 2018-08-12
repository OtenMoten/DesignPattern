package Decorator_Counter;

import java.util.Collection;

public class ContainerWithAddCounter<elementType> extends DecoratorContainer<elementType> {

    private int addCounter;

    public ContainerWithAddCounter(Container<elementType> newContainerWithAddCounter) {
        super(newContainerWithAddCounter);
    }

    @Override
    public void add(elementType newElementObject) {
        super.add(newElementObject);
        this.addCounter++;
    }

    @Override
    public void addCollection(Collection<elementType> newCollectionObject) {
        super.addCollection((Collection<elementType>) newCollectionObject);
        this.addCounter += newCollectionObject.size();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("add: " + this.addCounter);
    }


}