package Adapter_StackDeque;

import java.util.Deque;

public class StackAdapter<elementType> implements IStack<elementType> {

    private Deque<elementType> deque;

    public StackAdapter(Deque newDeque) {
        this.deque = newDeque;
    }

    @Override
    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    @Override
    public void push(elementType x) {
        this.deque.offerFirst(x);
    }

    @Override
    public elementType pop() {
        return this.deque.pollFirst();
    }

    @Override
    public elementType top() {
        return this.deque.peekFirst();
    }
    
    @Override
    public elementType bottom() {
        return this.deque.peekLast();
    }
    
}