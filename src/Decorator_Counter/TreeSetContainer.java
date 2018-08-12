package Decorator_Counter;

import java.util.Collection;
import java.util.TreeSet;

public class TreeSetContainer<E> implements Container<E> {

    private TreeSet<E> mySet = new TreeSet<E>();

    @Override
    public void add(E e) {
        mySet.add(e);
    }

//	@Override
//	public void addAll(Collection<E> c) {
//		mySet.addAll((Collection<? extends E>) c);		
//	}
    @Override
    public void remove(Object e) {
        mySet.remove(e);
    }

    @Override
    public void removeAll(Collection<E> c) {
        mySet.removeAll((Collection<?>) c);
    }

    @Override
    public void print() {
//		for(E e: mySet)
//		  System.out.println(e);
        System.out.println(mySet);
    }
}
