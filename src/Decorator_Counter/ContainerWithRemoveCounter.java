package Decorator_Counter;

import java.util.Collection;

public class ContainerWithRemoveCounter<E> extends DecoratorContainer<E> {

    private int removeCounter;

    public ContainerWithRemoveCounter(Container<E> con) {
        super(con);
    }

    public void remove(E e) {
        super.remove(e);
        removeCounter++;
    }

    public void removeAll(Collection<E> c) {
        super.removeAll((Collection<E>) c);
        removeCounter += c.size();
    }

    public void print() {
        super.print();
        System.out.println("remove: " + removeCounter);
    }
    
}