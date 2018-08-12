package Decorator_Counter;

// import java.util.Collection;

public class ContainerWithAddCounter<E> extends DecoratorContainer<E> {

    private int addCounter;

    public ContainerWithAddCounter(Container<E> con) {
        super(con);
    }

    public void add(E e) {
        super.add(e);
        addCounter++;
    }

//	public void addAll(Collection<E> c) {
//		super.addAll((Collection<E>) c);
//		addCounter += c.size();
//	}
    public void print() {
        super.print();
        System.out.println("add: " + addCounter);
    }
}
