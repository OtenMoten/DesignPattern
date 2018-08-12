package Decorator_Counter;

import java.util.Collection;

public abstract class DecoratorContainer<E> implements Container<E> {

    Container<E> myDecoCon;

    public DecoratorContainer(Container<E> con) {
        myDecoCon = con;
    }

    @Override
    public void add(E e) {
        myDecoCon.add(e);
    }

//	@Override
//	public void addAll(Collection<E> c) {
//		myDecoCon.addAll(c);		
//	}
    @Override
    public void remove(E e) {
        myDecoCon.remove(e);
    }

    @Override
    public void removeAll(Collection<E> c) {
        myDecoCon.removeAll(c);
    }

    @Override
    public void print() {
        myDecoCon.print();
    }
}
