package Decorator_Counter;

import java.util.Collection;

public interface Container<E> {

    void add(E e);
    //void addAll(Collection<E> c);

    void remove(E e);

    void removeAll(Collection<E> c);

    void print();
    
}